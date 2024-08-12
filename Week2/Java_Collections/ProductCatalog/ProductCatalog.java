import java.util.HashSet;
import java.util.Set;

public class ProductCatalog {
    private Set<String> products;

    public ProductCatalog() {
        products = new HashSet<>();
    }

    // 3. Add Products
    public boolean addProduct(String productName) {
        return products.add(productName);
    }

    // 4. Remove Products
    public boolean removeProduct(String productName) {
        return products.remove(productName);
    }

    // 5. Search Products
    public boolean searchProduct(String productName) {
        return products.contains(productName);
    }

    // 6. Display Products
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("The product catalog is empty.");
        } else {
            System.out.println("Products in the catalog:");
            for (String product : products) {
                System.out.println(product);
            }
        }
    }
}