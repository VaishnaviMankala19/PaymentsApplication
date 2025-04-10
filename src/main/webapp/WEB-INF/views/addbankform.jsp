<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Bank Account</title>
    <link rel="stylesheet" href="/css/addbankform.css">
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

    <button class="back-btn" onclick="history.back()">← Back</button>

    <div class="main-content">
        <div class="card">
            <h2>Add Bank Account</h2>
            <form action="add-bank" method="post">
                <label>Bank Name:</label>
                <input type="text" name="bankName" required />

                <label>Account Number:</label>
                <input type="text" name="accountNumber" required />

                <label>IFSC Code:</label>
                <input type="text" name="ifscCode" required />

                <label>Account Type:</label>
                <input type="text" name="accountType" required />

                <button type="submit">Add Bank</button>
            </form>
        </div>
    </div>

</body>
</html>
