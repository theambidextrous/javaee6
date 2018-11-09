<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : index
    Created on : Aug 24, 2018, 1:23:15 PM
    Author     : IT
--%>
<sql:query var="subjects" dataSource="jdbc/KIM">
    SELECT subject_id, name FROM Subject
</sql:query>
    
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>KIM</title>
        <link rel="stylesheet" type="text/css" href="style.css">

    </head>
    <body>
        <h1>Welcome to KIM Counseling</h1>
        <table border="0">
            <thead>
                <tr>
                    <th>Welcome to KIM</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>To view members contacts, choose a topic below</td>
                </tr>
                <tr>
                    <td>
                        <form action="response.jsp">
                            <strong>Select a subject:</strong>
                            <select name="subject_id">
                                <c:forEach var="row" items="${subjects.rows}">
                                    <option value="${row.subject_id}">${row.name}</option>
                                </c:forEach>
                            </select>
                            <input type="submit" value="submit" name="submit" />
                        </form>
                    </td>
                </tr>
            </tbody>
        </table>

    </body>
</html>
