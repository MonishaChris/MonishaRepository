<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body style="background-color:#F08080">
<center>
<td>New Connection Details</td><br><br>
	<form action="Insert">
		CustomerId:  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="custid"><br><br> 
		CustomerName:&nbsp&nbsp&nbsp&nbsp<input type="text" name="custname"><br><br> 
		CustomerAddress:&nbsp&nbsp<input type="text" name="custaddress"> <br><br>
		CustomerContact:&nbsp<input type="text" name="custcontact"> <br><br>
		OfferPackage:&nbsp&nbsp<input type="text" name="custpackage"> <br><br>
		Amount:&nbsp&nbsp<input type="text" name="amount"> <br><br>
		Offer:&nbsp&nbsp<input type="text" name="offer"> <br><br>
		PlanYear:&nbsp&nbsp<input type="text" name="planyear"> <br><br>
		<input type="submit" value="Submit"><br><br></center><br><br>
		<a href="viewall">Click here to view all Details</a><br> <br></form>
	<br>
	<br> Type id which you want to delete
	<form action="delete">
		<input type="text" name="custid"> 
		<input type="submit" value="delete">
	</form>
	<center>
	<td>Update Customer Details</td>
	<form action="update"><br>
		CustomerId:  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="custid"><br><br> 
		CustomerName:&nbsp&nbsp&nbsp&nbsp<input type="text" name="custname"><br><br> 
		CustomerAddress:&nbsp&nbsp<input type="text" name="custaddress"> <br><br>
		CustomerContact:&nbsp<input type="text" name="custcontact"> <br><br>
		OfferPackage:&nbsp&nbsp<input type="text" name="custpackage"> <br><br>
		Amount:&nbsp&nbsp<input type="text" name="amount"> <br><br>
		Offer:&nbsp&nbsp<input type="text" name="offer"> <br><br>
		PlanYear:&nbsp&nbsp<input type="text" name="planyear"> <br><br>
		
		<input type="submit" value="Update"><br><br>
	</form>
	</center>
</body>
</html>