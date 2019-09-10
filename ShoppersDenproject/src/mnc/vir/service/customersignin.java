package mnc.vir.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mnc.vir.dao.customerdao;
import mnc.vir.utility.Order;

public class customersignin extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 PrintWriter p=res.getWriter();
		
 		String s1=req.getParameter("uname");
 		
 		
 	
 		String s2=req.getParameter("psw");
 	
		HttpSession s=req.getSession();
		s.setAttribute("uname", s1);
       
  	String a = (String) s.getAttribute("unam");
  	
  	customerdao d=new customerdao();

         	if(d.signin(s1, s2)==1) {
         		
         	RequestDispatcher r=req.getRequestDispatcher("h1.html")	;
         	
         	r.forward(req, res);
         	}
         	else {
         		p.println("<b style='color:red'>invaliad username and password</b>");
         		RequestDispatcher r=req.getRequestDispatcher("signin.html")	;
             	
             	r.include(req, res);
         	}
         		

	}

}
