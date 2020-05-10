<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Panier</title>
        <link rel="stylesheet" href="Caddie.css">

    </head>
    <body>
        <h1>Votre Panier</h1>

        <table border='1' id="customers">
            <tr><th>Référence</th><th>Nom</th><th>Prix Unitaire</th><th>Catégorie</th></tr>
                    <%-- Pour chaque produit, une ligne dans la table HTML --%>
            
            <c:forEach var="ligne" items="${panier.getPanierLignes}">
                    <tr>
                        <td>${ligne.produit1.reference}</td>
                        <td>${mvc.encoders.html(ligne.produit1.nom)}</td>
                        <td>${ligne.produit1.prixUnitaire}</td>
                        <td>${mvc.encoders.html(ligne.produit1.categorie.libelle)}</td>
                    </tr>
                </c:forEach>

        </table>

    </body>
</html>