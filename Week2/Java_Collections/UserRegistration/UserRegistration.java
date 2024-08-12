import java.util.TreeSet;

public class UserRegistration {
    private TreeSet<String> users;

    public UserRegistration() {
        users = new TreeSet<>();
    }

    // 3. Register Users
    public boolean registerUser(String userName) {
        return users.add(userName);
    }

    // 4. Remove Users
    public boolean removeUser(String userName) {
        return users.remove(userName);
    }

    // 5. Display Users
    public void displayUsers() {
        if (users.isEmpty()) {
            System.out.println("No users registered.");
        } else {
            System.out.println("Registered users in alphabetical order:");
            for (String user : users) {
                System.out.println(user);
            }
        }
    }
}