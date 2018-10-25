<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
      <%@page import="java.util.Random"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<%
System.out.println("CURSOR AT DISPLAY ORDER ");
int id=Integer.parseInt(request.getParameter("id"));
/* int qun=Integer.parseInt(request.getParameter("quantity")); */
String productName=request.getParameter("pname"); 
System.out.println("product name ");
int quantity=Integer.parseInt(request.getParameter("quantity"));
int pri=Integer.parseInt(request.getParameter("price"));
pri*=quantity; 
pageContext.setAttribute("price", pri);
pageContext.setAttribute("quant", quantity);
pageContext.setAttribute("prodName", productName);
System.out.println("ProductName "+productName+" Price "+pri);
Random r=null;
String randomNumber =null;
r = new Random();
randomNumber = String.format("%04d", Integer.valueOf(r.nextInt(1001)));
System.out.println("random code is "+randomNumber);
session.setAttribute("randomNumber",randomNumber);  
%>  
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
      <li><a href="signup.jsp"><span ></span> Sign Up</a></li>
      <li><a href="login.jsp"><span></span> Login</a></li>
    </ul>
    </nav>
    <c:url value="/DataInSession" var="url"/>
<form action="${url}" method="post">
 <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4">
<table border="1">
<tr>
<td>
${prodName}
</td>
<td>
${quant}
</td>
<td>
${price}
</td> 
</tr>
</table>
<input type="submit" value="Order" name="order"/>
</div>
</form>
</body>
</html>