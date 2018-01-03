<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rembo
  Date: 01.01.2018
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/main.css">
</head>
<body>
<table border="1">
    <tr>
        <th >name</th>
        <th>last name</th>
        <th>age</th>
        <th>email</th>
        <th>phone number</th>
        <th>location</th>
    </tr>
    <c:forEach var="client" items="${client}">
    <tr>
        <td><h3>${client.name}</h3></td>
        <td><h3>${client.lastName}</h3></td>
        <td><h3>${client.age}</h3></td>
        <td><h3>${client.email}</h3></td>
        <td><h3>${client.phoneNumber}</h3></td>
        <td><h3>${client.location}</h3></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
