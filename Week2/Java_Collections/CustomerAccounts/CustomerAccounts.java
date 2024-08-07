import java.util.TreeMap;

public class CustomerAccounts {
    private TreeMap<Integer, Customer> customers;

    public CustomerAccounts() {
        customers = new TreeMap<>();
    }

    // 4. Add Customers
    public void addCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    // 5. Remove Customers
    public boolean removeCustomer(int customerId) {
        if (customers.containsKey(customerId)) {
            customers.remove(customerId);
            return true;
        }
        return false;
    }

    // 6. Display Customers
    public void displayCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers in the system.");
        } else {
            System.out.println("Customer List (sorted by ID):");
            for (Customer customer : customers.values()) {
                System.out.println(customer);
            }
        }
    }
}