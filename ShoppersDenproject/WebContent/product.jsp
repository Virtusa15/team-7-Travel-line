<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="servlet4">
  

 <dl>
 <dt>
 <b>enter  Item name</b>
     <dt>
  <dd>  <input type="text" placeholder="Enter item name" name="bid" required><br><br></dd>
  <dt>enter Item type </dt>
  <dd>
  <select name="type">
 <option value="-1" selected="selected" >add item</option>
 <option value="Books">Books</option>
 <option value="Gifts">Gifts</option>
 <option value="clothing">Clothing</option>
 <option value="sports">sports</option>
 
 </select>
 </dd>
 <dt>
 
    <b>cost</b>  <dt>
    <dd> <input type="number" placeholder="Enter cost" name="cost" required><br><br></dd>
    <dt> <b>image</b> </dt>
    
   <dd>  <input type="file" name="image" required></dd>
<br>
   <dd>  <button type="submit"  >add product</button></dd>
   
 </dl>
 
  </form>



</body>
</html>