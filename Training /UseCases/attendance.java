package jdbc;
 
import java.sql.*;
 
public class connectiondb
{
public static void main(String[] args)
	{
 
	try {
		//Load JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anki", "root", "ANki123@");
		
		System.out.println("Connected Successsfully");
		con.close();
	 }
	catch (Exception e)
	{
	e.printStackTrace();
			
	}
	}
}
 
 