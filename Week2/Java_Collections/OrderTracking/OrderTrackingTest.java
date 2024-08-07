public class OrderTrackingTest {
    public static void main(String[] args) {
        OrderTracking tracking = new OrderTracking();

        // Test adding orders
        tracking.addOrder(new Order(1, "Pizza with extra cheese"));
        tracking.addOrder(new Order(2, "Spaghetti Bolognese"));
        tracking.addOrder(new Order(3, "Caesar Salad"));

        // Display orders
        tracking.displayOrders();

        // Test processing orders
        System.out.println("Processing order: " + tracking.processOrder());
        System.out.println("Processing order: " + tracking.processOrder());

        // Display orders after processing
        tracking.displayOrders();

        // Test processing when no orders are left
        System.out.println("Processing order: " + tracking.processOrder());
        System.out.println("Processing order: " + tracking.processOrder()); // No orders to process
    }
}