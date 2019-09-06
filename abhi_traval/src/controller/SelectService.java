package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Service;
import service.UserService;


@WebServlet("/SelectService")
public class SelectService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter writer = response.getWriter();
		
		String sid = request.getParameter("Id");
		
		Service selectSerice = UserService.selectSerice(sid);
		System.out.println(selectSerice);
		request.setAttribute("selectSerice",selectSerice);
		
		
		
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/seat_selection.jsp");
		requestDispatcher.forward(request, response);
	}

}
