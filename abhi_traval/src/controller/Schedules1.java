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

/**
 * Servlet implementation class Schedules1
 */
@WebServlet("/Schedules1")
public class Schedules1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ArrayList<Service> schedules = AdminService.schedules();

		request.setAttribute("schedules", schedules);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/scheduales1.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
