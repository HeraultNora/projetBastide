
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
            <table>
                <input type="hidden" name="code" value='${client.code}'>
                <tr>
                    <td> <label for="name"> Société: </label> </td>
                    <td> <input type="text" name="societe" placeholder="Société" value='${client.societe}'></td>
                </tr>
                <tr>
                    <td> <label for="name"> Contact: </label></td>
                    <td> <input type="text" name="contact" placeholder="Contact" value='${client.contact}'></td>
                </tr>
                <tr>
                    <td> <label for="name"> Fonction: </label></td>
                    <td> <input type="text" name="fonction" placeholder="Fonction" value='${client.fonction}'></td>
                </tr>
                <tr>
                    <td> <label for="name"> Adresse: </label></td>
                    <td> <input type="text" name="adresse" placeholder="Adresse" value='${client.adresse}'></td>
                </tr>
                <tr>
                    <td> <label for="name"> Ville: </label></td>
                    <td> <input type="text" name="ville" placeholder="Ville" value='${client.ville}'></td>
                </tr>
                <tr>
                    <td> <label for="name"> Région: </label></td>
                    <td><input type="text" name="region" placeholder="Région" value='${client.region}'></td>
                </tr>
                <tr>
                    <td> <label for="name"> Code postal: </label></td>
                    <td> <input type="text" name="cp" placeholder="Code Postal" value='${client.codePostal}'></td>
                </tr>
                <tr>
                    <td><label for="name"> Pays: </label></td>
                    <td> <input type="text" name="pays" placeholder="Pays" value='${client.pays}'></td>
                </tr>
                <tr>
                    <td> <label for="name"> Téléphone: </label></td>
                    <td> <input type="text" name="tel" placeholder="téléphone" value='${client.telephone}'></td>
                </tr>
                <tr>
                    <td> <label for="name"> FAX: </label></td>
                    <td> <input type="text" name="fax" placeholder="FAX" value='${client.fax}'></td>
                </tr>
            </table>
            <br>
            <input type="submit" name="nom" value="Valider">

        </form>

    </body>
</html>