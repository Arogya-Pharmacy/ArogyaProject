<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page import="java.util.Random"%>
  <% Random r=null;
  String randomNumber =null;
  r = new Random();
  randomNumber = String.format("%04d", Integer.valueOf(r.nextInt(1001)));
  System.out.println("random code is "+randomNumber);
  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
function generateRandomCode() {
	alert("Your order got placed ");
}
</script>
</head>
<body>
<nav class="navbar   navbar-inverse">
  <div class="container-fluid">
  
  
  
    <div class="navbar" >
      <a class="navbar-brand navbar-middle" href="#"><h1>AROGYA PHARMACY</h1></a>
    </div>
    <p class="navbar-text" ">WELCOME TO AROGYA</p>
    <ul class="nav navbar-nav">
      <li class="active"><a href="Home.jsp">Home</a></li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">AROGYA PRODUCTS
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">MEDICINES</a></li>
          <li><a href="#">BABY PRODUCTS</a></li>
          <li><a href="#">AYURVEDIC PRODUCTS</a></li>
        </ul>
      </li>
      <li><a href="#">ABOUT US</a></li>
      <li><a href="contactus.html">CONTACT US</a></li>
    </ul>
    </div>
 </nav>
<%
double price=(Double) request.getAttribute("totalPrice");
%>
<%-- <c:url value="/SaveOrderDetails" var="url"/>
<form action="${url}" method="post"> --%>
<p>Your order got placed  </p>
<%-- <p>Price for your products ::<%= price %> </p>
<input type="submit" name="order" value="order" onClick="generateRandomCode()"/> --%>
<!-- </form> -->
</body>
</html>