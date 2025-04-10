<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Remove Bank Account</title>
    <link rel="stylesheet" href="/css/removebank.css">
</head>
<body>
	
	
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
