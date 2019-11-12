<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Vehicle Details</title>
</head>
<body style="background-color:#F08080">
<center>
<td>Vehicle Details</td><br><br>
	<form action="Insert">
		VehicleId:  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="vehicleid"><br><br> 
		VehicleName:&nbsp&nbsp&nbsp&nbsp<input type="text" name="vehiclename"><br><br> 
		Model:&nbsp&nbsp<input type="text" name="model"> <br><br>
		Manufactured-year:&nbsp<input type="text" name="manufacturedyear"> <br><br>
		Color:&nbsp&nbsp<input type="text" name="color"> <br><br>
		Cost:&nbsp&nbsp<input type="text" name="cost"> <br><br>
		<input type="submit" value="Submit"><br><br></center><br><br>
		<a href="viewall">Click here to view all Vehicles</a><br> <br>
	</form>
	<br>
	<br> Type id which you want to delete
	<form action="delete">
		<input type="text" name="vehicleid"> 
		<input type="submit" value="delete">
	</form>
	<center>
<td>Update Vehicle Details</td>
	<form action="update"><br>
		VehicleId:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="vehicleid"><br><br> 
		VehicleName:&nbsp&nbsp&nbsp&nbsp<input type="text" name="vehiclename"><br><br> 
		Model:&nbsp<input type="text" name="model"><br><br> 
		Manufactured-year:&nbsp<input type="text" name="manufacturedyear"> <br><br>
		Color:&nbsp&nbsp<input type="text" name="color"> <br><br>
		Cost:&nbsp&nbsp<input type="text" name="cost"> <br><br>
		
		<input type="submit" value="Update"><br><br>
	</form>
	</center>
</body>
</html>