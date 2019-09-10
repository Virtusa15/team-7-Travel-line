package mnc.vir.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import mnc.vir.utility.DBConnection;

public class productdeletedao {
	public int delete(String s1) {
		Connection con=null;
		int count=0;
		try{
			
			System.out.println(s1);
			 con=DBConnection.getConnection();
			 
			  PreparedStatement p =
			  con.prepareStatement("delete from product where PID=?");
			  
			  p.setString(1,s1); 
			 
			 count=p.executeUpdate(); 
			 if(count==0){ System.out.println("no query excuted"); }
			  else System.out.println("query excuted");
			  
			 
		
	}
		catch(Exception e){
			e.printStackTrace();
		}
		return count;



}
}
