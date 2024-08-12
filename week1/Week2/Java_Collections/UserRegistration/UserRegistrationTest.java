public class UserRegistrationTest {
    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();

        // Test registering users
        System.out.println("Registering 'Alice': " + registration.registerUser("Alice"));
        System.out.println("Registering 'Bob': " + registration.registerUser("Bob"));
        System.out.println("Registering 'Charlie': " + registration.registerUser("Charlie"));
        System.out.println("Registering 'Alice' again: " + registration.registerUser("Alice")); // Duplicate

        // Display users
        registration.displayUsers();

        // Test removing users
        System.out.println("Removing 'Charlie': " + registration.removeUser("Charlie"));
        System.out.println("Removing 'Dave': " + registration.removeUser("Dave")); // Not in system

        // Display users again
        registration.displayUsers();
    }
}