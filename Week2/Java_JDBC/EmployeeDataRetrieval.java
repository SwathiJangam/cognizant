import java.sql.*;

public class EmployeeDataRetrieval {

    private static final String URL = "jdbc:mysql://localhost:3306/employee_db";
    private static final String USER = "root";
    private static final String PASSWORD = "Benny@2326";

    public static void main(String[] args) {
        addEmployee("Elz", "Security Analyst", 55000.0);
        addEmployee("lily", "Support Executive", 50000.0);
        addEmployee("Joel", "Data Analyst", 60000.0);

        updateEmployee(13, "Joy", "Senior Security Analyst", 60000.0);

        deleteEmployee(16);

        displayEmployees();
    }

    public static void addEmployee(String name, String position, double salary) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "INSERT INTO employees (name, position, salary) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, position);
            preparedStatement.setDouble(3, salary);
            preparedStatement.executeUpdate();

            System.out.println("Employee added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateEmployee(int id, String name, String position, double salary) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "UPDATE employees SET name = ?, position = ?, salary = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, position);
            preparedStatement.setDouble(3, salary);
            preparedStatement.setInt(4, id);
            preparedStatement.executeUpdate();

            System.out.println("Employee with ID " + id + " updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteEmployee(int id) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "DELETE FROM employees WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

            System.out.println("Employee with ID " + id + " deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void displayEmployees() {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {
            String query = "SELECT id, name, position, salary FROM employees";
            ResultSet resultSet = statement.executeQuery(query);

            System.out.println("Employee Records:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String position = resultSet.getString("position");
                double salary = resultSet.getDouble("salary");

                System.out.println("ID: " + id + ", Name: " + name + ", Position: " + position + ", Salary: " + salary);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
