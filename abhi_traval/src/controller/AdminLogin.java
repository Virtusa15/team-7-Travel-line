package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Administrator;
import service.AdminService;

@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		writer.println(username);
		writer.println(password);
		
		Administrator administrator = new Administrator();
		administrator.setAdminName(username);
		administrator.setPassword(password);
		
		
		int adminLogin = AdminService.adminLogin(administrator);
		if(adminLogin>0) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/addservices.jsp");
			requestDispatcher.forward(request, response);
		}else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/admin.jsp");
			requestDispatcher.forward(request, response);
		}

	}

}
