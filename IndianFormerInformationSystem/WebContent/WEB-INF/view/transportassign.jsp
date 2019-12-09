
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<%@page isELIgnored="false" %>
<title>IFIS | Transport Allocation</title>
<meta charset="utf-8">
<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
<script src="<c:url value="/resources/js/jquery-1.7.1.min.js"/>"></script>
<script src="<c:url value="/resources/js/superfish.js"/>"></script>
<script src="<c:url value="/resources/js/jquery.easing.1.3.js"/>"></script>
<script src="<c:url value="/resources/js/tms-0.4.1.js"/>"></script>
<script src="<c:url value="/resources/js/slider.js"/>" ></script>
<!--[if lt IE 9]>
<script src="js/html5.js"></script>
<link rel="stylesheet" href="css/ie.css"> 
<![endif]-->
</head>
<body>
<div class="main-bg">
  <!-- Header -->
  <header>
    <div class="inner">
      <h1><a href="home">IFIS</a></h1>
      <nav>
        <ul class="sf-menu">
          <li><a href="home">home</a></li>
          
               <li> <a href="adminpage">Go Back</a></li>
               
          
          
        </ul>
      </nav>
      <div class="clear"></div>
    </div>
  </header>
  <!-- Content -->
  <section id="content">
    <div class="container_24">
      <div class="wrapper">
        <div class="grid_24 content-bg">
          <div class="wrapper">
            <article class="grid_22 suffix_1 prefix_1 alpha omega">
              <h2>Transport Allocation:</h2>
              <div class="wrapper indent-bot">

	 <form action="retrievetransport" method="post">
	<P align=right>
	Search by location:
		<select name="city">
		<option value="Select any one" selected>Select any one
				</option>
		<option value="chennai" >Chennai
				</option>
			<option value="Madurai">Madurai</option>
			<option value="Virudhunagar">Virudhunagar</option>
			<option value="Coimbatore">Coimbatore</option>

		</select>
		<input type="submit" value="Submit">
	</P>
	</form>
              <center>
              
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
					
					
				</tr>
				<c:if test="${not empty transport}">
		<c:forEach var="n" items="${transport}">
				<tr>
				<td><form action="assigned"><input name="id" type="submit" value="${n.id }"></form></td>
					<td ><c:out value="${n.drivername}" /></td> 
					<td><c:out value="${n.vehicletype}" /></td>
					<td><c:out value="${n.location}" /></td>
					<td><c:out value="${n.street}" /></td>
					<td><c:out value="${n.city}" /></td>
					<td><c:out value="${n.state}" /></td>
					<td><c:out value="${n.pincode}" /></td>
					<td><c:out value="${n.mobile}" /></td>
					
				</tr>
</c:forEach>
	</c:if>
			</table>
	</center>


 </article>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- Footer -->
  <footer>
    <div class="container_24">
      <div class="wrapper">
        <div class="grid_24 footer-bg">
          <div class="hr-border-2"></div>
          <div class="wrapper">
            <div class="grid_7 suffix_1 prefix_1 alpha">
              <div class="copyright"> &copy; 2012 <strong class="footer-logo">IFIS</strong>
               
              </div>
            </div>
            <div class="grid_4">
              <h5 class="heading-1">Archives:</h5>
              <ul class="footer-list">
                <li><a href="#">October 2012</a></li>
                <li><a href="#">September 2012</a></li>
                <li><a href="#">August 2012</a></li>
                <li><a href="#">July 2012</a></li>
              </ul>
            </div>
            <div class="grid_4">
              <h5 class="heading-1">Links:</h5>
              <ul class="footer-list">
                <li><a href="#">Documentation</a></li>
                <li><a href="#">Plugins</a></li>
                <li><a href="#">Suggest Ideas</a></li>
                <li><a href="#">Support Forum</a></li>
              </ul>
            </div>
            <div class="grid_4">
              <h5 class="heading-1">Support:</h5>
              <ul class="footer-list">
                <li><a href="#">Special Proposition</a></li>
                <li><a href="#">Free Phone</a></li>
                <li><a href="#">Solutions</a></li>
              </ul>
            </div>
            <div class="grid_2 suffix_1 omega">
              <ul class="social-list">
                 <li><a href="#"><img src="<c:url value="/resources/images/social-icon-1.png"/>" alt=""></a></li>
                <li><a href="#"><img src="<c:url value="/resources/images/social-icon-2.png"/>" alt=""></a></li>
                <li><a href="#"><img src="<c:url value="/resources/images/social-icon-3.png"/>" alt=""></a></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
  </footer>
</div>
</body>
</html>

</body>
</html>