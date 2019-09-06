package Dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DatabaseConnection {

	public static Connection getConnection() {
		   Connection connection=null;
		/*
		 * FileReader reader; Properties p = null; try { reader = new
		 * FileReader("db.properties"); p=new Properties(); p.load(reader); } catch
		 * (IOException e1) { e1.printStackTrace(); }
		 * 
		 * String url = p.getProperty("url"); String userName =
		 * p.getProperty("userName"); String password = p.getProperty("password");
		 */
		
		try {
			 connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
