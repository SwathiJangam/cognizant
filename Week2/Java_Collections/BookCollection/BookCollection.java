import java.util.LinkedHashSet;

public class BookCollection {
    private LinkedHashSet<String> books;

    public BookCollection() {
        books = new LinkedHashSet<>();
    }

    // 3. Add Books
    public boolean addBook(String bookTitle) {
        return books.add(bookTitle);
    }

    // 4. Remove Books
    public boolean removeBook(String bookTitle) {
        return books.remove(bookTitle);
    }

    // 5. Display Books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the collection.");
        } else {
            System.out.println("Books in the collection (in order of addition):");
            for (String book : books) {
                System.out.println(book);
            }
        }
    }
}