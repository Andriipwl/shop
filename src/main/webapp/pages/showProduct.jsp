<%--
  Created by IntelliJ IDEA.
  User: rembo
  Date: 01.01.2018
  Time: 18:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/main.css">
</head>
<body>
                <div class="product-show">
                <h3>Name ${findOne.name}</h3>
                <h5>Price: ${findOne.prise}</h5>
                <h5>Description ${findOne.description}</h5>
                <a class="aa" href="${pageContext.request.contextPath}/ordernow/${findOne.id}.html">Order now</a>
                </div>

</body>
</html>
