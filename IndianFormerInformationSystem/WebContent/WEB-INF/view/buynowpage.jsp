
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<%@page isELIgnored="false" %>
<title>IFIS | Payment</title>
<meta charset="utf-8">
<style>
body{
font-family: Arial, Helvetica, sans-serif;
}

.tab button:hover {
  background-color: #ddd;
}

/* Create an active/current tablink class */
.tab button.active {
  background-color: #ccc;
}

/* Style the tab content */
.tabcontent {
  display: none;
  padding: 6px 12px;
  border: 1px solid #ccc;
  border-top: none;
}
  </style>
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
          <li><a href="home">home</a></li>
          
          
          
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
              <h2>Payment Details</h2>
              <div class="wrapper">
                <div class="grid_7 suffix_1 alpha">
                
               
<div class="tab">
  <button class="tablinks" onclick="openCity(event, 'CreditCard')">CreditCard</button>
  <button class="tablinks" onclick="openCity(event, 'DebitCard')">DebitCard</button>
  <button class="tablinks" onclick="openCity(event, 'ATMcard')">ATMcard</button>
</div>

<div id="CreditCard" class="tabcontent">
<select>
<option>Choose an Option</option>  
<option>All Visa/MasterCard Debit Card</option>
<option>All Rupay Debit Cards</option>
<option>All SBI Maestro Debit Cards</option>
<option>All Citibank   Maestro Debit Cards</option>
</select><br><br>
  <input type="number" name="cnumber" placeholder="CNumber"><br><br>
  <select>
   <option>ExpMM</option>
  <option>1</option>
  <option>2</option>
  <option>3</option>
  <option>4</option>
  <option>5</option>
  <option>6</option>
  <option>7</option>
  <option>8</option>
  <option>9</option>
  <option>10</option>
  <option>11</option>
  <option>12</option>

  </select>
   <select>
  <option>ExpYYYY</option>
   <option>2032</option>
  <option>2031</option>
  <option>2030</option>
  <option>2029</option>
  <option>2028</option>
  <option>2027</option>
  <option>2026</option>
  <option>2025</option>
  <option>2024</option>
  <option>2023</option>
  <option>2022</option>
  <option>2021</option>
  <option>2020</option>
   </select><br><br>
   <form action="thanks" method="post"> 
   <input type="submit" value="Continue"></form>
  </div>





<div id="DebitCard" class="tabcontent">
 <select>
<option>Choose an Option</option>  
<option>All Visa/MasterCard Debit Card</option>
<option>All Rupay Debit Cards</option>
<option>All SBI Maestro Debit Cards</option>
<option>All Citibank   Maestro Debit Cards</option>
</select><br><br>
<form action="thanks" method="post">
<input type="number" name="cnumber" placeholder="CNumber"><br><br>
  <select>
   <option>ExpMM</option>
  <option>1</option>
  <option>2</option>
  <option>3</option>
  <option>4</option>
  <option>5</option>
  <option>6</option>
  <option>7</option>
  <option>8</option>
  <option>9</option>
  <option>10</option>
  <option>11</option>
  <option>12</option>
   </select>
   <select>
  <option>ExpYYYY</option>
   <option>2032</option>
  <option>2031</option>
  <option>2030</option>
  <option>2029</option>
  <option>2028</option>
  <option>2027</option>
  <option>2026</option>
  <option>2025</option>
  <option>2024</option>
  <option>2023</option>
  <option>2022</option>
  <option>2021</option>
  <option>2020</option>
   </select><br><br>
 <input type="submit" value="Continue"></form>
 </div>



<div id="ATMcard" class="tabcontent">
<select>
<option>Choose an Option</option>  
<option>All Visa/MasterCard Debit Card</option>
<option>All Rupay Debit Cards</option>
<option>All SBI Maestro Debit Cards</option>
<option>All Citibank   Maestro Debit Cards</option>
</select><br><br>
  <input type="number" name="cnumber" placeholder="CNumber"><br><br>
  <select>
   <option>ExpMM</option>
  <option>1</option>
  <option>2</option>
  <option>3</option>
  <option>4</option>
  <option>5</option>
  <option>6</option>
  <option>7</option>
  <option>8</option>
  <option>9</option>
  <option>10</option>
  <option>11</option>
  <option>12</option>
   </select>
   <select>
  <option>ExpYYYY</option>
   <option>2032</option>
  <option>2031</option>
  <option>2030</option>
  <option>2029</option>
  <option>2028</option>
  <option>2027</option>
  <option>2026</option>
  <option>2025</option>
  <option>2024</option>
  <option>2023</option>
  <option>2022</option>
  <option>2021</option>
  <option>2020</option>
   </select><br><br>
   <form action="thanks" method="post"> 
   <input type="submit" value="Continue"></form>
</div>

<script>
function openCity(evt, cityName) {
  var i, tabcontent, tablinks;
  tabcontent = document.getElementsByClassName("tabcontent");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablinks");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" active", "");
  }
  document.getElementById(cityName).style.display = "block";
  evt.currentTarget.className += " active";
}
</script>
                  
                  
                 
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
