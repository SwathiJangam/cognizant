import os
import pickle

TEXT_FILE = "contacts.txt"
BINARY_FILE = "contacts.bin"

def read_contacts_text():
    if not os.path.exists(TEXT_FILE):
        print("No contacts found.")
        return []
    
    with open(TEXT_FILE, "r") as file:
        contacts = [line.strip() for line in file.readlines()]
    return contacts

def write_contacts_text(contacts):
    with open(TEXT_FILE, "w") as file:
        for contact in contacts:
            file.write(contact + "\n")

def add_contact_text(name, phone):
    contacts = read_contacts_text()
    contacts.append(f"{name}, {phone}")
    write_contacts_text(contacts)

def remove_contact_text(name):
    contacts = read_contacts_text()
    contacts = [contact for contact in contacts if not contact.startswith(name)]
    write_contacts_text(contacts)

def display_contacts_text():
    contacts = read_contacts_text()
    if contacts:
        print("Contacts:")
        for contact in contacts:
            print(contact)
    else:
        print("No contacts to display.")

def save_contacts_binary(contacts):
    with open(BINARY_FILE, "wb") as file:
        pickle.dump(contacts, file)

def load_contacts_binary():
    if not os.path.exists(BINARY_FILE):
        print("No contacts found.")
        return []
    
    with open(BINARY_FILE, "rb") as file:
        contacts = pickle.load(file)
    return contacts

def add_contact_binary(name, phone):
    contacts = load_contacts_binary()
    contacts.append({"name": name, "phone": phone})
    save_contacts_binary(contacts)

def remove_contact_binary(name):
    contacts = load_contacts_binary()
    contacts = [contact for contact in contacts if contact["name"] != name]
    save_contacts_binary(contacts)

def display_contacts_binary():
    contacts = load_contacts_binary()
    if contacts:
        print("Contacts:")
        for contact in contacts:
            print(f"{contact['name']}, {contact['phone']}")
    else:
        print("No contacts to display.")

def main():
    print("Contact Management System")
    while True:
        print("\nOptions:")
        print("1. Add Contact (Text File)")
        print("2. Remove Contact (Text File)")
        print("3. Display Contacts (Text File)")
        print("4. Add Contact (Binary File)")
        print("5. Remove Contact (Binary File)")
        print("6. Display Contacts (Binary File)")
        print("7. Exit")
        
        choice = input("Enter your choice: ")

        if choice == '1':
            name = input("Enter contact name: ")
            phone = input("Enter phone number: ")
            add_contact_text(name, phone)
        elif choice == '2':
            name = input("Enter contact name to remove: ")
            remove_contact_text(name)
        elif choice == '3':
            display_contacts_text()
        elif choice == '4':
            name = input("Enter contact name: ")
            phone = input("Enter phone number: ")
            add_contact_binary(name, phone)
        elif choice == '5':
            name = input("Enter contact name to remove: ")
            remove_contact_binary(name)
        elif choice == '6':
            display_contacts_binary()
        elif choice == '7':
            print("Exiting the system. Goodbye!")
            break
        else:
            print("Invalid choice. Please try again.")

if __name__ == "__main__":
    main()