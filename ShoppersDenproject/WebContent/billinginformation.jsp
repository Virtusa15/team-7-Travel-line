<%@ page language="java"  import="mnc.vir.dao.*, javax.servlet.http.*,mnc.vir.utility.Order,mnc.vir.bean.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
body{
text-align: center;
}
</style>
<title>Insert title here</title>
</head>
<body >
<%  customerdao d=new customerdao();
customer c=new customer();
String a = (String) session.getAttribute("uname");
System.out.println(a);
    c= d.get(a);
   System.out.println(c);
   Order o=(Order)session.getAttribute("order");

   
    %>    

<font size="5"><u>Billing Information</u></font><br>
Name:<%
out.println(c.getName());%><br>
Mobile:<%double n=c.getMobile();
long l=(long)n;
out.println(l);
 %><br>
E-Mail:<%
out.println(c.getEmail());%><br>
Total Amount:<%=o.getCartPrice() %><br>
<font size="5"><u>Shipping Information</u></font><br>
Address:<%
out.println(c.getAddr());%><br><br>
<a href="CreditCard Details.html"><font size="5" color="red">Continue to pay</font></a>
</body>
</html>