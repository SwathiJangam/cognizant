import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {
    private Map<Integer, Product> inventory;

    public InventoryManagement() {
        inventory = new HashMap<>();
    }

    // 4. Add Products
    public void addProduct(Product product) {
        inventory.put(product.getId(), product);
    }

    // 5. Remove Products
    public boolean removeProduct(int productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
            return true;
        }
        return false;
    }

    // 6. Update Product Quantity
    public boolean updateProductQuantity(int productId, int newQuantity) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(newQuantity);
            return true;
        }
        return false;
    }

    // 7. Display Products
    public void displayProducts() {
        if (inventory.isEmpty()) {
            System.out.println("No products in the inventory.");
        } else {
            System.out.println("Inventory:");
            for (Product product : inventory.values()) {
                System.out.println(product);
            }
        }
    }
}