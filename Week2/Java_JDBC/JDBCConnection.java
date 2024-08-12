import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    
    // Database URL, username and password
    private static final String URL = "jdbc:mysql://localhost:3306/employee_db";
    private static final String USER = "root"; // Replace with your MySQL username
    private static final String PASSWORD = "Benny@2326"; // Replace with your MySQL password
    
    /**
     * Establishes a connection to the database and returns the Connection object.
     * 
     * @return Connection object
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            // Register MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection to the database
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection to MySQL database employee_db established successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection to MySQL database failed!");
            e.printStackTrace();
            throw e;
        }
        return connection;
    }

    public static void main(String[] args) {
        // Test the connection
        try (Connection connection = getConnection()) {
            if (connection != null) {
                System.out.println("Connection object is successful!");
            } else {
                System.out.println("Failed to establish connection!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
