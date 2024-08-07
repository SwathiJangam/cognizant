import java.util.Hashtable;

public class ContactManagement {
    private Hashtable<Integer, Contact> contacts;

    public ContactManagement() {
        contacts = new Hashtable<>();
    }

    // 4. Add Contacts
    public void addContact(Contact contact) {
        contacts.put(contact.getId(), contact);
    }

    // 5. Remove Contacts
    public boolean removeContact(int contactId) {
        if (contacts.containsKey(contactId)) {
            contacts.remove(contactId);
            return true;
        }
        return false;
    }

    // 6. Display Contacts
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts in the system.");
        } else {
            System.out.println("Contact List:");
            for (Contact contact : contacts.values()) {
                System.out.println(contact);
            }
        }
    }
}