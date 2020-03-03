<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<html> 
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>LoginCheck.jsp</title> 
    </head> 
    <body> 
        <% 
        String username=request.getParameter("id"); 
        String password=request.getParameter("mdp"); 
        if((username.equals('${client.code}') && password.equals('${client.contact}'))) 
            {
            session.setAttribute("id",id); 
            response.sendRedirect("client.jsp"); 
            } 
        if((username.equals("Administrateur") && password.equals("Code"))) 
            {
            session.setAttribute("id",id); 
            response.sendRedirect("administrateur.jsp"); 
            } 
        %> 
    </body> 
</html>

Read more: http://mrbool.com/how-to-create-a-login-form-with-jsp/25685#ixzz6DYzpAE3O