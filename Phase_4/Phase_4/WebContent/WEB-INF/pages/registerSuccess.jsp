<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body >

<div align="center">
<h2>Payment</h2>
Hello ${successObject.name}<br>

Your account has been successfully created for the number ${successObject.mobileNo}<br>

Your account balance is: ${successObject.wallet.balance}<br>
<br>
<a href="menu">Go Back</a>
</div>

</body>
</html>