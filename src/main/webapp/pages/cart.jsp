<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rembo
  Date: 26.12.2017
  Time: 1:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cart items</title>
    <link rel="stylesheet" href="/css/main.css">
</head>
<body>
<table cellpadding="2" cellspacing="2" border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Prise</th>
        <th>Quantity</th>
        <th>Sub Total</th>
    </tr>
    <c:forEach var="cart" items="${sessionScope.cart}">
        <tr>
            <td>${cart.product.id}</td>
            <td>${cart.product.name}</td>
            <td>${cart.product.prise}</td>
            <td>${cart.quantity}</td>
            <td>${cart.product.prise * cart.quantity}</td>
            <td align="center"><<a href="${pageContext.request.contextPath}/remove/${cart.product.id}.html">delete</a></td>
        </tr>
    </c:forEach>
</table>

<form action="/">
<input type="submit" value="Continue Shopping">
</form>

<form action="/orderNow">
    <input type="submit" value="Order now">
</form>
</body>
</html>
