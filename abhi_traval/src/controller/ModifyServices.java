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

@WebServlet("/ModifyServices")
public class ModifyServices extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArrayList<Service> modifications = AdminService.schedules();
		request.setAttribute("modifications", modifications);	
		System.out.println("SHAdsac");
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/modify.jsp");
		requestDispatcher.forward(request, response);
		
		
	}

}
