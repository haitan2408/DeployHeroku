<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 27/03/2019
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert USD</title>
</head>
<body>
<form method="post" action="/index">
    <h1>Convert USD</h1>
    <fieldset>
        <legend>Convert information</legend>
        <table>
            <tr>
                <td>USD</td>
                <td><input type="text" name="usd" id="usd"></td>
            </tr>
            <tr>
                <td>Rate:</td>
                <td><input type="text" name="rate" id="rate"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Convert"></td>
            </tr>
        </table>
    </fieldset>
</form>
</center>
</body>
</html>
