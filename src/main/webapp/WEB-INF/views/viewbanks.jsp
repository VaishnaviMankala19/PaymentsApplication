<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Your Bank Accounts</title>
    <link rel="stylesheet" href="/css/viewbanks.css">
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
	
    <div class="container">
        <h2>Your Linked Bank Accounts</h2>

        <c:if test="${not empty banks}">
            <table>
                <thead>
                    <tr>
                        <th>Bank Name</th>
                        <th>Account Number</th>
                        <th>IFSC Code</th>
                        <th>Account Type</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="bank" items="${banks}">
                        <tr>
                            <td>${bank.bankName}</td>
                            <td>${bank.accountNumber}</td>
                            <td>${bank.ifscCode}</td>
                            <td>${bank.accountType}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>

        <c:if test="${empty banks}">
            <p>No bank accounts linked yet.</p>
        </c:if>
    </div>

</body>
</html>
