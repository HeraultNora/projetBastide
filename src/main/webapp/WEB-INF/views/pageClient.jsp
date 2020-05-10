<%-- 
    Document   : client
    Created on : 10 févr. 2020, 16:21:38
    Author     : Nora
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>client</title>
    </head>
    <body>
        <h1>Plateforme Client</h1>
            <nav>
                <ul>
                    <li><a href="showAllCommandes">Visualiser mes commandes</a></li>
                    <li><a href="afficheTousLesProduits">Catalogue des articles</a></li>
                    <li><a href="monPanier">Panier</a></li>	
                    <li><a href="mesDonnees">Mes données</a></li>
                    <li><a href="${pageContext.request.contextPath}">Se déconnecter</a></li>
                </ul>
            </nav>
            
    </body>
</html>
