<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<html> 
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>LoginCheck.jsp</title> 
    </head> 
    <body> 
        <% 
        String username=request.getParameter("username"); 
        String password=request.getParameter("password"); 
        if((username.equals("anurag") && password.equals("jain"))) 
            {
            session.setAttribute("username",username); 
            response.sendRedirect("Home.jsp"); 
            } 
        else 
            response.sendRedirect("Error.jsp"); 
        %> 
    </body> 
</html>

Read more: http://mrbool.com/how-to-create-a-login-form-with-jsp/25685#ixzz6DYzpAE3O