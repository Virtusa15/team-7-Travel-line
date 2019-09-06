package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.AdminService;


@WebServlet("/Feedback")
public class Feedback extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String comments = request.getParameter("comments");
		
		entity.Feedback feedback = new entity.Feedback();
		feedback.setName(name);
		feedback.setEmail(email);
		feedback.setComments(comments);
		int feedback2 = AdminService.feedback(feedback);
		System.out.println("after "+feedback2);
		System.out.println(feedback2);
		if(feedback2>0) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/feedback_succ.jsp");
			requestDispatcher.forward(request, response);
		}else {
			System.out.println("feed back page is faild");
		}
		
	}

}
