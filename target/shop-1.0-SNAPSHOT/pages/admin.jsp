<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rembo
  Date: 23.12.2017
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/main.css">
</head>

<body>

<form action="/showAllClient">
    <button type="submit">Show Clients</button>
</form>

<form action="/showAllProduct">
    <button type="submit">Show products</button>
</form>


<div>
    <form action="/createProduct" method="post">
        <h4>name</h4>       <input type="text" name="name" class="input-prod">
        <h4>prise</h4>      <input type="number" name="price" class="input-prod">
        <h4>description</h4><input type="text" name="description"class="input-prod">
        <h4>count</h4>      <input type="number" name="count" class="input-prod">
        <input type="submit">
    </form>
</div>

<table border="1">
    <tr>
        <th >id</th>
        <th>name</th>
        <th>price</th>
        <th>description</th>
        <th>count</th>
        <th>category</th>
        <th><a href>delete</a></th>
    </tr>
    <c:forEach var="product" items="${product}">
    <tr>
        <td><h3>${product.id}</h3></td>
        <td><h3>${product.name}</h3></td>
        <td><h3>${product.prise}</h3></td>
        <td><h3>${product.description}</h3></td>
        <td><h3>${product.count}</h3></td>
        <td><h3>${product.category}</h3></td>
    </tr>
    </c:forEach>


</body>
</html>
