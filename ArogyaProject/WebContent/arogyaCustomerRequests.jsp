<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order table</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body style="background:url(images/empimage.jpg) no-repeat center fixed;background-size:cover;">
<%
 	response.setHeader("Cache-Control" , "no-cache, no-store, must-revalidate");  
	if(session.getAttribute("username")==null){
		response.sendRedirect("arogyaEmpLogin.jsp");
	}
%>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WELCOME TO AROGYA PHARMACY</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
   
      <li><a href="#">ABOUT US</a></li>
      <li><a href="#">CONTACT US</a></li>
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
</ul>
</div>
</nav>
<table border="2">
	<thead>
		<tr>
			<td>Customer Request ID</td>
			<td>customer Order ID</td>
			<td>customer ID</td>
			<td>Employee Request quantity</td>
			<td>product sub-category id</td>
			<td>product sub-category name</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach items = "${customerRequests}" var = "utl">
		<tr>
			<td>${utl.custRequestid}</td>
			<td>${utl.custorder_id}</td>
			<td>${utl.customer_id}</td>
			<td>${utl.emp_request_qnty}</td>
			<td>${utl.product_subcat_id}</td>
			<td>${utl.product_subcat_name}</td>
		</tr>
		</c:forEach>
	</tbody>
	
</table>
<center>
		<form action="EmpRequest" method="get">
 <div class="row">
    <div class="col-sm-6" >
    
    <h1>Stock Request Form</h1>
    
  <div class="container"> 
   
    <label for="ProdSubCatId"><b>Product Sub-category ID</b></label> <br>
     <input type="text" name="ProdSubCatId" required><br>
     
     <label for="ProdSubCatName"><b>Product Sub-Category Name</b></label> <br>
     <input type="text" name="ProdSubCatName" required><br>
  
   <label for="ProdQtny"><b>Product Quantity</b></label> <br>
     <input type="text" name="ProdQtny" required><br>
  
	<button type="submit">Send Request</button>
  </div>
   </div>
     
</div>
  </form>
</center>
</body>
</html>