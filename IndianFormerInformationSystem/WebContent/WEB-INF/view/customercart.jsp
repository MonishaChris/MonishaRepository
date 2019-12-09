<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<style>
table, td, th {
	border: 1px solid black;
	text-align: left;
}

table {
	border-collapse: collapse;
	width: 100%;
}

th, td {
	padding: 15px;
}
</style>
<script type="text/javascript">
	function calculatePrice() {
		var price = $("#fprice").val();

		var total = price + price;

		$("#sum").val(total);
	}
</script>
<%@page isELIgnored="false"%>
<title>IFIS | CustomerInvoice</title>
<meta charset="utf-8">
<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
<script src="<c:url value="/resources/js/jquery-1.7.1.min.js"/>"></script>
<script src="<c:url value="/resources/js/superfish.js"/>"></script>
<script src="<c:url value="/resources/js/jquery.easing.1.3.js"/>"></script>
<script src="<c:url value="/resources/js/tms-0.4.1.js"/>"></script>
<script src="<c:url value="/resources/js/slider.js"/>"></script>
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
				<h1>
					<a href="home">IFIS</a>
				</h1>
				<nav>
					<ul class="sf-menu">
						<li class="current"><a href="home">home</a></li>



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

							<article class="grid_15 suffix_1 omega">
							<center>	<h2>Invoice</h2></center>
								<div class="wrapper">
									<form action="buynow" method="post">
										<font color="white">


											<table border="3" style="width: 100%">
												<tr>
													<td>Customer Id:</td>
													<td><c:forEach var="b" items="${cart}" end="0">
								<c:out value="${b.customerid }"/>
																
														</c:forEach></td>
												</tr>


												<tr>

													<td>Product Type:</td>
													<td><c:forEach var="b" items="${cart}" end="0">
															<c:out value="${b.type }"/>
															
														</c:forEach></td>
												</tr>




												<tr>
													<td>Product Name:</td>
													<td><c:forEach var="b" items="${cart}" end="0">
															
												<c:out value="${b.productname }"/>
															
														</c:forEach></td>
												</tr>


												<tr>
													<td>Quantity:</td>
													<td><c:forEach var="b" items="${cart}" end="0">
															
															<c:out value="${b.quantity }"/>
														</c:forEach></td>
												</tr>


												<tr>
													<td>Rate:</td>
													<td><c:forEach var="b" items="${cart}" end="0">
															<c:out value="${b.rate }"/>
															
														</c:forEach></td>
												</tr>
												<tr>
													<td>Grand Total:</td>
													<td><c:forEach var="b" items="${cart}" end="0">
															
															
														<b>	<c:out value="${b.total }"/></b>	
																
														</c:forEach></td>
												</tr>

												
											</table>
										</font> <br> <br> <br> 
										<center><input type="submit"
											value="Purchase"></center>

									</form>


									<%--             <table>
  <thead>
    <tr>
      <th>Customer Id</th>
    <th>Product name</th>
    <th>Quantity</th>
    <th>Rate</th>
    <th>Total</th>
    </tr>
  </thead>
  <tbody>
   <tr><c:forEach var="cart" items="${li}">
      <td>${cart.customerid }</td>
    <td>${cart.productname }</td>
    <td>${cart.quantity }</td>
    <td>${cart.rate }</td>
    <td id="fprice">${cart.total } </td> </c:forEach>
    </tr>
  </tbody>
  <tfoot>
    <tr>
      <td>Sum</td>
      <td id="sum"></td>
    </tr>
  </tfoot>
</table> --%>
									<%-- <table border="2px">
  <tr>
    <th>Customer Id</th>
    <th>Product name</th>
    <th>Quantity</th>
    <th>Rate</th>
    <th>Total</th>
  </tr>
   <c:forEach var="b" items="${li}">
  <tr>
    <td>${b.customerid }</td>
    <td>${b.productname }</td>
    <td>${b.quantity }</td>
    <td>${b.rate }</td>
    <td>${b.total }</td> 
  </tr>
  </c:forEach>
</table> --%>





								</div>
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
								<div class="copyright">
									&copy; 2012 <strong class="footer-logo">IFIS</strong>

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
									<li><a href="#"><img
											src="<c:url value="/resources/images/social-icon-1.png"/>"
											alt=""></a></li>
									<li><a href="#"><img
											src="<c:url value="/resources/images/social-icon-2.png"/>"
											alt=""></a></li>
									<li><a href="#"><img
											src="<c:url value="/resources/images/social-icon-3.png"/>"
											alt=""></a></li>
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
