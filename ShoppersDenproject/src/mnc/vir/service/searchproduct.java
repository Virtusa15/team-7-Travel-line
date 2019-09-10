package mnc.vir.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mnc.vir.bean.item;
import mnc.vir.bean.product;
import mnc.vir.utility.Order;
import oracle.net.aso.s;




public class searchproduct extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
	
            throws ServletException, IOException {
	
		 HttpSession session = req.getSession();
		 Order o=(Order) session.getAttribute("order");
		
		 System.out.println(o);
		
		 System.out.println(req.getParameter("id"));
    String id=req.getParameter("id");
    System.out.println(id);
    String cost=req.getParameter("cost");
    int cost1=Integer.parseInt(cost);
    System.out.println(cost);
    String type=req.getParameter("type");
  String item=req.getParameter("search");

  System.out.println(item);
 
    System.out.println(type);
       
       item i=new item();
       i.setCost(cost1);
       i.setIname(id);
     
       o.addProduct(i);
   
   
      System.out.println(i);
    System.out.println(o);
    String s5="searchitem.jsp?search="+item+"&category="+type;
    System.out.println(s5);
       session.setAttribute("order", o);
       RequestDispatcher requestDispatcher = req.getRequestDispatcher(s5);
       requestDispatcher.forward(req, res);
       
         
	}

}


