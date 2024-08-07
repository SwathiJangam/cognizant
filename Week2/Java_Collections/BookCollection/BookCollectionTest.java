public class BookCollectionTest {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();

        // Test adding books
        System.out.println("Adding 'The Great Gatsby': " + collection.addBook("The Great Gatsby"));
        System.out.println("Adding '1984': " + collection.addBook("1984"));
        System.out.println("Adding 'To Kill a Mockingbird': " + collection.addBook("To Kill a Mockingbird"));
        System.out.println("Adding 'The Great Gatsby' again: " + collection.addBook("The Great Gatsby")); // Duplicate

        // Display books
        collection.displayBooks();

        // Test removing books
        System.out.println("Removing '1984': " + collection.removeBook("1984"));
        System.out.println("Removing 'Moby Dick': " + collection.removeBook("Moby Dick")); // Not in collection

        // Display books again
        collection.displayBooks();
    }
}