<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<h2><center><u>Product List</u></center></h2>
<hr>
<div class="container">
    <table class="table">
        <thead>
        <tr>
            <th>NAME</th>
            <th>CATEGORY</th>
            <th>PRICE</th>
            <th>STATUS</th>
            <th>DESCRIPTION</th>
            <th>MANYFACTORS</th>
            <th></th>
        </tr>
        </thead>
        <c:forEach items="${products}">
            <tr>
                <td>${product.name}</td>
                <td>${product.category}</td>
                <td>${product.price} Rls</td>
                <td>${product.status}</td>
                <td>${product.description}</td>
                <td>${product.manyFactors}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
