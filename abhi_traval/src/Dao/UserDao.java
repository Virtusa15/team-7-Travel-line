package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import entity.Service;

public class UserDao {

	
	public static  ArrayList<Service> searchService(Service s1) {
		
		
		String sql="select * from service where sr_from=? AND sr_to=?";
		
		Connection connection = DatabaseConnection.getConnection();
		
		 PreparedStatement prepareStatement=null;
		 ResultSet executeQuery =null;
		 ArrayList<Service> arrayList = new ArrayList<Service>();
		 
		try {
		prepareStatement = connection.prepareStatement(sql);
		prepareStatement.setString(1,s1.getFrom()); 
		prepareStatement.setString(2,s1.getTo());
	    executeQuery = prepareStatement.executeQuery();
	    
	    while(executeQuery.next()) {
	    	Service service = new Service();
	    	service.setServiceno(executeQuery.getString("service_no"));
	    	service.setDeparturetime(executeQuery.getString("departure_time"));
	    	service.setJournytime(executeQuery.getString("journey_time"));
	    	service.setFare(executeQuery.getInt("fare"));
	    	arrayList.add(service);
	    }	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arrayList;
	}
	
	
	
	
}
