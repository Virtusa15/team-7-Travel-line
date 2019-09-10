
package mnc.vir.dao;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Base64;

import mnc.vir.bean.product;
import mnc.vir.utility.DBConnection;

public class SearchProductda {
	public ArrayList get(String s1,String s2) {
		
		
		ArrayList<product> al=null;
		Connection con=null;
			try{
				System.out.println(s1);
				al=new ArrayList<product>();
			
				 
				 con=DBConnection.getConnection();				//s1=s1.toUpperCase();
				String s3=s1.substring(0, 2);
				System.out.println(s3);
				String s4="'"+s3+"%'";
				String s5="select * from product where ptype=? and PID like "+s4;
				System.out.println(s5);
				  PreparedStatement p =
				  con.prepareStatement(s5);
				 System.out.println("--------------------------------");
				  p.setString(1, s2);
				  ResultSet r=null;
				 r = p.executeQuery();
				 System.out.println(r);
				int verify=0;
			
				
				 while (r.next()) {
					verify=1;
		                product pro = new product();
		                String id = r.getString(1);
		                String type = r.getString(2);
		                int cost = r.getInt(3);
		                Blob blob = r.getBlob(4);
		                 
		                InputStream inputStream = blob.getBinaryStream();
		                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		                byte[] buffer = new byte[4096];
		                int bytesRead = -1;
		                 
		                while ((bytesRead = inputStream.read(buffer)) != -1) {
		                    outputStream.write(buffer, 0, bytesRead);                  
		                }
		                 
		                byte[] imageBytes = outputStream.toByteArray();
		                String base64Image = Base64.getEncoder().encodeToString(imageBytes);
		                 
		                 
		                inputStream.close();
		                outputStream.close();
		                 
		               pro.setPid(id);
		               pro.setPtype(type);
		               pro.setCost(cost);
		               pro.setImg(base64Image);
		               al.add(pro);
		               
				 }
if(verify!=1) {
	 con=DBConnection.getConnection();
					ResultSet rs=null;
					PreparedStatement ps =
							  con.prepareStatement("select * from product where ptype=? ");
							 
							  ps.setString(1, s2);
							
							 rs = ps.executeQuery();
							 
							 while (rs.next()) {
									
					                product pro = new product();
					                String id = rs.getString(1);
					                String type = rs.getString(2);
					                int cost = rs.getInt(3);
					                Blob blob = rs.getBlob(4);
					                 
					                InputStream inputStream = blob.getBinaryStream();
					                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
					                byte[] buffer = new byte[4096];
					                int bytesRead = -1;
					                 
					                while ((bytesRead = inputStream.read(buffer)) != -1) {
					                    outputStream.write(buffer, 0, bytesRead);                  
					                }
					                 
					                byte[] imageBytes = outputStream.toByteArray();
					                String base64Image = Base64.getEncoder().encodeToString(imageBytes);
					                 
					                 
					                inputStream.close();
					                outputStream.close();
					                 
					               pro.setPid(id);
					               pro.setPtype(type);
					               pro.setCost(cost);
					               pro.setImg(base64Image);
					               al.add(pro);
					               
							 }
				}
				
			
		}catch(Exception e){
			e.printStackTrace();
		}
			return al;
			
	}

}
