<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AROGYA LOGIN</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body style="background:url(images/pharma2.jpg) no-repeat center fixed;background-size:cover;">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Welcome to Arogya Pharmacy</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="home1.jsp">Home</a></li>
      <li></li>

      <li><a href="contactus.html">CONTACT US</a></li>
    </ul>
  </div>
</nav>

<div class="row">
    <div class="col-sm-6" >
    <h1 style="color=green">SUCCESSFULLY REGISTERED PLEASE LOGIN IN</h1>
    </div>
 
 <div class="row">
    <div class="col-sm-6" >
    <form action="LoginServlet" method="post">
    
    <h1>Login Form</h1>
    
  <div class="container"> 
    <label for="uname"><b>Username</b></label>
     <input type="text" placeholder="Enter Username" name="uname" required><hr>

    <label for="psw"><b>Password</b></label>
     <input type="password" placeholder="Enter Password" name="psw" required><hr>
  
	<button type="submit">Login</button>
  <label><input type="checkbox" checked="checked" name="remember"> Remember me</label>
  </div>
   
    </form>
</div>

</body>
</html>