<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
	<form:form method="post" action="calculate">
		<table border="1" align="center">
			<tr>
				<td>Item
					Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				
				<td><form:select name="item" style="width: 200px;" path="itemName">
						<option value="">-select-</option>
						<option>HP Laptop</option>
						<option>Dell Laptop</option>
						<option>Compaq</option>
					</form:select>
			</tr>
			<tr>
				<td>Quantity
				<td><form:select name="quantity" style="width: 200px;" path="itemQty">
						<option value="">-select-</option>
						<option>1</option>
						<option>2</option>
						<option>3</option>
				</form:select>
			</tr>
			<tr>
				<td colspan="2" align="middle"><input type="submit" value="Calculate" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>