<%-- 
    Document   : admin
    Created on : 3 mars 2020, 14:28:16
    Author     : Nora
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>administrateur</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Plateforme administrateur</h1>
            <ul>
                <li><a href="creationProduit.jsp">Créer un produit</a></li>
                <li><a href="categorieEditor.jsp">Créer une categorie</a></li>
                <li><a href="statsClients">CA par clients</a></li>
                <li><a href="statsProduitsPArCategorie">CA articles par categories</a></li>
                <li><a href="statsPays">CA par pays</a></li>
                <li><a href="statsParCategorie">CA par categories</a></li>
                <li><a href="${pageContext.request.contextPath}">Se déconnecter</a></li>
            </ul>
 
        <h2>Période</h2>
        
    </body>
</html>
