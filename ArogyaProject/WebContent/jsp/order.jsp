<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>
<%@page import="com.arogya.model.ConnectionProvider"%>
<%
System.out.println("Currently i'm at order.jsp page ");
	ResultSet resultset = null;
	String catId =request.getParameter("catId");
	System.out.println("my value" + catId);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script type="text/javascript">
						function priceForProduct(){
							 var subCatId = document.getElementById('type').value;
								 alert(subCatId);
								console.log(" xxxxxxxxxxxxxxxxxxxxxxxxxxx "+subCatId);
								 console.log("dynamic subcat Id after dropdown selection "+subCatId);
									 ConnectionProvider dbConnection = new ConnectionProvider();
										Connection con = dbConnection.CONN();
										System.out.println("connection info " + con);
										if (con == null) {
											System.out.println("Not Connected,Please check your db connection");
										} else {
											System.out.println("Connected to DB");
											String query = "select product_subcat_cost from productsubcategory where product_subcat_id="+subCatId;
											
												PreparedStatement psmt = con.prepareStatement(query);
												resultset = psmt.executeQuery();
												System.out.println("Result Set at order.jsp :"+resultset);
										}
								
						}
						
						</script>
<title>Insert title here</title>
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
		try {
			System.out.println("Category ID : "+catId);
			ConnectionProvider dbConnection = new ConnectionProvider();
			Connection con = dbConnection.CONN();
			if (con == null) {
				System.out.println("Not Connected,Please check your db connection");
			} else {
				String query = "select product_subcat_id,product_subcat_name from productsubcategory where product_cat_id="+catId;
				
				try {
					PreparedStatement psmt = con.prepareStatement(query);
					resultset = psmt.executeQuery();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	%><c:url value="/ProductPrice" var="url"/>
	<form action="${url}" method="get">
	<div class="container">
		<h3>Please Select Your Order</h3>
		<table>
			<tr>
				<td><label for="ordertype"><b>Type Of Order : </b></label></td>
				<td><select id="productSubCat"  name="productSubCat">
						<%
							while (resultset.next()) {
						%>
						<option value="<%=resultset.getString(2)%>" ><%=resultset.getString(2)%></option>
						<%}
						%>
				</select></td>
		
			</tr>
			<tr>
				<td><label for="forquantity"><b>Quantity : </b></label></td>
				<td><input type="text" id="quantity" name="quantity" required /></td>
			</tr>
		
		

			<tr>
				<td>
					<button type="submit" class="btnorder"  >submit</button>
				</td>
			</tr>
		</table>
	</div>
	
	</form>

	<%
		} catch (Exception e) {
			e.printStackTrace();
		}
	%>
	
	
</body>
</html>