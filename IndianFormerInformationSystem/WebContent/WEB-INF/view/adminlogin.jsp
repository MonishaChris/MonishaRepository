<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
</head>
<body background-image="C:\Users\honest\Desktop\File\IndianFormerInformationSystem\WebContent\WEB-INF\images\main-bg.jpg">
<div class="main-bg">
  <!-- Header -->
  <header>
    <div class="inner">
      <h1><a href="index">IFIS</a></h1>
      <nav>
        <ul class="sf-menu">
          <li><a href="index">home</a></li>
          <li> <a href="index">Login</a><
            <ul>
              <li><a href="loginfarmer">Farmer Login</a></li>
              <li><a href="customerlogin">Customer Login</a></li>
              <li><a href="vendorlogin">Vendor Login</a></li>
               </ul></li>
          
          
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
              <h2>Admin Login:</h2>
              <div class="wrapper indent-bot">

	<form action="formvalidationadmin" method="post">
<table>
 <tr><td><b>User Name:</b></td>
<td><input type="text" name="user"></td></tr>

<tr><td><b>Password:</b></td>
<td><input type="password" name="pass"></td></tr></table>

<br><br>
<input type="submit" value="Login"> <br><br>
</form></center><br>

</font>
</form>

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

</body>
</html>