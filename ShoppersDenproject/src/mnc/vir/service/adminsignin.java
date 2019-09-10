package mnc.vir.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mnc.vir.dao.admindao;


 
public class adminsignin extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 PrintWriter p=res.getWriter();

 		String s1=req.getParameter("aname");
 		String s2=req.getParameter("apsw");
 		
 		admindao d=new admindao();

    	if(d.signin(s1, s2)==1) {
    		
    	RequestDispatcher r=req.getRequestDispatcher("adminlist.jsp")	;
    	
    	r.forward(req, res);
    	}
    	else {
    		p.println("<b style='color:red'>invaliad username and password</b>");
    		RequestDispatcher r=req.getRequestDispatcher("admin.html")	;
        	
        	r.include(req, res);
    	}
    		

 		
	}
}
