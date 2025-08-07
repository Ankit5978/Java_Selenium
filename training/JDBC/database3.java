package datab;

import java.sql.*;
import java.util.Scanner;

public class database3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/anki";
        String user = "root";
        String password = "ANki123@";

        try (
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            Scanner sc = new Scanner(System.in)
        ) {

            String createTableSQL = "CREATE TABLE patient4 (" +
        		    "id INT AUTO_INCREMENT PRIMARY KEY, " +
        		    "name VARCHAR(100), " +
        		    "age INT,"+
        		    "disease VARCHAR(100),"+
        		    "admission_date DATE)";	
           stmt.executeUpdate(createTableSQL);
            System.out.println(" Table is ready.");

            System.out.print("Enter number of patients to add: ");
            int n = sc.nextInt();
            sc.nextLine(); 

            for (int i = 0; i < n; i++) {
                System.out.println("\nPatient " + (i + 1) + ":");

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter age: ");
                int age = sc.nextInt();
                sc.nextLine();
                
                System.out.print("Enter disease: ");
                String disease = sc.nextLine();

                System.out.print("Enter admission date (yyyy-mm-dd): ");
                String dateStr = sc.nextLine();

                String insertSQL = "INSERT INTO patient4 (name, age, disease, admission_date) VALUES (?, ?, ?,?)";
                try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
                    pstmt.setString(1, name);
                    pstmt.setInt(2, age);
                    
                    pstmt.setString(3, disease);

                    pstmt.setDate(4, Date.valueOf(dateStr));
                    pstmt.executeUpdate();
                    System.out.println(" Patient inserted.");
                }
            }

            ResultSet rs = stmt.executeQuery("SELECT * FROM patient4");
            
            System.out.println("\n Patient List:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String disease = rs.getString("disease");

                Date date = rs.getDate("admission_date");

                System.out.println(id + " | " + name + " | " + age + " | " + disease + " | " + date);
            }
            
            System.out.print("\nEnter the patient name you want to delete: ");
            String deleteName = sc.nextLine();

            String deleteSQL = "DELETE FROM patient4 WHERE name = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {
                pstmt.setString(1, deleteName);
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("️ Patient with name " + deleteName + " deleted successfully.");
                } else {
                    System.out.println(" No patient found with name " + deleteName);
                }
            }

      

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
