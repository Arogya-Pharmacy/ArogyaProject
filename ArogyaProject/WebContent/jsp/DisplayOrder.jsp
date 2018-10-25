<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
System.out.println("SESSION SERVLET CALLED");
int id=Integer.parseInt(request.getParameter("id"));
/* int qun=Integer.parseInt(request.getParameter("quantity")); */
String productName=request.getParameter("pname"); 
System.out.println("product name ");
int quantity=Integer.parseInt(request.getParameter("quantity"));
int pri=Integer.parseInt(request.getParameter("price"));

pri*=quantity; 
pageContext.setAttribute("price", pri);
pageContext.setAttribute("quant", quantity);
pageContext.setAttribute("prodName", productName);
 
System.out.println("ProductName "+productName+" Price "+pri);
%>  
<form action="">
 <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4">
<table border="1">
<tr>
<td>
${prodName}
</td>
<td>
${quant}
</td>
<td>
${price}
</td> 
</tr>
</table>
<input type="submit" value="Order" name="order"/>
</div>
</form>
</body>
</html>