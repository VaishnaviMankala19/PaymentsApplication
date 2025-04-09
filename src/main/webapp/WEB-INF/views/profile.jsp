<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>User Profile</title>
    <link rel="stylesheet" href="/css/profile.css">
</head>
<body>

<nav class="navbar">
    <div class="nav-left">
        <h1>Payments App</h1>
    </div>
    <div class="nav-right">
        <a href="/dashboard">Dashboard</a>
        <a href="/editprofile">Edit Profile</a>
        <a href="/logout">Logout</a>
    </div>
</nav>
<button class="back-btn" onclick="history.back()">← Back</button>

<div class="profile-container">
    <h2>Your Profile</h2>
    <p><strong>Full Name:</strong> ${user.fullName}</p>
    <p><strong>Email:</strong> ${user.email}</p>
    <p><strong>Phone:</strong> ${user.phone}</p>
</div>

</body>
</html>
