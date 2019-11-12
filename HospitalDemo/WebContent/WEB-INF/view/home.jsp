<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Hospital Details</title>
</head>
<body style="background-color:#F08080">
<center>
<td>Hopital Details</td><br><br>
	<form action="Insert">
		PatientId:  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="patientid"><br><br> 
		PatientName:&nbsp&nbsp&nbsp&nbsp<input type="text" name="patientname"><br><br> 
		PatientAddress:&nbsp&nbsp<input type="text" name="address"> <br><br>
		PatientContact:&nbsp<input type="text" name="contact"> <br><br>
		Disease:&nbsp&nbsp<input type="text" name="disease"> <br><br>
		DoctorId:&nbsp&nbsp<input type="text" name="doctorid"> <br><br>
		DoctorName:&nbsp&nbsp<input type="text" name="doctorname"> <br><br>
		<input type="submit" value="Submit"><br><br></center><br><br>
		<a href="viewall">Click here to view all Details</a><br> <br>
	</form>
	<br>
	<br> Type id which you want to delete
	<form action="delete">
		<input type="text" name="patientid"> 
		<input type="submit" value="delete">
	</form>
	<center>
<td>Update Hospital Details</td>
	<form action="update"><br>
		PatientId:  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="patientid"><br><br> 
		PatientName:&nbsp&nbsp&nbsp&nbsp<input type="text" name="patientname"><br><br> 
		PatientAddress:&nbsp&nbsp<input type="text" name="address"> <br><br>
		PatientContact:&nbsp<input type="text" name="contact"> <br><br>
		Disease:&nbsp&nbsp<input type="text" name="disease"> <br><br>
		DoctorId:&nbsp&nbsp<input type="text" name="doctorid"> <br><br>
		DoctorName:&nbsp&nbsp<input type="text" name="doctorname"> <br><br>
		
		<input type="submit" value="Update"><br><br>
	</form>
	</center>
</body>
</html>