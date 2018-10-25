<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AROGYA  LOGIN</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body style="background:url(images/emplogin.JPG) no-repeat center fixed;background-size:cover;">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Welcome to Arogya Pharmacy</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="Home.jsp">Home</a></li>
   
      <li><a href="#">ABOUT US</a></li>
      <li><a href="#">CONTACT US</a></li>
    </ul>
  </div>
</nav>

<div class="row">
    <div class="col-sm-4" >
    <h1 style="color=green">WELCOME TO EMPLOYEE LOGIN</h1>
    </div>
 
 
 <form action="EmpLogin" method="get">
 <div class="row">
    <div class="col-sm-6" >
    
    <h1>LOGIN FORM</h1>
    
  <div class="container"> 
    <label for="uname"><b>Username</b></label>
     <hr>  <input type="text" placeholder="Enter Username" name="uname" required><hr>

    <label for="psw"><b>Password</b></label>
     <hr><input type="password" placeholder="Enter Password" name="pwd" required><hr>
  
	<button type="submit">Login</button>
  </div>
     
</div>
  </form>
</body>
</html>