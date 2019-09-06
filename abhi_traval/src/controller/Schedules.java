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

import entity.Service;
import service.AdminService;

@WebServlet("/Schedules")
public class Schedules extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Service> schedules = AdminService.schedules();

		System.out.println(schedules);
		request.setAttribute("schedules", schedules);
        if(schedules.size()>0) {
        	RequestDispatcher requestDispatcher = request.getRequestDispatcher("/scheduales.jsp");
    		requestDispatcher.forward(request, response);
        }else {
			System.out.println("getting error in scheduals");
		}
	
	}

}
