<%--
  Created by IntelliJ IDEA.
  User: rembo
  Date: 02.01.2018
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/main.css">
</head>
<body>
<div class="main-div">
    <h3> <a href="/cart" >Повернутись в корзину</a></h3>
    <div class="inner-div">
            <form action="/order" method="post" >
             <h3>П.І.Б </h3><input type="text" name="FLS" class="input-style">
                <h3>E-mail</h3><input type="text" name="email" class="input-style">
               <h3>Телефон</h3> <input type="text" name="phonenumber" class="input-style">
               <h3>Адрес</h3> <input type="text" name="address" class="input-style">
                <input type="submit" class="submit" value="Замовити">
            </form>
        </div>
    </div>
</div>

</body>
</html>
