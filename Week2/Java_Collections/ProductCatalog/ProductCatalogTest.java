public class ProductCatalogTest {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        // Test adding products
        System.out.println("Adding 'Laptop': " + catalog.addProduct("Laptop"));
        System.out.println("Adding 'Smartphone': " + catalog.addProduct("Smartphone"));
        System.out.println("Adding 'Tablet': " + catalog.addProduct("Tablet"));
        System.out.println("Adding 'Smartphone' again: " + catalog.addProduct("Smartphone")); // Duplicate

        // Display products
        catalog.displayProducts();

        // Test searching products
        System.out.println("Searching for 'Laptop': " + catalog.searchProduct("Laptop"));
        System.out.println("Searching for 'Smartwatch': " + catalog.searchProduct("Smartwatch"));

        // Test removing products
        System.out.println("Removing 'Tablet': " + catalog.removeProduct("Tablet"));
        System.out.println("Removing 'Smartwatch': " + catalog.removeProduct("Smartwatch")); // Not in catalog

        // Display products again
        catalog.displayProducts();
    }
}