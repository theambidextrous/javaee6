<%-- 
    Document   : response
    Created on : Aug 27, 2018, 7:09:16 PM
    Author     : IT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.kim2.NameHandler" />
        <jsp:setProperty name="mybean" property="name"/>
        <h1>Hi, <jsp:getProperty name="mybean" property="name" />!</h1>
    </body>
</html>
