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
					<th>VehicleID</th>
					<th>VehicleName</th>
					<th>Model</th>
					<th>ManufacturedYear</th>
					<th>Color</th>
					<th>Cost</th>
				</tr>
				<c:if test="${not empty Monisha}">
		<c:forEach var="n" items="${Monisha}">
				<tr>
					<td><c:out value="${n.vehicleid}" /></td>
					<td><c:out value="${n.vehiclename}" /></td>
					<td><c:out value="${n.model}" /></td>
					<td><c:out value="${n.manufacturedyear}" /></td>
					<td><c:out value="${n.color}" /></td>
					<td><c:out value="${n.cost}" /></td>
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