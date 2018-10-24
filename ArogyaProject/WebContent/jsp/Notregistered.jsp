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
      <li class="active"><a href="Home.jsp">Home</a></li>
      <li></li>
      <li><a href="#">ABOUT US</a></li>
      <li><a href="contactus.html">CONTACT US</a></li>
    </ul>
  </div>
</nav>

<div class="row">
    <div class="col-sm-6" >
    <h1 style="color=green">Registration failed</h1>
    <h2>Please Signup </h2>
    </div>
 
 <div class="col-sm-6">
    <div class="form-group">
    
  <form action="Register" method="post">
    <h1>Arogya Register Form</h1>
   
    <hr>
<div class="form-group">
  <label> <b>NAME</b></label>
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