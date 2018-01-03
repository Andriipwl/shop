<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rembo
  Date: 23.12.2017
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
    <link rel="stylesheet" href="/style/main.css">
</head>
<body >


<form action="/">
    <button type="submit">main</button>
</form>

<div class="log-div">
<form action="/createClient" method="post">

        <h3>name</h3> <input type="text" name="name" class="input-prod">
        <h3>last name</h3> <input type="text" name="lastName">
        <h3>age</h3> <input type="number" name="age">
        <h3>email</h3> <input type="text" name="email">
        <h3>phoneNumber</h3> <input type="text" name="phoneNumber">
        <h3>location </h3><input type="text" name="location">
        <input type="submit">
</form>
</div>
</body>
</html>
