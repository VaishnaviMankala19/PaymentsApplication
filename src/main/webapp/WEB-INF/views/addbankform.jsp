<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Bank Account</title>
    <link rel="stylesheet" href="css/addbankform.css">
</head>
<body>
<div class="card">
	
    <h2>Add Bank Account</h2>
    <form action="add-bank" method="post">
        <label>Bank Name:</label>
        <input type="text" name="bankName" required /><br/>

        <label>Account Number:</label>
        <input type="text" name="accountNumber" required /><br/>

        <label>IFSC Code:</label>
        <input type="text" name="ifscCode" required /><br/>

        <label>Account Type:</label>
        <input type="text" name="accountType" required /><br/>

        <button type="submit">Add Bank</button>
    </form>
</div>
</body>
</html>
