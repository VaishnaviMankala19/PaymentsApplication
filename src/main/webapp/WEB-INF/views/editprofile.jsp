<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Edit Profile</title>
    <link rel="stylesheet" href="/css/profile.css">
</head>
<body>

<nav class="navbar">
    <div class="nav-left">
        <h1>Payments App</h1>
    </div>
    <div class="nav-right">
        <a href="/dashboard">Dashboard</a>
        <a href="/logout">Logout</a>
    </div>
</nav>

<div class="profile-container">
    <h2>Edit Profile</h2>
    <form action="/updateProfile" method="post">
        <input type="hidden" name="id" value="${user.id}" />
        <label>Full Name:</label>
        <input type="text" name="name" value="${user.name}" required /><br/>
        <label>Email:</label>
        <input type="email" name="email" value="${user.email}" required /><br/>
        <label>Phone:</label>
        <input type="text" name="phone" value="${user.phone}" required /><br/>
        <button type="submit">Update Profile</button>
    </form>
</div>

</body>
</html>
