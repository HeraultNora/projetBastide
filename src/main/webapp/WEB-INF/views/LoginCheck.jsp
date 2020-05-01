<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html> 
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>Log in</title> 
    </head> 
    <body> 
        <h1>Indentification</h1>
        <form method="POST">
            id : <input type="text" name="contact"><br>
            code : <input type="password" name="code"><br>
            <input type="submit" value="Connexion">
        </form>    
        <a href ="${pageContext.request.contextPath}">testtest</a>
    </body> 
</html>

Read more: http://mrbool.com/how-to-create-a-login-form-with-jsp/25685#ixzz6DYzpAE3O