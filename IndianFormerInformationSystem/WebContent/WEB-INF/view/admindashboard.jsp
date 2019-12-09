<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
</head>
<body>
<div class="main-bg">
  <!-- Header -->
  <header>
    <div class="inner">
      <h1 ><a href="home">IFIS</a></h1>
      <nav>
      <h1 >${wrong }</h1>
        <ul class="sf-menu">
          <li> <a href="home">Registration</a>
            <ul>
              <li><a href="farmer">Farmer</a></li>
              <li><a href="vendor">Vendor</a></li>
              <li> <a href="customer">Customer</a></li>
               <li> <a href="transport">Transport</a></li>
               </ul></li>
          <li><a href="#">Stock</a><ul>
              <li><a href="farmerstock">Farmer Stock</a></li>
              <li><a href="vendorstock">Vendor Stock</a></li>
               </ul></li>
               <li><a href="sales">Sales</a></li>
             
          <li><a href="contact">Feedback</a></li>
          <li><a href="home">LogOut</a></li>
        </ul>
      </nav>
      <div class="clear"></div>
    </div>
    <div class="slider-container">
      <div class="mp-slider">
        <ul class="items">
          <li><img src="<c:url value="/WebContent/WEB-INF/images/slide-1.jpg"/>"/>"/>" alt="">
            <div class="banner mp-ban-1"><span class="row-1">putting our</span><span class="row-2">heart &amp; soul</span><span class="row-3">into the field</span></div>
          </li>
          <li><img src="<c:url value="/WebContent/WEB-INF/images/slide-2.jpg"/>"/>" alt="">
            <div class="banner mp-ban-2"><span class="row-1">we have a strong</span><span class="row-2">agriculture</span><span class="row-3">heritage</span></div>
          </li>
          <li><img src="<c:url value="/WebContent/WEB-INF/images/slide-3.jpg"/>"/>" alt="">
            <div class="banner mp-ban-3"><span class="row-1">growing clean</span><span class="row-2">and full of health</span><span class="row-3">products</span></div>
          </li>
        </ul>
      </div>
    </div>
    <a href="#" class="mp-prev"></a> <a href="#" class="mp-next"></a> </header>
  <!-- Content -->
  <section id="content">
    <div class="container_24">
      <div class="wrapper">
        <div class="grid_24 content-bg">
          <div class="wrapper">
            <div class="grid_16 suffix_1 prefix_1 alpha">
              
            </div>
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
                <li><a href="#"><img src="<c:url value="/WebContent/WEB-INF/images/social-icon-1.png"/>" alt=""></a></li>
                <li><a href="#"><img src="<c:url value="/WebContent/WEB-INF/images/social-icon-2.png"/>" alt=""></a></li>
                <li><a href="#"><img src="<c:url value="/WebContent/WEB-INF/images/social-icon-3.png"/>" alt=""></a></li>
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
