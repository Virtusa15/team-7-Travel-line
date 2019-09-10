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
String s=request.getParameter("id");
System.out.println(request.getAttribute("dcategory"));
productimagedao d=new productimagedao();


ArrayList<product> al=new ArrayList<product>();

al=d.get(s);%>
<form action="servlet6">
  

 <dl>
  <dt>enter book type</dt>
  <dd>
  <select name="type">
 <option value="-1" selected="selected" >delete category</option>
 <option value="Books">Books</option>
 <option value="Gifts">Gifts</option>
 <option value="clothing">Clothing</option>
 <option value="sports">sports</option>
 
 </select>
 </dd>
 <dt>
 <b>enter book name</b>
     <dt>
   <dd>
   <select name="pid">
   <option value="1" selected="selected" >delete item</option>
   <% 
for(product pro:al){

	%>
   
 
 
 <option value="<%=pro.getPid() %>" ><% out.println(pro.getPid());%></option>
 <%} %>

 </select>

 </dd>
 

<br>
   <dd>  <button type="submit"  >delete product</button></dd>
   
 </dl>
 
  </form>
</body>
</html>