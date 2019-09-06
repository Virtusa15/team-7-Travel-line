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

@WebServlet("/AddServlet")
public class AddService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String from = request.getParameter("from");
		String to = request.getParameter("to");
		String bustype = request.getParameter("bustype");
		int fare = Integer.parseInt(request.getParameter("fare"));
		int distance = Integer.parseInt(request.getParameter("distance"));
		int capacity = Integer.parseInt(request.getParameter("capacity"));
		String journytime = request.getParameter("journytime");
		String serviceno = request.getParameter("serviceno");
		String departuretime = request.getParameter("departuretime");
		
		Service service = new Service();
		
		service.setFrom(from);
		service.setTo(to);
		service.setBustype(bustype);
		service.setFare(fare);
		service.setDistance(distance);
		service.setCapacity(capacity);
		service.setJournytime(journytime);
		service.setServiceno(serviceno);
		service.setDeparturetime(departuretime);
		
		int addService = AdminService.addService(service);
		
		if(addService>0) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("addservices_succ.jsp");
			requestDispatcher.forward(request, response);
		}else {
			System.out.println("we got error in addservice");
		}
		
		
		
	}

}
