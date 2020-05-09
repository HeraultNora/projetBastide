
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mes commandes</title>
    </head>
    <body>
        <h1>Vos commandes</h1>
        <table border='1'>
            <tr><th>Numéro</th><th>Saisie le</th><th>nb. lignes</th></tr>
                    <%-- Pour chaque commande, une ligne dans la table HTML --%>
            <c:forEach var="commande" items="${client.commandeCollection}">
                <tr>
                    <td>${commande.numero}</td>
                    <td>${commande.saisieLe}</td>
                    <td>${commande.ligneCollection.size()}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
