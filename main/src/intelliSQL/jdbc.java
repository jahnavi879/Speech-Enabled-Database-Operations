package intelliSQL;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class jdbc {
	
	

	public static void main(String args[]) throws ClassNotFoundException
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		 } 
		catch(ClassNotFoundException e) {
	         System.out.println("Class not found "+ e);
	      }
	      try 
	      {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Anirban.87");
			
			Statement stmt = conn.createStatement();
	         
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM OSS");
	        		 
	        System.out.println("firstname   lastname      sapid       marks");
	         
	        while(rs.next())
	        {
	        	System.out.println(rs.getString("firstname")+"    "+rs.getString("lastname")+"     "+rs.getLong("sapid")+"     "+rs.getInt("marks"));
	         
	         }
	         stmt.close();
	         conn.close();
		}
	         
	catch(SQLException e)
		{
			System.out.println("SQL exception occured" + e);
		}
	
}
}