<!--   create  table product(pid  number(10)  primary key,ptype varchar2(10),cost number(20),img BLOB);-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">

</script>
</head>
<body>
<h3><b>Manage category</b></h3>
<h5><b>Add Category</b></h2>
<select id="item" name="acategory" >
 <option value="-1"selected="selected" >Add Category</option>
 <option value="Books">Books</option>
 <option value="Gifts">Gifts</option>
 <option value="Clothing">Clothing</option>
 <option value="sports">sports</option>
 
 </select>
 <h3><b>Manage Item</b></h3>
 
 <a href="product.jsp"><h5><b>add item</b></h2></a>
 
 <h5><b>Delete Category</b></h2>

 

 <h3><b>Delete  Item</b></h3>
 
  <a href="deleteproduct.jsp?id=Books">Books</a><br>
  <a href="deleteproduct.jsp?id=Gifts">Gifts</a><br>
  <a href="deleteproduct.jsp?id=clothing">Clothing</a><br>
  <a href="deleteproduct.jsp?id=sports">sports</a><br>
 

<!--  <a href="product.jsp"><h5><b>delete item</b></h2></a> -->
<a href="r2.html"><h2><b>sign out</b></h2></a>
</body>
</html>