<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head> <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>fetch Product details</title>
</head>

	
	<body style="background-image:url()">
 <nav class="navbar   navbar-dark danger-color">
  <div class="container-fluid">
    <div class="navbar" >
      <a class="navbar-brand navbar-middle" href="#"><h1>AROGYA PHARMACY</h1></a>
    </div>
    <p class="navbar-text" background-color="red">WELCOME TO AROGYA</p>
    <ul class="nav navbar-nav">
      <li class="active"><a href="Home.jsp">Home</a></li>
      
      <li><a href="#">ABOUT US</a></li>
      <li><a href="contactus.html">CONTACT US</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
     
      <li><a href="Home.jsp"><span></span>Logout</a></li>
    </ul>
    
  </div>
</nav>
<div class="container-fluid">
  <h1>PRODUCT CATEGORY</h1>
  <div class="row">
 
    <div class="col-sm-4">
      <img src="images/ayur.jpg" class="img-responsive" alt="ayur" width="700" height="1800"> 
    </div>
      
    <div class="col-sm-4">
    <img src="images/baby.jpg" class="img-responsive" alt="ayur" width="700" height="1800"> 
    </div>
 
      <div class="col-sm-4">
    <img src="images/tab.jpg" class="img-responsive" alt="ayur" width="700" height="1800"> 
    </div>
   
  </div>
</div>
<jsp:useBean id ="cate" scope ="session" class = "com.arogya.entity.CategoryBean"/>


<table>
  <td>
  <tr><c:forEach items = "${productdetails}" var="ref"> 
   <a href= "SampleServlet?catId=${ref.productId}&productName=${ref.productName}" > 
   
                   ${ref.productName }  
    </a><br>
  </c:forEach> </tr>
   </td>

</table>
</body>
</html>