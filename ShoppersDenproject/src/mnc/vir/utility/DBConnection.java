package mnc.vir.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	 static Connection con=null;
	public static Connection getConnection() {
		try {
	 Class.forName("oracle.jdbc.driver.OracleDriver");
	  
	  
	  con=DriverManager.getConnection(
	  "jdbc:oracle:thin:@localhost:1521:xe","system","root");
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
	return con;
	}

}
