<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<%@page isELIgnored="false" %>
<title>IFIS | Stock</title>
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
      <h1 ><a href="home">IFIS</a></h1>
      <nav>
        <ul class="sf-menu">
          <li class="current"><a href="home">home</a></li>
          
         <li><a href="#">Stock</a><ul>
              <li><a href="farmerstock">Farmer Stock</a></li>
              <li><a href="vendorstock">Vendor Stock</a></li>
               </ul></li>
         <li class="current"><a href="adminpage">Go Back</a></li>
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
            <article class="grid_6 suffix_1 prefix_1 alpha">
              <h2>Did you know?</h2>
              <p class="p1"> <strong class="str-2">Agriculture is the art and science of cultivating the soil, growing crops and raising livestock. It includes the preparation of plant and animal products for people to use and their distribution to markets.</strong> </p>
              <img src="<c:url value="/resources/images/page4-img1.jpg"/>" alt="" class="img-indent-bot">
              <p class="p1"> <i>These products, as well as the agricultural methods used, may vary from one part of the world to another.</i> </p>
              <p class="p1 hr-border-1">  Agriculture provides most of the world's food and fabrics.  </p>
              
            </article>
            <article class="grid_15 suffix_1 omega">
              <h2>Vendor Stocks and Prices:</h2>
              
              <%--  <div class="wrapper">
                <div class="grid_7 suffix_1 alpha">
             
                
                  <ul class="price-list">
                  <li><a href="#" class="price-item">Product name</a><span class="price">Price</span>
                    <span class="price">Available kg</span><span >&nbsp;</span></li>
                    <c:forEach var="b" items="${li}">
                    <li><a href="#" class="price-item"><c:out value="${b.productname}" /></a><span class="price"><c:out value="${b.price}" /></span>
                    <span class="price"><c:out value="${b.stock}" />kg</span><span class="filler">&nbsp;</span></li>
         </c:forEach>
                  </ul> --%>
                  
              <table border="3" style="width: 100%">
	
				<tr>
				<!-- <th><b>Vendor Id</b></th> -->
					<th><b>Product Name</b></th>
					<th><b>Stock Available</b></th>
					<th><b>Rate</b></th>
				</tr>
				<c:if test="${not empty li}">
		<c:forEach var="n" items="${li}">
				<tr>
				<%-- <td><c:out value="${n.vendorid}" /></td> --%>
								
					<td><c:out value="${n.productname}" /></td>
					
					<td><c:out value="${n.stock}" /></td>
					<td><c:out value="${n.price}" /></td>
					
					
					
				</tr>
</c:forEach>
	</c:if>
			</table>
                
                </div>
                
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
