public class InventoryManagementTest {
    public static void main(String[] args) {
        InventoryManagement management = new InventoryManagement();

        // Test adding products
        management.addProduct(new Product(1, "Laptop", 10));
        management.addProduct(new Product(2, "Smartphone", 20));
        management.addProduct(new Product(3, "Tablet", 15));

        // Display products
        management.displayProducts();

        // Test updating product quantity
        System.out.println("Updating quantity of Product ID 2 to 25: " + management.updateProductQuantity(2, 25));
        System.out.println("Updating quantity of Product ID 4 (non-existent): " + management.updateProductQuantity(4, 30));

        // Display products after update
        management.displayProducts();

        // Test removing products
        System.out.println("Removing Product ID 3: " + management.removeProduct(3));
        System.out.println("Removing Product ID 4 (non-existent): " + management.removeProduct(4));

        // Display products after removal
        management.displayProducts();
    }
}