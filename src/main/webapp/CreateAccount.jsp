<%-- 
    Document   : CreateAccount
    Created on : Jan 28, 2016, 7:29:43 PM
    Author     : Lance
--%>

<%@page import="java.beans.Beans"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    <body>
        <form method="POST" action="SQLDBSample">
            First name:<br>
            <input type="text" name="fname">
            <br>
            Last name:<br>
            <input type="text" name="lname">
            <br>
            <input type="submit" value="Submit">
        </form>

    </body>
</html>
