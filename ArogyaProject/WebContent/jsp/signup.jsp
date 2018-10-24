<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AROGYA SIGNUP</title>
</head>
<body>
<c:url value="/Register" var="url"/>
<form action="${url }" method="post">
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
 
 
 <div class="row">
    <div class="col-sm-4" >
    <h1 style="color=green">WELCOME TO</h1>
    <img src-  class="img-rounded" style='width:70%;height:100%' alt='[]'>
    </div>
    <div class="col-sm-8">
    <div class="form-group">
    
  
    <h1>Arogya Register Form</h1>
   
    <hr>
<div class="form-group">
   <b>NAME</b></label>
    <input type="text" placeholder="Enter NAME" name="name" required>
    </div>
    <hr>
    
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Password" name="email" required>
    <hr>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
<hr>
    

    <label for="phonenumber"><b>PHONENUMBER</b></label>
    <input type="text" placeholder="Enter PHONE NUMBER" name="phonenumber" required>
    <hr>
    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a></p>
    <button type="submit" class="registerbtn">Register</button>
  </div>

  <div class="container signin">
    <p>Already have an account? <a href="login.jsp">Login</a>.</p>
  </div>
  
  </div>

   
  </div>
  </form>
</body>
</html>