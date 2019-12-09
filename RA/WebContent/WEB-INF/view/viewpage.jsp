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
					<th>CustomerID</th>
					<th>CustomerName</th>
					<th>CustomerAddress</th>
					<th>CustomerContact</th>
					<th>OfferPackage</th>
					<th>Amount</th>
					<th>Offer</th>
					<th>PlanYear</th>
				</tr>
				<c:if test="${not empty monisha}">
		<c:forEach var="n" items="${monisha}">
				<tr>
					<td><c:out value="${n.custid}" /></td>
					<td><c:out value="${n.custname}" /></td>
					<td><c:out value="${n.custaddress}" /></td>
					<td><c:out value="${n.custcontact}" /></td>
					<td><c:out value="${n.custpackage}" /></td>
					<td><c:out value="${n.amount}" /></td>
					<td><c:out value="${n.offer}" /></td>
					<td><c:out value="${n.planyear}" /></td>
					
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