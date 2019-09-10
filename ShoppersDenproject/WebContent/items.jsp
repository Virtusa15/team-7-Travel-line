
<%@page import="java.util.ArrayList"%>
<%@ page language="java"  import="mnc.vir.dao.*, javax.servlet.http.*,mnc.vir.utility.Order,mnc.vir.bean.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


</head>
<body>

<%
String s=request.getParameter("id");

productimagedao d=new productimagedao();


ArrayList<product> al=new ArrayList<product>();

al=d.get(s);%>
<table align="center">
<% 
for(product pro:al){
	
	%>

<tr align="center" height="20">
<th>
<%=pro.getPid() %>
</th>

<tr  align="center">
<td>
	 <img src="data:image/jpg;base64,<%=pro.getImg()%> " width="400" height="400"/>
	</td>
</tr>
<tr height="50">
<th align="center">
<font size="5">price:&#8360;
<%=pro.getCost() %></font>
</th>
</tr>	
<tr align="center">
<td>

 <a href="servlet5?id=<%=pro.getPid() %>&cost=<%=pro.getCost() %>&type=<%=pro.getPtype() %>"><font size="6" color="red">Add to Cart</font></a>
</td>
</tr>

<%	} %>
</table>
</body>
</html>