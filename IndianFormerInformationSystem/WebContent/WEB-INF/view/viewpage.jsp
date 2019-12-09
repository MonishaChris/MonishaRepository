<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View All</title>
</head>
<body style="background-color:#E6E6FA">
			<table border="1" style="width: 100%">
				<tr>
				    <th>Driver Id</th>
					<th>Driver Name</th>
					<th>Vehicle Type</th>
					<th>Location</th>
					<th>Street</th>
					<th>City</th>
					<th>State</th>
					<th>Pincode</th>
					<th>Mobile Number</th>
					<th>Edit</th>
					<th>Delete</th>
					
				</tr>
				<c:if test="${not empty Monisha}">
		<c:forEach var="n" items="${Monisha}">
				<tr>
					<td><c:out value="${n.id}" /></td>
					<td><c:out value="${n.drivername}" /></td>
					<td><c:out value="${n.vehicletype}" /></td>
					<td><c:out value="${n.mobile}" /></td>
					<td><c:out value="${n.location}" /></td>
					<td><c:out value="${n.street}" /></td>
					<td><c:out value="${n.city}" /></td>
					<td><c:out value="${n.state}" /></td>
					<td><c:out value="${n.pincode}" /></td>
				
				<td><form action="updatelink" method="post">
<button name="id" value="<c:out value="${n.id}"/>"> Edit
		
						</button>
						</form>
				</td>
				
				<td><form action="deletebyid" method="post">
		<button name="id" value="<c:out value="${n.id}"/>"> Delete
		
						</button>
							
						
					</form>
				</td>
		
			</tr>
				
</c:forEach>
	</c:if>
			</table>
 <center>
 <form action="back">
<input type="submit" value="Back"><br><br></form>
</center>
</body>
</html>