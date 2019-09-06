package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import entity.Administrator;
import entity.Feedback;
import entity.Service;

public class AdminDao {

	
	
	public static int adminRegistration(Administrator administrator) {
		
		PreparedStatement prepareStatement=null;
		 int executeUpdate=0;
		
		 
		Connection connection = DatabaseConnection.getConnection();
		
		try {
	     prepareStatement = connection.prepareStatement("insert into Administrator(admin_id,admin_name,admin_password) values(admin_id.nextval,?,?)");
	     prepareStatement.setString(1, administrator.getAdminName());
	     prepareStatement.setString(2, administrator.getPassword());
	     executeUpdate = prepareStatement.executeUpdate();
	     connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return executeUpdate;
		
	}
	
	
	
	public static int adminLogin(Administrator administrator) {
		
		PreparedStatement prepareStatement=null;
        int count=0;
		
		Connection connection = DatabaseConnection.getConnection();
		
		try {
		   prepareStatement = connection.prepareStatement("select admin_name,admin_password from administrator where admin_name=? AND admin_password=?");
		   prepareStatement.setString(1,administrator.getAdminName());
		   prepareStatement.setString(2, administrator.getPassword());
		   ResultSet executeQuery = prepareStatement.executeQuery();
		   while(executeQuery.next()) {
			   count++;
		   }
		   connection.close();
		   
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
	
	
	public static int feedback(Feedback feedback) {
		
		System.out.println("fb dao is called");
		
		PreparedStatement prepareStatement=null;
		int executeUpdate=0;
		
		Connection connection = DatabaseConnection.getConnection();
		
		try {
			 prepareStatement = connection.prepareStatement("insert into feedback(feedback_id,coustomer_name,main_id,comments) values(feedback_id.nextval,?,?,?)");
			 prepareStatement.setString(1, feedback.getName());
			 prepareStatement.setString(2, feedback.getEmail());
			 prepareStatement.setString(3, feedback.getComments());
		     executeUpdate = prepareStatement.executeUpdate();
		     System.out.println(executeUpdate);
		     connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return executeUpdate;
	}
	
	
	
	
	public static ArrayList<Feedback> viewFeedback() {
		
		Statement statement=null;
		ArrayList<Feedback> arrayList = new ArrayList<Feedback>();
		Connection connection = DatabaseConnection.getConnection();
		try {
			statement = connection.createStatement();
			ResultSet executeQuery = statement.executeQuery("select * from feedback");
			while(executeQuery.next()) {
               Feedback feedback = new Feedback();
               feedback.setName(executeQuery.getString(2));	
               feedback.setEmail(executeQuery.getString(3));
               feedback.setComments(executeQuery.getString(4));
               arrayList.add(feedback);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arrayList;
	}
	
	
	
	

	public static int addService(Service service) {
		
		PreparedStatement prepareStatement=null;
		 int executeUpdate=0;
		
		
		String sql="insert into service(service_id,sr_from,sr_to,bustype,fare,distance,capacity,departure_time,journey_time,service_no) "
				+ "values(service_id.nextval,?,?,?,?,?,?,?,?,?)";
		Connection connection = DatabaseConnection.getConnection();
		
		
		/*
		 * 
		 * insert into service(service_id,sr_from,sr_to,bustype,fare,distance,capacity,departure_time
              ,journey_time,service_no) values(service_id.nextval,'hyb','nlr','sleeper',1000,100,20,'6:00','7:ooa.m','s1000');
		 * 
		 * 
		 */
	
		try {
			 prepareStatement = connection.prepareStatement(sql);
			 prepareStatement.setString(1,service.getFrom());
			 prepareStatement.setString(2, service.getTo());
			 prepareStatement.setString(3,service.getBustype());
			 prepareStatement.setInt(4, service.getFare());
			 prepareStatement.setInt(5, service.getDistance());
			 prepareStatement.setInt(6, service.getCapacity());
			 prepareStatement.setString(7, service.getDeparturetime());
			 prepareStatement.setString(8, service.getJournytime());
			 prepareStatement.setString(9, service.getServiceno());
			 executeUpdate = prepareStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return executeUpdate;
	}
	
	
	public static  ArrayList<Service> schedules() {
		
		Connection connection = DatabaseConnection.getConnection();
		ArrayList<Service> arrayList = new ArrayList<Service>();
		
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from service");
			
			while(resultSet.next()) {
				Service service = new Service();
				service.setFrom(resultSet.getString(2));
				service.setTo(resultSet.getString(3));
				service.setBustype(resultSet.getString(4));
				service.setFare(resultSet.getInt(5));
				service.setDistance(resultSet.getInt(6));
				service.setCapacity(resultSet.getInt(7));
				service.setDeparturetime(resultSet.getString(8));
				service.setJournytime(resultSet.getString(9));
				service.setServiceno(resultSet.getString(10));
				arrayList.add(service);
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return arrayList;
	}
	
	
public static Service searchByServiceNumber(String sid) {
		
		
		PreparedStatement prepareStatement=null;
		
		Service service = new Service();
		Connection connection = DatabaseConnection.getConnection();
		
		try {
		  prepareStatement = connection.prepareStatement("select * from service where service_no=?");
		  prepareStatement.setString(1,sid);
		  ResultSet resultSet = prepareStatement.executeQuery();
		  
		 

		  
		  while(resultSet.next()) {
		   	    
			  service.setFrom(resultSet.getString(2));
			  service.setTo(resultSet.getString(3));
			  service.setBustype(resultSet.getString(4));
			  service.setFare(resultSet.getInt(5));
			  service.setDistance(resultSet.getInt(6));
			  service.setCapacity(resultSet.getInt(7));
			  service.setDeparturetime(resultSet.getString(8));
			  service.setJournytime(resultSet.getString(9));
			  service.setServiceno(resultSet.getString(10));
		  }
		  
		  
		}  
		catch (SQLException e) {
			e.printStackTrace();
		}
		return service;

	}
	


     public static int update(Service service) {
    	 
    	 
    	 PreparedStatement prepareStatement=null;
    	 int executeUpdate=0;
    	 
    	 String sql="UPDATE service SET sr_from =?,sr_to = ?,bustype = ?,distance =?,departure_time=?,journey_time=?,fare=?,capacity=? WHERE service_no=?";
    	 		
    	 Connection connection = DatabaseConnection.getConnection();
    	 
    	 
    	 
		
		  try { 
			 prepareStatement = connection.prepareStatement(sql); 
			 prepareStatement.setString(1, service.getFrom());
			 prepareStatement.setString(2, service.getTo());
			 prepareStatement.setString(3, service.getBustype());
			 prepareStatement.setInt(4,service.getDistance());
			 prepareStatement.setString(5, service.getDeparturetime());
			 prepareStatement.setString(6,service.getJournytime());
			 prepareStatement.setInt(7, service.getFare());
			 prepareStatement.setInt(8, service.getCapacity());
			 prepareStatement.setString(9, service.getServiceno());
			 executeUpdate = prepareStatement.executeUpdate();
			 connection.close();
		  } catch (SQLException e) {
		  e.printStackTrace(); 
		  }
		  
		   return executeUpdate;	 
     }

















	
	
	
	
	
	
	
}
