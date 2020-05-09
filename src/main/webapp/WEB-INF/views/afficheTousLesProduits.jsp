<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Import des "tag libraries" de JSP -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>

    <head>
        <title>Affiche tous les produits</title>
    </head>

    <body>
        <h1>Liste des produits</h1>
        <a href="monPanier">Voir mon panier</a>
        <a href="produitsCategoriesVendus">Afficher les produits par catégorie</a>
        <form mathod="POST">
            <table border='1'>
                <tr><th>Référence</th><th>Nom</th><th>Prix Unitaire</th><th>Catégorie</th><th>Quantité</th><th>Ajouter au panier</th></tr>
                        <%-- Pour chaque produit, une ligne dans la table HTML --%>
                        <c:forEach var="produit" items="${afficheTousLesProduits}">
                    <tr>
                        <td>
                            <input type="text" name="ref" value="${produit.reference}" disabled/> 
                        </td>
                        <%-- Le nom peut contenir des caractères spéciaux HTML ! --%>
                        <td>
                            <label name="nom">${mvc.encoders.html(produit.nom)}</label>
                        </td>
                        <td>
                            <label name="prix">${produit.prixUnitaire}</label>
                        </td>
                        <td>
                            <label name="categ">${mvc.encoders.html(produit.categorie.libelle)}</label>
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
        <a href="pageClient">Retour au menu</a>
    </body>

</html>