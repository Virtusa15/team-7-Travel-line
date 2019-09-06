package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Service;
import service.AdminService;


@WebServlet("/Updateservice")
public class Updateservice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 String sid=request.getParameter("Id");
	
		
	
             Service service = AdminService.searchByServiceNumber(sid);
		
		 request.setAttribute("service", service);
		 
		 
		  
		  RequestDispatcher requestDispatcher = request.getRequestDispatcher("modify_1.jsp");
		  requestDispatcher.forward(request, response);
		 
	}
}
