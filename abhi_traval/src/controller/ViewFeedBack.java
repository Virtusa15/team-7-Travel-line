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

import entity.Feedback;
import service.AdminService;


@WebServlet("/ViewFeedBack")
public class ViewFeedBack extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter writer = response.getWriter();
		ArrayList<Feedback> viewFeedback = AdminService.viewFeedback();
		
		
		for (Feedback feedback : viewFeedback) {
			System.out.println(feedback.getName()+feedback.getEmail()+feedback.getComments());
		}
		
		
		request.setAttribute("viewFeedback", viewFeedback);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/viewfeedback.jsp");
		requestDispatcher.forward(request, response);
	}

}
