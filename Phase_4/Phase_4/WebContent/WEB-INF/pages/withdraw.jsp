<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h2>Payment</h2>
<table>
<form:form action="withdrawAmount" method="post"  modelAttribute="customer1">
<tr>
<td>
Enter mobile number:
</td>
<td><form:input path="mobileNo"/>
</td>
</tr>
<tr>
<td>
Enter amount to be withdrawn:
</td>
<td><form:input path="wallet.balance"/>
</td>
</tr>
<tr><td><input type="submit" value="Withdraw" /></td></tr></form:form>
</table>
</body>
</html>