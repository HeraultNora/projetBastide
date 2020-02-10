<%-- 
    Document   : donneesPersoEditor
    Created on : 10 févr. 2020, 14:56:25
    Author     : edupuy01
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mon compte</title>
    </head>
    <body>
        <h1>Mon compte</h1>
        
        <form method="POST">
            <input type="hidden" name="code" value='${client.code}'><br>
            <input type="text" name="societe" placeholder="Société" value='${client.societe}'><br>
            <input type="text" name="contact" placeholder="Contact" value='${client.contact}'><br>
            <input type="text" name="fonction" placeholder="Fonction" value='${client.fonction}'><br>
            <input type="text" name="adresse" placeholder="Adresse" value='${client.adresse}'><br>
            <input type="text" name="ville" placeholder="Ville" value='${client.ville}'><br>
            <input type="text" name="region" placeholder="Région" value='${client.region}'><br>
            <input type="text" name="cp" placeholder="Code Postal" value='${client.codePostal}'><br>
            <input type="text" name="pays" placeholder="Pays" value='${client.pays}'><br>
            <input type="text" name="tel" placeholder="téléphone" value='${client.telephone}'><br>
            <input type="text" name="fax" placeholder="FAX" value='${client.fax}'><br>            
        </form>
        
    </body>
</html>