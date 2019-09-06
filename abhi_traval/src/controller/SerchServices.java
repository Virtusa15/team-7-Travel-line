package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Service;
import service.UserService;

@WebServlet("/SerchServices")
public class SerchServices extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		PrintWriter writer = response.getWriter();
		
		String from = request.getParameter("from");
		String to = request.getParameter("to");
	    String date = request.getParameter("date");
        int numberOfPassengers = Integer.parseInt(request.getParameter("num"));
		
		System.out.println(from+" "+to+" "+date+" "+numberOfPassengers);
        
		  HttpSession session = request.getSession();
		  session.setAttribute("date",date); 
		  session.setAttribute("numberOfPassengers", numberOfPassengers);
		 

        
		Service service = new Service();
		service.setFrom(from);
		service.setTo(to);
		
		 ArrayList<Service> searchservice = UserService.searchservice(service);
		
		System.out.println(searchservice);
		request.setAttribute("searchservice", searchservice);
		if(searchservice.size()>0) {
			System.out.println("if block");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/select_service.jsp");
			requestDispatcher.forward(request, response);
		}  else {
			  RequestDispatcher requestDispatcher = request.getRequestDispatcher("/select_service_fail.jsp");
			  requestDispatcher.forward(request, response); 
	    }
			 
		
		
	}

}
