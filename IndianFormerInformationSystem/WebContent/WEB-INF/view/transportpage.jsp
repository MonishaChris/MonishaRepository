<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>
<head>
<title>IFIS | Transport Registration</title>
<style>  
.error{color:red}  
</style>
</head>
<body background="D:\IndianFormerInformationSystem\WebContent\WEB-INF\images\main-bg.jpg">
<div class="main-bg">
  <!-- Header -->
  <header>
    <div class="inner">
    
      <h1><a href="home">IFIS</a></h1>
      <nav>
        <ul class="sf-menu">
          <li><a href="home">home</a></li>
          <li> <a href="home">Registration</a>
            <ul>
              <li><a href="farmer">Farmer</a></li>
              <li><a href="vendor">Vendor</a></li>
              <li> <a href="customer">Customer</a></li>
               <li> <a href="transport">Transport</a></li>
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
            <article class="grid_22 suffix_1 prefix_1 alpha omega">
              <h2>Transport Registration:</h2>
              <div class="wrapper indent-bot">	 
                          
             <form:form action="registersavetransport" modelAttribute="ifis" method="post"><font color="white">
		 <center> 
		<table>
			<tr>
				<td><b><h4>Driver Name:</h4></b></td>
				<td><form:input path="drivername" placeholder="Driver Name" /></td>
				<td><form:errors path="drivername" cssClass="error" /></td>
			</tr>


			<tr>
				<td><b>Vehicle Type:</b></td>
				<td><form:input path="vehicletype"  placeholder="Vehicle Type"/></td>
				<td><form:errors path="vehicletype" cssClass="error" /></td>
			</tr>
			<tr>
				<td><b>Location:</b></td>
				<td><form:input path="location" placeholder="location"/></td>
				<td><form:errors path="location" cssClass="error" /></td>
				
			</tr>

			<tr>
				<td><b>Street:</b></td>
				<td><form:input path="street" placeholder="street"/></td>
				<td><form:errors path="street" cssClass="error" /></td>
				
			</tr>
			<tr>
				<td><b>City:</b></td>
				<td><form:input path="city" placeholder="city"/></td>
				<td><form:errors path="city" cssClass="error" /></td>
				
			</tr>
			<tr>
				<td><b>State:</b></td>
				<td><form:input path="state" placeholder="state"/></td>
				<td><form:errors path="state" cssClass="error" /></td>
				
			</tr>
			<tr>
				<td><b>Pin code:</b></td>
				<td><form:input path="pincode" placeholder="pincode"/></td>
				<td><form:errors path="pincode" cssClass="error" /></td>
				</tr>
				<tr>			
			<td><b>Mobile Number:</b></td>
			<td><form:input path="mobile" placeholder="Mobile Number"/></td>
				<td><form:errors path="mobile" cssClass="error" /></td>				
			</tr>	</table>
			<br><br><br>
	<input type="submit" value="Submit">
			<br><br>
			<a href="viewall" value="View">Click here to view all</a><br> <br>
	</center>
	
	</form:form>

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
              
            </div>
            </div>
        </div>
      </div>
    </div>
  </footer>
</div>
</body>
</html>
