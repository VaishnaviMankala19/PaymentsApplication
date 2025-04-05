<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
<h1>REGISTER PAGE</h1>
<h2>Register</h2>

<form action="/register" method="post">
    Name: <input type="text" name="name"/><br/>
    Email: <input type="email" name="email"/><br/>
    Password: <input type="password" name="password"/><br/>
    Phone: <input type="text" name="phone"/><br/>
    <button type="submit">Register</button>
</form>

<c:if test="${not empty message}">
    <p style="color:green">${message}</p>
</c:if>
<c:if test="${not empty error}">
    <p style="color:red">${error}</p>
</c:if>

</body>
</html>
