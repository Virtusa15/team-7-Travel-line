package mnc.vir.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import mnc.vir.bean.customer;
import mnc.vir.bean.paymentproduct;
import mnc.vir.utility.DBConnection;

public class paymentdao {
	public int insert(paymentproduct c) {
		int r=0;
		Connection con=null;
		try{
			 con=DBConnection.getConnection();
			  
			  
			  PreparedStatement p =
			  con.prepareStatement("insert into customerorder values(?,?,?)");
			  
			  p.setString(1, c.getUid()); 
			  System.out.println("...............................");
			  p.setString(2, c.getName());
			  p.setDouble(3, c.getCost());
			 
			 r=p.executeUpdate(); 
			 if(r==0){ System.out.println("no query excuted"); }
			  else System.out.println("query excuted");
			  
			 
		
	}catch(java.sql.SQLIntegrityConstraintViolationException e){
		r=3;
		e.printStackTrace();
	}
		catch(Exception e){
			e.printStackTrace();
		}
		return r;

	}

}
