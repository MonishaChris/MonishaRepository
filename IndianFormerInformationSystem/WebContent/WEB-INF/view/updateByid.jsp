<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${viewList}" var="n">
<form action="update">
<input type="hidden" name="id" value="<c:out value="${n.id}" />">
	Driver Name <input type="text" name="drivername" value="<c:out value="${n.drivername}" />"><br>
	Vehicle Type<input type="text" name="vehicletype" value="<c:out value="${n.vehicletype}" />"><br>
	Mobile Number<input type="text" name="mobile" value="<c:out value="${n.mobile}" />"><br>
	Location<input type="text" name="location" value="<c:out value="${n.location}" />"><br>
	Street<input type="text" name="street" value="<c:out value="${n.street}" />"><br>
	City<input type="text" name="city" value="<c:out value="${n.city}" />"><br>
	State<input type="text" name="state" value="<c:out value="${n.state}" />"><br>
	Pin code<input type="text" name="pincode" value="<c:out value="${n.pincode}" />"><br>
	<input type="submit" value="Submit">
</form>
</c:forEach>
</body>
</html>