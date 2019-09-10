<%@ page language="java" import="mnc.vir.utility.*"  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

input{
background-color:infobackground;
color:black;
text-align: center;
}
body{
background-image:url("tea.jpg");
background-repeat:no-repeat;
background-size:800px;
background-color:white;
}
</style>
</head>
<body>
<%
Order o=new Order();
session.setAttribute("order", o);
System.out.println(o);

%>
<form action="searchitem.jsp" target="r2">
<font color="white">Search</font><br>
<input type="text" name="search"><br>
<span style="border: 50px"></span><font color="white">In:</font><select id="item" name="category" >
 <option value="-1"selected="selected" >Add Category</option>
 <option value="Books">Books</option>
 <option value="Gifts">Gifts</option>
 <option value="Clothing">Clothing</option>
 <option value="sports">sports</option>
 
 </select><br>
 <input type="submit" value="Search">

</form>

<br><br><br><br><br><br>

<a href="items.jsp?id=Books" target="r2"><input  type="text" value="BOOKS" disabled="disabled"><br><br></a>
<a  href="items.jsp?id=Gifts" target="r2"><input type="text" value="GIFTS" disabled="disabled"><br><br></a>
<a  href="items.jsp?id=Clothing" target="r2"><input type="text" value="CLOTHING"disabled="disabled" ><br><br></a>
<a  href="items.jsp?id=sports" target="r2"><input type="text" value="SPORTS" disabled="disabled"><br><br></a>
</body>
</html>