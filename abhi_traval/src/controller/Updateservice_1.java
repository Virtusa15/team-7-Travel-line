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
import service.AdminService;

@WebServlet("/Updateservice_1")
public class Updateservice_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		PrintWriter writer = response.getWriter();
		
		String serviceno = request.getParameter("serviceno");
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		String bustype = request.getParameter("bustype");
		int distance = Integer.parseInt(request.getParameter("distance"));
		String departuretime = request.getParameter("departuretime");
		String journytime = request.getParameter("journytime");
		int fare = Integer.parseInt(request.getParameter("fare"));
		int capacity = Integer.parseInt(request.getParameter("capacity"));


		Service service = new Service();
		
		
		service.setServiceno(serviceno);
		service.setFrom(from);
		service.setTo(to);
		service.setBustype(bustype);
		service.setDistance(distance);
		service.setDeparturetime(departuretime);
		service.setJournytime(journytime);
		service.setFare(fare);
		service.setCapacity(capacity);


		
		int update = AdminService.update(service);
		
		if(update>0) {
			writer.println("record update seucc..");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/update_succ.jsp");
			requestDispatcher.forward(request, response);
		}else {
			writer.println("record is not updated");

		}
		
		
		

		
	}

}
