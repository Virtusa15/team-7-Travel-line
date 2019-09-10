<%@page import="java.util.ArrayList"%>
<%@ page language="java"  import="mnc.vir.dao.*, javax.servlet.http.*,mnc.vir.utility.Order,mnc.vir.bean.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Order o=(Order)session.getAttribute("order");
ArrayList<item> list=(ArrayList)o.getCartDetails();
int l=0;
%>
<table align="center">

<tr align="center" height="50" >
<th>item no</th>
<th width="200">name</th>
<th>cost</th>
<th></th>
</tr>
<%
for(item i:list){
	%>
	
	<tr align="center" height="50">
	<td><%=++l %></td>
	<td width="200">
	<%= i.getIname()%></td>
	<td>
	<%=i.getCost()%></td>
	<td></td>
	</tr>
<% }

Double d=o.getCartPrice();
%>
<tr align="center">
<td colspan="3">
<font size="5">
the total cost is:&#8360;<%=o.getCartPrice() %></font>
</td></tr>
<tr align="center">
<td colspan="3">
<a href="billinginformation.jsp?tc=+d+"><font size="5" color="red">continue</font><a>
</td>
</tr>
</table>
</body>
</html>