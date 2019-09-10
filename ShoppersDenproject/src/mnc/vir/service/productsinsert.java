package mnc.vir.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mnc.vir.dao.productdao;


public class productsinsert extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		String s1=	req.getParameter("bid");
		System.out.println(s1);
		String s2=	req.getParameter("type");
		
		String s3=	req.getParameter("cost");
		
		int i2=Integer.parseInt(s3);
		String s4=	req.getParameter("image");
		System.out.println(s4);
		productdao d=new productdao() ;
		int l=0;
		l=d.insert(s1,s2,i2,s4);
		if(l!=0){
			RequestDispatcher r=req.getRequestDispatcher("adminlist.jsp")	;
	    	
	    	r.forward(req, res);	
		}
	
	}

}
