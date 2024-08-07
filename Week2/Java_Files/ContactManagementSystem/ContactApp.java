import java.util.Scanner;

public class ContactApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "contact.ser";

        // Create a Contact object and save it to a file
        System.out.println("Enter contact details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Contact contact = new Contact(name, phone, email);
        ContactWriter.saveContact(fileName, contact);

        // Read the Contact object back from the file and display it
        System.out.println("\nReading contact from the file:");
        Contact readContact = ContactReader.readContact(fileName);
        if (readContact != null) {
            System.out.println(readContact);
        }

    }
}