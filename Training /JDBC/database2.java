package datab;

import java.sql.*;
import java.util.Scanner;

public class database2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/anki";
        String user = "root";
        String password = "ANki123@";

        try (
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            Scanner sc = new Scanner(System.in)
        ) {

            String createTableSQL =   "CREATE TABLE patients	 (" +
        		    "id INT AUTO_INCREMENT PRIMARY KEY, " +
        		    "name VARCHAR(100), " +
        		    "age INT)";
          //  stmt.executeUpdate(createTableSQL);
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

                String insertSQL = "INSERT INTO patients (name, age) VALUES (?, ?)";
                try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
                    pstmt.setString(1, name);
                    pstmt.setInt(2, age);
                    pstmt.executeUpdate();
                    System.out.println("Patient inserted.");
                }
            }

            ResultSet rs = stmt.executeQuery("SELECT * FROM patients");

            System.out.println("\n Patient List:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id + " | " + name + " | " + age);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
