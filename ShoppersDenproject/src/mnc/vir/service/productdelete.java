package mnc.vir.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mnc.vir.dao.productdeletedao;


public class productdelete extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int count=0;
		String s1=req.getParameter("pid");
		System.out.println(s1);
		productdeletedao d=new productdeletedao();
		count=d.delete(s1);
		if(count!=0) {
RequestDispatcher r=req.getRequestDispatcher("adminlist.jsp")	;
	    	
	    	r.forward(req, res);	
		}
		
	}

}
