<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html> 
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>Connexion</title> 
    </head> 
    <body> 
        <h1>Identification</h1>
        <form method="POST">
            id : <input type="text" name="contact"><br>
            code : <input type="password" name="code"><br>
            <input type="submit" value="Connexion">
        </form>    
        <!--<a href ="${pageContext.request.contextPath}">Retour à l'accueil</a>-->
    </body> 
</html>