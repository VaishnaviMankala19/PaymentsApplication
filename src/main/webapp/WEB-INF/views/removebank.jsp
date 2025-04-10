<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Remove Bank Account</title>
    <link rel="stylesheet" href="/css/removebank.css">
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
	
    <h2>Your Linked Bank Accounts</h2>
    <c:forEach var="bank" items="${banks}">
        <div class="bank-card">
            <p><strong>Bank:</strong> ${bank.bankName}</p>
            <p><strong>Account No:</strong> ${bank.accountNumber}</p>
            <p><strong>IFSC:</strong> ${bank.ifscCode}</p>
            <p><strong>Type:</strong> ${bank.accountType}</p>
            <form method="post" action="/removebank/${bank.id}">
                <button type="submit">Remove</button>
            </form>
        </div>
    </c:forEach>
</body>
</html>
