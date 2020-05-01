<%-- 
    Document   : mesDonnees
    Created on : 1 mai 2020, 10:39:21
    Author     : Emma
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
        <h1>Mes données</h1>

        <form method="POST">
            <table>
                <input type="hidden" name="code" value='${client.code}'>
                <tr>
                    <td> <label for="name"> Société: </label> </td>
                    <td> <input type="text" name="societe" placeholder="Société" value='${client.societe}' disabled="disabled"></td>
                </tr>
                <tr>
                    <td> <label for="name"> Contact: </label></td>
                    <td> <input type="text" name="contact" placeholder="Contact" value='${client.contact}' disabled="disabled"></td>
                </tr>
                <tr>
                    <td> <label for="name"> Fonction: </label></td>
                    <td> <input type="text" name="fonction" placeholder="Fonction" value='${client.fonction}' disabled="disabled"></td>
                </tr>
                <tr>
                    <td> <label for="name"> Adresse: </label></td>
                    <td> <input type="text" name="adresse" placeholder="Adresse" value='${client.adresse}' disabled="disabled"></td>
                </tr>
                <tr>
                    <td> <label for="name"> Ville: </label></td>
                    <td> <input type="text" name="ville" placeholder="Ville" value='${client.ville}' disabled="disabled"></td>
                </tr>
                <tr>
                    <td> <label for="name"> Région: </label></td>
                    <td><input type="text" name="region" placeholder="Région" value='${client.region}' disabled="disabled"></td>
                </tr>
                <tr>
                    <td> <label for="name"> Code postal: </label></td>
                    <td> <input type="text" name="cp" placeholder="Code Postal" value='${client.codePostal}' disabled="disabled"></td>
                </tr>
                <tr>
                    <td><label for="name"> Pays: </label></td>
                    <td> <input type="text" name="pays" placeholder="Pays" value='${client.pays}' disabled="disabled"></td>
                </tr>
                <tr>
                    <td> <label for="name"> Téléphone: </label></td>
                    <td> <input type="text" name="tel" placeholder="téléphone" value='${client.telephone}' disabled="disabled"></td>
                </tr>
                <tr>
                    <td> <label for="name"> FAX: </label></td>
                    <td> <input type="text" name="fax" placeholder="FAX" value='${client.fax}' disabled="disabled"></td>
                </tr>
            </table>
            <br>
            <a  href="mvc/donneesPersoEditor"><input type="button" name="nom" value="Modifier mes données" href="mvc/donneesPersoEditor"></a>

        </form>

    </body>
</html>