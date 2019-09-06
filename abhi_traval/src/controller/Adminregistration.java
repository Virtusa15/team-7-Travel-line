package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Administrator;
import service.AdminService;

@WebServlet("/Adminregistration")
public class Adminregistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		PrintWriter writer = response.getWriter();
		
		
		String adminName = request.getParameter("adminName");
		String password = request.getParameter("password");
		
		
		
		Administrator administrator = new Administrator();
		administrator.setAdminName(adminName);
		administrator.setPassword(password);
	    int adminRegistration = AdminService.adminRegistration(administrator);
		
		if(adminRegistration>0) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/admin_reg_succ.jsp");
			requestDispatcher.forward(request, response);
		}else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/a.jsp");
			requestDispatcher.forward(request, response);
		}
		
		
		
		
		
		
	
	}

}
