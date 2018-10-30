<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

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

<nav class="navbar   navbar-dark danger-color">
  <div class="container-fluid">
    <div class="navbar" >
      <a class="navbar-brand navbar-middle" href="#"><h1>AROGYA PHARMACY</h1></a>
    </div>
    <p class="navbar-text" background-color="red">WELCOME TO AROGYA</p>
    <ul class="nav navbar-nav">
      <li class="active"><a href="home1.jsp">Home</a></li>
     
      <li><a href="contactus.html">CONTACT US</a></li>

    </ul>
    </nav>
   
    <center>

  <div class="container">
  <div class="column">
    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4">
     <table>
 <tr>


<%!
 public void addToCart(HttpSession sessionObject,HttpServletRequest request) {
	int pid = Integer.parseInt(request.getParameter("prodSubcatId"));
	String pname =request.getParameter("ProductName");
	int quantity = Integer.parseInt(request.getParameter("quantity"));
	int price = Integer.parseInt(request.getParameter("price"));
	sessionObject.setAttribute("pid", pid);
	sessionObject.setAttribute("pname", pname);
	sessionObject.setAttribute("quantity", quantity);
	sessionObject.setAttribute("price", price);
	
	
  
} 

 %>

 <c:forEach items="${ProductsList}" var="list">
 <td>
	<input type="hidden" name="prodSubcatId" value="${list.productSubcatId}"/>
  <img src="${list.getImage()}" height="250" width="250"/>
  <label>Product Name  : </label>
  <label name="ProductName" id="ProductName"> ${list.productSubcatName }</label>
   <label>Quantity :<input type="text" name="quantity" id="quantity" /></label><br>
  <%--  <%request.setParameter("quantity")%> --%> 
   <label>Price : Rs.</label><label id="price" name="price"> ${list.productSubcatCost} </label>/-<br>
   <!--  <form action="Getdetails">
   <button type="submit">Buynow</button>
   </form> -->
<!-- <a href="" class="btn btn-info">Buy Now</a> --> 
   <%-- <input type="button" id="addtocart" onclick="addToCart(<%=request.getSession()%>,<%=request.getContextPath()%>)" value="Add to cart"/> --%>
   
   
   <a href="jsp/DisplayOrder.jsp?id=${list.productSubcatId}&pname=${list.productSubcatName}&quantity=1&price=${list.productSubcatCost }" class="btn btn-info">Buy Now</a>
   <%-- <input type="submit" name="addToCart" id="${list.productSubcatId}" value="Buy Now" onclick="onSubmit()"/><br> --%>
   </td>
    </c:forEach>
  </tr>
  </table>
  <!-- <form action="jsp/DisplayOrder.jsp">
  <input type="submit" value="Submit">
  </form> -->
    </div>
  </div>
  </div>

</center>

  </div>

</body>
</html>

		