<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <link rel="stylesheet" href="/css/dashboard.css">
</head>
<body>

    <!-- Navbar -->
    <nav class="navbar">
        <div class="nav-left">
            <h1>Payments App</h1>
        </div>
        <div class="nav-right">
            <a href="/profile">Profile</a>
            <a href="/logout">Logout</a>
        </div>
    </nav>

    <!-- Hero Section -->
    <section class="hero">
        <img src="" alt="Dashboard Hero">
        <div class="overlay-text">
            <h2>Welcome, <c:out value="${sessionScope.loggedInUser.name}" /></h2>

        </div>
    </section>

    <!-- Cards Section -->
    <section class="cards-container">
        <div class="card">
            <img src="" alt="Add Money">
            <h3>Add Money</h3>
            <p>Top up your wallet easily.</p>
        </div>
        <div class="card">
            <img src="/images/send-money.png" alt="Send Money">
            <h3>Send Money</h3>
            <p>Transfer funds to anyone securely.</p>
        </div>
        <div class="card">
            <img src="" alt="Transaction History">
            <h3>Transaction History</h3>
            <p>Check your past transactions.</p>
        </div>
        <div class="card">
            <img src="" alt="Add Bank">
            <h3>Add Bank</h3>
            <p>Link a new bank account.</p>
        </div>
        <div class="card">
            <img src="" alt="Remove Bank">
            <h3>Remove Bank</h3>
            <p>Unlink an existing bank account.</p>
        </div>
    </section>

</body>
</html>
