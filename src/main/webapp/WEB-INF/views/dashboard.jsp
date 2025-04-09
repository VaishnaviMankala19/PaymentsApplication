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
        <img src="https://media.istockphoto.com/id/1334591614/photo/man-using-digital-tablet-online-connect-to-internet-banking-currency-exchange-online-shopping.jpg?s=612x612&w=0&k=20&c=nejA5SuHcN2fAdO7Bkaf9pJrwzyLPBCyOLZgMaslGko=" alt="Dashboard Hero">
        <div class="overlay-text">
         <h1>Welcome, ${user.fullName}</h1>




        </div>
    </section>

    <!-- Cards Section -->
    <section class="cards-container">
        <div class="card">
            <img src="https://cdn-icons-png.flaticon.com/512/1828/1828817.png" alt="Add Money">
            <h3>Add Money</h3>
            <p>Top up your wallet easily.</p>
        </div>
        <div class="card">
            <img src="https://cdn-icons-png.flaticon.com/512/2983/2983802.png" alt="Send Money">
            <h3>Send Money</h3>
            <p>Transfer funds to anyone securely.</p>
        </div>
        <div class="card">
            <img src="https://cdn-icons-png.flaticon.com/512/3126/3126551.png" alt="Transaction History">
            <h3>Transaction History</h3>
            <p>Check your past transactions.</p>
        </div>
        <div class="card">
            <img src="https://cdn-icons-png.flaticon.com/512/1055/1055646.png" alt="Add Bank">
            <h3>Add Bank</h3>
            <p>Link a new bank account.</p>
        </div>
        <div class="card">
            <img src="https://cdn-icons-png.flaticon.com/512/1828/1828843.png" alt="Remove Bank">
            <h3>Remove Bank</h3>
            <p>Unlink an existing bank account.</p>
        </div>
    </section>

</body>
</html>
