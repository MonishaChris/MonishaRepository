<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Student Detail</title>
</head>
<body style="background-color:#F08080">
<center>
<td>Student Details</td><br><br>
	<form action="Insert">
		StuId:  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="stuid"><br><br> 
		StuName:&nbsp&nbsp&nbsp&nbsp<input type="text" name="stuname"><br><br> 
		StuAddress:&nbsp<input type="text" name="stuaddress"> <br><br>
		<input type="submit" value="Submit"><br><br></center><br><br>
		<a href="viewall">Click here to view all Students</a><br> <br>
	</form>
	<br>
	<br> Type id which you want to delete
	<form action="delete">
		<input type="text" name="stuid"> 
		<input type="submit" value="delete">
	</form>
	<center>
<td>Update Student Details</td>
	<form action="update"><br>
		StuId:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="stuid"><br><br> 
		StuName:&nbsp&nbsp&nbsp&nbsp<input type="text" name="stuname"><br><br> 
		StuAddress:&nbsp<input type="text" name="stuaddress"><br><br> 
		<input type="submit" value="Update"><br><br>
	</form>
	</center>
</body>
</html>