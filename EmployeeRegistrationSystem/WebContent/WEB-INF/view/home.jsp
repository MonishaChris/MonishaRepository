<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Employee Details</title>
</head>
<body style="background-color:#F08080">
<center>
<td>Employee Details</td><br><br>
	<form action="Insert">
		EmployeeId:  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="empid"><br><br> 
		EmployeeFirstName:&nbsp&nbsp&nbsp&nbsp<input type="text" name="empfirstname"><br><br> 
		EmployeeLastName:&nbsp&nbsp<input type="text" name="emplastname"> <br><br>
		EmployeeUsername:&nbsp<input type="text" name="empusername"> <br><br>
		EmployeePassword:&nbsp&nbsp<input type="text" name="emppassword"> <br><br>
		EmployeeAddress:&nbsp&nbsp<input type="text" name="empaddress"> <br><br>
		EmployeeContact:&nbsp&nbsp<input type="text" name="empcontact"> <br><br>
		<input type="submit" value="Submit"><br><br></center><br><br>
		<a href="viewall">Click here to view all Employees</a><br> <br>
	</form>
	<br>
	<br> Type id which you want to delete
	<form action="delete">
		<input type="text" name="empid"> 
		<input type="submit" value="delete">
	</form>
	<center>
<td>Update Employee Details</td>
	<form action="update"><br>
		EmployeeId:  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="empid"><br><br> 
		EmployeeFirstName:&nbsp&nbsp&nbsp&nbsp<input type="text" name="empfirstname"><br><br> 
		EmployeeLastName:&nbsp&nbsp<input type="text" name="emplastname"> <br><br>
		EmployeeUsername:&nbsp<input type="text" name="empusername"> <br><br>
		EmployeePassword:&nbsp&nbsp<input type="text" name="emppassword"> <br><br>
		EmployeeAddress:&nbsp&nbsp<input type="text" name="empaddress"> <br><br>
		EmployeeContact:&nbsp&nbsp<input type="text" name="empcontact"> <br><br>
		
		<input type="submit" value="Update"><br><br>
	</form>
	</center>
</body>
</html>