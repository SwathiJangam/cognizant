public class EmployeeManagementTest {
    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement();

        // Test adding employees
        management.addEmployee(new Employee(1, "Alice", "123 Main St"));
        management.addEmployee(new Employee(2, "Bob", "456 Oak Ave"));
        management.addEmployee(new Employee(3, "Charlie", "789 Maple Dr"));

        // Display employees
        management.displayEmployees();

        // Test updating employee
        management.updateEmployee(2, "123 Elm St");
        System.out.println("Updated Bob's address.");
        management.displayEmployees();

        // Test removing employee
        management.removeEmployee(3);
        System.out.println("Removed Charlie.");
        management.displayEmployees();
    }
}