package mnc.vir.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import mnc.vir.utility.DBConnection;

public class admindao {
	public int signin(String s1,String s2) {
		int i=0;
		Connection con=null;
		try{
			System.out.println(s1);
			System.out.println(s2);
			  
			  con=DBConnection.getConnection();
			  
			  PreparedStatement p =
			  con.prepareStatement("select count(*) from admin where adid=? and apsw=?");
			 
			  p.setString(1,s1);
			  p.setString(2, s2);
			 ResultSet r = p.executeQuery();
			if(r.next()){
				
				i=r.  getInt(1);
			
				System.out.println(i);
			}
		
	}catch(Exception e){
		e.printStackTrace();
	}
		return i;
		
		

	}

}
