import java.util.LinkedList;

public class OrderTracking {
    private LinkedList<Order> orders;

    public OrderTracking() {
        orders = new LinkedList<>();
    }

    // 4. Add Orders
    public void addOrder(Order order) {
        orders.add(order);
    }

    // 5. Process Orders
    public Order processOrder() {
        if (orders.isEmpty()) {
            System.out.println("No orders to process.");
            return null;
        }
        return orders.poll(); // Retrieves and removes the first order (FIFO)
    }

    // 6. Display Orders
    public void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders in the list.");
        } else {
            System.out.println("Current Orders:");
            for (Order order : orders) {
                System.out.println(order);
            }
        }
    }
}