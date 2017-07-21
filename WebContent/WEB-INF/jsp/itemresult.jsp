<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
	<table border="1" align="center">
		<tr>
			<td>Item Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<td>${itemModel.getItemName()}
		</tr>
		<tr>
			<td>Item Price
			<td>${itemModel.getPrice()}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		</tr>
		<tr>
			<td>GST
			<td>${itemModel.getGstPrice()}
		</tr>
		<tr>
			<td>Total
			<td>${itemModel.getFinalTotal()}
		</tr>
	</table>
</body>
</html>