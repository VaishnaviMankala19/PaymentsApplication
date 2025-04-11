<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Money</title>
    <link rel="stylesheet" href="/css/addmoney.css">
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

<div class="card">
    <h2>Add Money</h2>
    <form action="/addmoney" method="post">
        <label>Amount:</label>
        <input type="number" name="amount" min="1" required /><br/>
        <button type="submit">Add</button>
    </form>
</div>
</body>
</html>