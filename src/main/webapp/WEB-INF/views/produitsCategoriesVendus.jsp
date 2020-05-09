<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Produits dans la catégorie ${selected.libelle}</title>
    </head>

    <body>
        <a href="monPanier">Voir mon panier</a>
        <a href="afficheTousLesProduits">Afficher tous les produits</a>
        <h3>Choisissez la catégorie à afficher</h3>
        <form> 	
            <%-- L'action par défaut est de revenir à l'URL du contrôleur --%>
            <%-- Une liste de choix pour le paramètre 'code' --%>
            <select name='code' onchange='this.form.submit()'>

                <%-- On parcourt la liste des catégories en mettant une option pour chaque catégorie --%>
                <c:forEach var="categorie" items="${categories}">
                    <%-- la valeur de l'option c'est le code de la catégorie --%>
                    <option value='${categorie.code}' 
                            <%--On détermine quelle est l'option sélectionnée dans la liste --%>
                            <c:if test="${categorie.code eq selected.code}">
                                selected
                            </c:if>
                            > <%-- le texte affiché pour l'option c'est le libellé de la catégorie --%>
                        ${categorie.libelle}
                    </option>
                </c:forEach>
            </select>
        </form>
        <h2>Produits dans la catégorie ${selected.libelle}</h2>
        <%-- On montre la liste des produits dans la catégorie sélectionnée sous la forme d'une table HTML --%>		
        <form method="POST">
            <table border='1'>
                <tr><th>Référence</th><th>Nom</th><th>Quantité</th><th>Ajouter au panier</th></tr>
                        <%-- Est-ce qu'il y a des produits dans la catégorie sélectionnée ? --%>
                        <c:if test="${empty selected.produitCollection}">
                    <tr><td colspan="3">aucun produit dans cette catégorie</td></tr>	
                </c:if>
                <%-- Une ligne dans la table pour chaque produit --%>				
                <c:forEach var="produit" items="${selected.produitCollection}">
                    <tr>
                        <td>
                            <input type="text" name="ref" value="${produit.reference}" disabled/> 
                        </td>
                        <td>
                            <label name="nomPdt">${mvc.encoders.html(produit.nom)}</label>
                        </td>
                        <td>
                            <input type="number" name="qte" min="0">
                        </td>
                        <td>
                            <input type="submit" value="Ajouter">
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </form>
        <hr>
        <a href="pageClient">Retour au menu</a>
        <hr>	
</html>