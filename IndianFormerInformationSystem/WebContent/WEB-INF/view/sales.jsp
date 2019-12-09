
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<%@page isELIgnored="false" %>
<title>IFIS | Sales</title>
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
<div class="E:\asminds\spring\IndianFormerInformationSystem\WebContent\WEB-INF\images\main-bg.jpg">
  <!-- Header -->
  <header>
    <div class="inner">
      <h1 ><a href="home">IFIS</a></h1>
      <nav>
        <ul class="sf-menu">
          <li><a href="home">home</a></li>
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
            <article class="grid_22 suffix_1 prefix_1 alpha omega">
              <h2>Customer Orders:</h2>
              <!-- <div class="wrapper">
                <div class="grid_7 suffix_1 alpha">
                 -->
                
               <%-- <strong>   <ul class="price-list">
                  <li>Product name<span class="price">Customer Id</span>
                    <span class="price">Total</span><span >&nbsp;</span></li>
                  </ul> </strong> <c:forEach var="b" items="${li}">
               <ul class="price-list">   
                 <li><a href="#" class="price-item"><c:out value="${b.productname}" /></a>
               <span class="price"><c:out value="${b.customerid}" /></span>
                    <span class="price"><c:out value="${b.total}" />kg</span> 
                    </li>  
                     </ul></c:forEach> --%>
  
    <table border="3" style="width: 100%">
	
				    <tr>
				    <th>Cart Id</th>
				    <th><b>Product Type</b></th>
					<th><b>Product Name</b></th>
					<th><b>Customer Id</b></th>
					<th><b>Quantity</b></th>
					<th><b>Rate</b></th>
					<th><b>Total</b></th>
					
					
					
				</tr>
				<c:if test="${not empty li}">
		<c:forEach var="n" items="${li}">
				<tr>
				<td><form action="assigntransport"><input name="cartid" type="submit" value="${n.cartid }"></form></td>
				<td><c:out value="${n.type}" /></td>
					<td ><c:out value="${n.productname}" /></td> 
					<td><c:out value="${n.customerid}" /></td>
					<td><c:out value="${n.quantity}" /></td>
					
					<td><c:out value="${n.rate}" /></td>
					<td><c:out value="${n.total}" /></td>
					
					
					
				</tr>
</c:forEach>
	</c:if>
			</table>
	</center>
                 
                  <!-- <figure class="img_inner fleft">
            <iframe src="http://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Brooklyn,+New+York,+NY,+United+States&amp;aq=0&amp;sll=37.0625,-95.677068&amp;sspn=61.282355,146.513672&amp;ie=UTF8&amp;hq=&amp;hnear=Brooklyn,+Kings,+New+York&amp;ll=40.649974,-73.950005&amp;spn=0.01628,0.025663&amp;z=14&amp;iwloc=A&amp;output=embed"></iframe>
          </figure> -->
                 
                <!-- </div>
                
              </div> -->
            
           
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
