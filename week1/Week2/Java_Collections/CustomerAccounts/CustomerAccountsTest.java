public class CustomerAccountsTest {
    public static void main(String[] args) {
        CustomerAccounts accounts = new CustomerAccounts();

        // Test adding customers
        accounts.addCustomer(new Customer(101, "Alice Johnson", "alice.johnson@example.com"));
        accounts.addCustomer(new Customer(102, "Bob Smith", "bob.smith@example.com"));
        accounts.addCustomer(new Customer(100, "Charlie Brown", "charlie.brown@example.com"));

        // Display customers
        accounts.displayCustomers();

        // Test removing customers
        System.out.println("Removing Customer ID 102: " + accounts.removeCustomer(102));
        System.out.println("Removing Customer ID 999 (non-existent): " + accounts.removeCustomer(999));

        // Display customers after removal
        accounts.displayCustomers();
    }
}