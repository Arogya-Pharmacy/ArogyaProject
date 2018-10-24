<%@page import="com.arogya.connection.GetCon"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<% ResultSet resultSet=null; %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<%  GetCon databaseconnection =new GetCon();
	  Connection con=databaseconnection.getCon();
	  if(con!=null){  
	  
       Statement statement = con.createStatement() ;
       resultSet =statement.executeQuery("select product_cat_id,product_cat_name from productcategory") ;
	}
	%>
	
<div class="container">
  <h2>PRODUCT CATEGORY</h2>  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
       <img src="tab.jpg" alt="Medicines" style="width:100%;">
          
      </div>

      <div class="item">
       <img src="baby.jpg" alt="Baby Care" style="width:100%;">
           </div>
    
      <div class="item">
       <img src="ayur.jpg" alt="Ayurvedic Product" style="width:100%;">
             </div>
    </div>
    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
  <div>
  <%
  while(resultSet.next()){
  %>
  <a href=<%= "\"order.jsp?catId=" + resultSet.getInt(1) + "\"" %>><%=resultSet.getString(2)%></a><br>
  <%
  }
   %>
  </div>
</div>
 
</body>
</html>