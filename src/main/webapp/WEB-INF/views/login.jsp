<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<h1>LOGIN PAGE</h1>

<form action="/login" method="post">
    Email: <input type="email" name="email"/><br/>
    Password: <input type="password" name="password"/><br/>
    <button type="submit">Login</button>
</form>

<c:if test="${not empty error}">
    <p style="color:red">${error}</p>
</c:if>

<c:if test="${not empty message}">
    <p style="color:green">${message}</p>
</c:if>

</body>
</html>
