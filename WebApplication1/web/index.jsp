<%-- 
    Document   : index
    Created on : Aug 24, 2018, 1:23:15 PM
    Author     : IT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>KIM</title>
    </head>
    <body>
        <h1>Welcome to KIM Counseling</h1>
        <table border="1">
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
                                <option></option>
                                <option></option>
                            </select>
                            <input type="submit" value="submit" name="submit" />
                        </form>
                    </td>
                </tr>
            </tbody>
        </table>

    </body>
</html>
