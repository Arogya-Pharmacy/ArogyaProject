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
String productName=request.getParameter("ProductName");  
int price=Integer.parseInt(request.getParameter("price"));
/* int quantity=Integer.parseInt(request.getParameter("quantity")); */
/* price*=quantity; */
System.out.println("ProductName "+productName+" Price "+price);
%>  
 <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4">
<table>
<tr>
<td>
HELLO WORLD
</td>
<td>
${price }
</td> 
</tr>
</table>
</div>
</body>
</html>