package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class DBConnection {
 
    public static Connection createConnection()
    {
    	Connection con = null;
	    String url = "jdbc:mysql://localhost:3306/usercrud";
	    String username = "root";
	    String password = "admin";
 
    try
    {
    	try {
    	    Class.forName("com.mysql.jdbc.Driver");
    	} catch (ClassNotFoundException e1) {
    	    e1.printStackTrace();
    	}
        
        con = DriverManager.getConnection(url, username, password);
        System.out.println("Post establishing a DB connection - "+con);
    }
    catch (SQLException e)
    {
    	 System.out.println("An Server Process! try again");
         e.printStackTrace();
    }
    
	return con;
    }
}
