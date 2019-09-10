<%@ page language="java"  import="mnc.vir.dao.*, javax.servlet.http.*,mnc.vir.utility.Order,mnc.vir.bean.*" contentType="text/html; charset=ISO-8859-1"
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
<%  customerdao d=new customerdao();
customer c=new customer();
String a = (String) session.getAttribute("uname");
System.out.println(a);
    c= d.get(a);
   System.out.println(c);
   
    %>    
      
  <b><font size="6" color="black" >MY ACCOUNT DETAILS ARE </font></b>
   
 <h1><font size="4" color="black"> Name:<%
out.println(c.getName());
%></span></font></h1>
 

<h1><font size="4" color="black"> Email:<%
out.println(c.getEmail());
%></h1></font>

<h1><font size="4" color="black"> Mobile:<%
System.out.println(c.getMobile());
double n=c.getMobile();
long l=(long)n;
out.println(l);
%></h1></font>

<h1><font size="4" color="black"> Address:<%
out.println(c.getAddr());
%></h1></font>

<h1><font size="4" color="black"> UserId:<%
out.println(c.getUserid());
%></h1></font>


</body>
</html>