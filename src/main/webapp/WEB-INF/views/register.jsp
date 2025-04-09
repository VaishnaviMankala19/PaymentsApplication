<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register</title>
    <link rel="stylesheet" type="text/css" href="/css/styles.css">
</head>
<body>

<div class="auth-container">
	<button class="back-btn" onclick="history.back()">← Back</button>

    <div class="auth-card">
        <h2>Register</h2>
        <form action="/register" method="post">
            <input type="text" name="fullName" placeholder="Full Name" required><br/>
            <input type="email" name="email" placeholder="Email" required><br/>
            <input type="password" name="password" placeholder="Password" required><br/>
            <input type="text" name="phone" placeholder="Phone Number" required><br/>
            <button type="submit">Register</button>
            <p class="switch-link"">
    			Already registered?
    			<a href="/login">Login here</a>
			</p>
            
        </form>
        
       
 <c:if test="${not empty message}">
            <p class="success">${message}</p>
        </c:if>
        <c:if test="${not empty error}">
            <p class="error">${error}</p>
        </c:if>
    </div>
    
</div>

</body>
</html>
