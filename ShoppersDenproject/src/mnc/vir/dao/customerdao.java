package mnc.vir.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import mnc.vir.bean.customer;
import mnc.vir.utility.DBConnection;

public class customerdao {

	public int insert(customer c) {
		int r=0;
		Connection con=null;
		try{
			
			 con=DBConnection.getConnection();
			  
			  
			  PreparedStatement p =
			  con.prepareStatement("insert into customer values(?,?,?,?,?,?)");
			  
			  p.setString(1, c.getName()); 
			  System.out.println("...............................");
			  p.setString(2, c.getEmail());
			  p.setDouble(3, c.getMobile());
			  p.setString(4, c.getAddr());
			  p.setString(5, c.getUserid()); 
			  p.setString(6, c.getPassword()); 
			  
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
	public customer get(String s) {
		customer c=null;
		Connection con=null;
		try{
			 c=new customer();
			 con=DBConnection.getConnection();
			  
			  System.out.println(s);
			  PreparedStatement p =
			  con.prepareStatement("select * from customer where userid=?");
			 
			  p.setString(1, s);
			 ResultSet r = p.executeQuery();
			if (r.next()) {
				
				c.setUserid(r.getString(5));
			
				c.setAddr(r.getString(4));
				c.setEmail(r.getString(2));
				c.setName(r.getString(1));
				c.setPassword(r.getString(6));
				c.setMobile(r.getDouble(3));
			}
			 
		
	}catch(Exception e){
		e.printStackTrace();
	}
		return c;
		

	}
	public int signin(String s1,String s2) {
		int i=0;
		Connection con=null;
		try{
			
			 con=DBConnection.getConnection();
			  
			  
			  PreparedStatement p =
			  con.prepareStatement("select count(*) from customer where userid=? and password=?");
			 
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
	

