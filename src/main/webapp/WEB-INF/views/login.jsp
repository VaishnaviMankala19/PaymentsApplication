<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="/css/styles.css">
</head>
<body>

<div class="auth-container">
	<button class="back-btn" onclick="history.back()">← Back</button>

    <div class="auth-card">
        <h2>Login</h2>
        <form action="/login" method="post">
            <input type="email" name="email" placeholder="Email" required><br/>
            <input type="password" name="password" placeholder="Password" required><br/>
            <button type="submit">Login</button>
        </form>
		
		<div class="switch-link">
		    <c:choose>
		        <c:when test="${pageContext.request.servletPath eq '/register'}">
		            Already have an account? <a href="/login">Login</a>
		        </c:when>
		        <c:otherwise>
		            Don’t have an account? <a href="/register">Register</a>
		        </c:otherwise>
		    </c:choose>
		</div>
        <c:if test="${not empty error}">
            <p class="error">${error}</p>
        </c:if>

        <c:if test="${not empty message}">
            <p class="success">${message}</p>
        </c:if>
    </div>
</div>

</body>
</html>
