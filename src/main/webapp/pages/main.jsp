<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rembo
  Date: 24.12.2017
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>Title</title>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/main.css">
<meta name="viewport"
      content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
</head>

<body>

<header>
    <a href="/sortByLowPrice">
        <div class="sort-div">Sort by low price</div>
    </a>
    <a href="/sortByHighPrice">
        <div class="sort-div">Sort by high price</div>
    </a>

    <form action="/findByName" method="post" class="search">
        <input type="text" name="name">
        <input type="submit">
    </form>

    <a href="/index"><div class="log-in">Log in</div></a>
    <a href="/cart"><div class="cart">Cart</div></a>

</header>
<main>

        <c:forEach var="findByName" items="${findByName}">
            <ul class="products ">
                <li class="product-wrapper">
                    <a href="/product/${findByName.id}" class="product">
                        <div class="product-img"></div>
                        <h3>${findByName.name}</h3>
                        <h5> Price: ${findByName.prise}</h5>
                        <form action="${pageContext.request.contextPath}/ordernow/${findByName.id}.html" class="submit-cart">
                            <input type="submit" value="До корзини">
                        </form>
                    </a>
                </li>
            </ul>
        </c:forEach>


    <c:forEach var="sortByHighPrice" items="${sortByHighPrice}">
        <ul class="products ">
            <li class="product-wrapper">
                <a href="/product/${sortByHighPrice.id}" class="product">
                    <div class="product-img"></div>
                    <h3>${sortByHighPrice.name}</h3>
                    <h5> Price: ${sortByHighPrice.prise}</h5>
                    <form action="${pageContext.request.contextPath}/ordernow/${sortByHighPrice.id}.html" class="submit-cart">
                        <input type="submit" value="До корзини">
                    </form>
                </a>
            </li>
        </ul>
    </c:forEach>


    <c:forEach var="sortByLowPrice" items="${sortByLowPrice}">
        <ul class="products ">
            <li class="product-wrapper">
                <a href="/product/${sortByLowPrice.id}" class="product">
                    <div class="product-img"></div>
                    <h3>${sortByLowPrice.name}</h3>
                    <h5> Price: ${sortByLowPrice.prise}</h5>
                    <form action="${pageContext.request.contextPath}/ordernow/${sortByLowPrice.id}.html" class="submit-cart">
                        <input type="submit" value="До корзини">
                    </form>
                </a>
            </li>
        </ul>
    </c:forEach>


    <c:forEach var="prod" items="${prod}">
       <ul class="products ">
            <li class="product-wrapper">
                <a href="/product/${prod.id}" class="product">
                    <div class="product-img"></div>
                    <h3>${prod.name}</h3>
                    <h5> Price: ${prod.prise}</h5>
                    <form action="${pageContext.request.contextPath}/ordernow/${prod.id}.html" class="submit-cart">
                        <input type="submit" value="До корзини">
                    </form>
                </a>
            </li>
        </ul>
    </c:forEach>
</main>

<footer></footer>

</body>
</html>
