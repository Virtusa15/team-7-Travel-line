package mnc.vir.dao;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Base64;

import mnc.vir.bean.product;
import mnc.vir.utility.DBConnection;

public class productimagedao {
	public ArrayList get(String s) {
		
	ResultSet r=null;
	ArrayList<product> al=null;
	Connection con=null;
		try{
			System.out.println(s);
			al=new ArrayList<product>();
		
			 
			 con=DBConnection.getConnection();
			  System.out.println("dao"+s);
			  PreparedStatement p =
			  con.prepareStatement("select * from product where ptype=?");
			 
			  p.setString(1, s);
			 r = p.executeQuery();
			
			 
			 while (r.next()) {
				
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
			
		
	}catch(Exception e){
		e.printStackTrace();
	}
		return al;
		
}
}