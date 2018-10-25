<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>

<script> 
function check()                                    
{ 
    var name = document.forms["signup"]["name"];               
    var email = document.forms["signup"]["email"];    
  var type=document.forms["signup"]["type"];
    var password = document.forms["signup"]["password"];  
    var phonenumber = document.signup.phonenumber.value; 
   
    if (type.value == " ")                                  
    { 
        window.alert("Please enter your type."); 
        type.focus(); 
        return false; 
    } 
   
   
    if (name.value == "")                                  
    { 
        window.alert("Please enter your name."); 
        name.focus(); 
        return false; 
    } 
   
    
       
    if (email.value == "" )                                   
    { 
        window.alert("Please enter a valid e-mail address."); 
        email.focus(); 
        return false; 
    } 
   
    if (email.value.indexOf("@", 0) < 0)                 
    { 
        window.alert("Please enter a valid e-mail address.as abc@abc.com"); 
        email.focus(); 
        return false; 
    } 
   
    if (email.value.indexOf(".", 0) < 0)                 
    { 
        window.alert("Please enter a valid e-mail address.as abc@abc.com"); 
        email.focus(); 
        return false; 
    } 
   
    if ( phone.length<10)                           
    { 
        window.alert("Please enter your telephone number."); 
        phone.focus(); 
        return false; 
    } 
   
    if (password.value == "")                        
    { 
        window.alert("Please enter your password"); 
        password.focus(); 
        return flase; 
    } 
   
   
   
    return true; 
}
</script>

</head>
<body>
<form  name="signup"action="Register" method="post" onsubmit="return check()">
<nav class="navbar   navbar-inverse">
  <div class="container-fluid">
  
  
  
    <div class="navbar" >
      <a class="navbar-brand navbar-middle" href="#"><h1>AROGYA PHARMACY</h1></a>
    </div>
    <p class="navbar-text" ">WELCOME TO AROGYA</p>
    <ul class="nav navbar-nav">
      <li class="active"><a href="Home.jsp">Home</a></li>
      
      <li><a href="#">ABOUT US</a></li>
      <li><a href="contactus.html">CONTACT US</a></li>
    </ul>
    </div>
 </nav>
 
 
 <div class="row">
    <div class="col-sm-4 col-md-6 col-lg-6" >
    <h1 style="color=green">WELCOME TO</h1>
    <img src=""  class="img-rounded" style='width:70%;height:100%' alt='[]'>
    </div>
    <div class="col-sm-8 col-md-6 col-lg-6">
    <div class="form-group">
    
  
    <h1>Arogya Register Form</h1>
   
    <hr>
    <label for="registration">Type</label>
       <select name="type" id="roletype" size="1" >
       <option value=" ">pls select</option>
          <option value="2">Employee</option>
          <option value="1">Customer</option>
        
       </select>
       <hr>
<div >
   <b>NAME</b></label>
    <input type="text" placeholder="Enter NAME" name="name" required>
    </div>
    <hr>
    
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Password" name="email" required>
    <hr>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required >
<hr>
    

    <label for="phonenumber"><b>PHONENUMBER</b></label>
    <input type="text" placeholder="Enter PHONE NUMBER" name="phonenumber" required>
    <hr>
    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a></p>
    <button type="submit" class="registerbtn">Register</button>
  

  <div class="container signin">
    <p>Already have an account? <a href="login.jsp">Login</a>.</p>
  </div>
  
  </div>

   
  </div>
  </form>

</body>
</html>