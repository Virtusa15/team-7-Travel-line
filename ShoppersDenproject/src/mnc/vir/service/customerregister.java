package mnc.vir.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mnc.vir.bean.customer;
import mnc.vir.dao.customerdao;
import mnc.vir.utility.Order;

public class customerregister extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter p = res.getWriter();
		customer c=new customer();
		customerdao d=new customerdao();
		 
		//pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{5,}"
	String s1=	req.getParameter("name");
	System.out.println(s1);
	String s2=	req.getParameter("email");
			String s3=	req.getParameter("mobile");
			System.out.println(s3);
			Double a = Double.parseDouble(s3);
			System.out.println(a);
			String s4=req.getParameter("addr");
			String s5=req.getParameter("password");
			String s6=req.getParameter("userid");
			
c.setUserid(s6);
c.setAddr(s4);
c.setEmail(s2);
c.setName(s1);
c.setPassword(s5);
c.setMobile(a);
int b=d.insert(c);
if (b==1){
	System.out.println("succesufully inserted "); 
RequestDispatcher r=req.getRequestDispatcher("h1.html")	;
r.forward(req, res);
}
else if(b==3){
	System.out.println(" not inserted "); 
	p.println("this user id already register");
	RequestDispatcher r=req.getRequestDispatcher("register.html")	;
	r.include(req, res);		
}
else 
{
	System.out.println(" not inserted "); 
		
	
}

}
	
}