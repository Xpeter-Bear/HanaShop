<%-- 
    Document   : Loginpage
    Created on : Jan 8, 2021, 5:28:26 PM
    Author     : Modern 15
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Login Page</h1> <br/><br/>
    <form action="LoginServlet" method="POST" >
        USER ID : <input type="text" name="UserID" value="" /><br/><br/>
        PassWord: <input type="password" name="password" value="" />
        <br/><br/>
        <input type="submit" value="Login"/>
    </form>
    </body>
</html>
