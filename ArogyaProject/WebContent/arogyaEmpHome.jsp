<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee view</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body style="background:url(images/empimage.jpg) no-repeat center fixed;background-size:cover;">
<%--  <%
 	response.setHeader("Cache-Control" , "no-cache, no-store, must-revalidate");  
	if(session.getAttribute("username")==null){
		response.sendRedirect("login.jsp");
	}
%> --%> 
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WELCOME TO AROGYA PHARMACY</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
   
  
      <li><a href="contactus.html">CONTACT US</a></li>
    </ul>
      <ul class="nav navbar-nav navbar-right">
     
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">REQUESTS
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
       	   <li> <form action="FectchOrderTable" method="get"><button type="submit" class="btn btn-primary btn-block">CUSTOMER ORDERS</button></form> </li>
       	   <li> <form action="FetchRequestTable" method="get"><button type="submit" class="btn btn-primary btn-block">CUSTOMER REQUESTS</button></form> </li> 
        </ul>
      </li>
     <li> <form action="EmpLogout" method="get"> 
     <button type="submit" class="btn btn-danger">LOGOUT</button>
     </form> 
     </li> 
    
    <%--    <li><a href="arogyaEmpLogin.jsp"><span class="glyphicon glyphicon-user"></span>LOG OUT</a></li> --%>
    </ul>
  </div>
</nav>


</body>
</html>