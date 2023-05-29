package za.ac.ukzn.dbinterface.Database;

import java.sql.*;

public class DatabaseConnection {
    private Connection connection;
    public void connect() {
        String url = "jdbc:mysql://localhost:3306/comp306project";
        String username = "root";
        String password = "020530";
        
        try {
            // Step 1: Register the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Step 2: Establish the connection
            connection = DriverManager.getConnection(url, username, password);
            
            System.out.println("Connection established successfully");
            
        } catch (ClassNotFoundException e) {
            System.out.println("Error: JDBC driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to the database");
            e.printStackTrace();
        }
    }
    public void disconnect() {
        try {
            connection.close();
            System.out.println("Successfully terminated connection");
        } catch (SQLException e) {
            System.out.println("Error while disconnecting database");
            e.printStackTrace();
        }
    }
}