package datab;
import java.sql.*;

public class database1{
    public static void main(String[] args) {

	
    try (Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/anki", "root", "ANki123@");
         Statement stmt = conn.createStatement()) {	

    	String SQL = 
    		    "CREATE TABLE patient (" +
    		    "id INT AUTO_INCREMENT PRIMARY KEY, " +
    		    "name VARCHAR(100), " +
    		    "age INT)";
        
        stmt.executeUpdate(SQL);
        System.out.println(" Table created");

        String insertSQL = """
            INSERT INTO patient (name, age) VALUES
            ('amn', '21'),
            ('rohit', '24'),
            ('ansh', '23');
        """;
        stmt.executeUpdate(insertSQL);
        System.out.println(" Data inserted");

        ResultSet rs = stmt.executeQuery("SELECT * FROM patient");

        System.out.println("\n Person List:");
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String age = rs.getString("age");

            System.out.println(id + " | " + name + " | " + age);
        }

        rs.close(); 

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}