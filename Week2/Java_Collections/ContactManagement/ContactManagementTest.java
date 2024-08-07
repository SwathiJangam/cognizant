public class ContactManagementTest {
    public static void main(String[] args) {
        ContactManagement management = new ContactManagement();

        // Test adding contacts
        management.addContact(new Contact(1, "Afsha", "555-1234"));
        management.addContact(new Contact(2, "Samba", "555-5678"));
        management.addContact(new Contact(3, "Swathi", "555-8765"));

        // Display contacts
        management.displayContacts();

        // Test removing contacts
        System.out.println("Removing Contact ID 2: " + management.removeContact(2));
        System.out.println("Removing Contact ID 4 (non-existent): " + management.removeContact(4));

        // Display contacts after removal
        management.displayContacts();
    }
}