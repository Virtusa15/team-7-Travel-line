package mnc.vir.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import mnc.vir.utility.DBConnection;

public class productdao {
	public int insert(String i1,String s2,int i2,String s1) {
		int r=0;
		File f=null;
		InputStream i=null;
		Connection con=null;
		try{
			System.out.println(i1);
			System.out.println(i2);
			System.out.println(s1);
			i1=i1.toUpperCase();
			 con=DBConnection.getConnection();
			 
			  f=new File(s1);
			  i=new FileInputStream(f);
			  PreparedStatement p =
			  con.prepareStatement("insert into product values(?,?,?,?)");
			  
			  p.setString(1,i1); 
			  System.out.println("...............................");
			  p.setString(2, s2);
			  p.setInt(3, i2);
			  
			  p.setBlob(4, i,(int) f.length());
			 r=p.executeUpdate(); 
			 if(r==0){ System.out.println("no query excuted"); }
			  else System.out.println("query excuted");
			  
			 
		
	}
		catch(Exception e){
			e.printStackTrace();
		}
		return r;



}
}