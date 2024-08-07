import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class BackupApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the source and target directories
        System.out.print("Enter the source directory path: ");
        Path sourceDir = Paths.get(scanner.nextLine());
        
        System.out.print("Enter the target directory path: ");
        Path targetDir = Paths.get(scanner.nextLine());

        // Perform directory copy
        System.out.println("Starting the backup process...");
        DirectoryCopy.copyDirectory(sourceDir, targetDir);

        // Demonstrate error handling by attempting to copy to a read-only directory or a directory with insufficient space
        // Note: Adjust these paths according to your testing environment
        System.out.println("\nAttempting to copy to a read-only directory:");
        Path readOnlyDir = Paths.get("C:/read_only_dir"); // Make sure this path is valid for your testing
        DirectoryCopy.copyDirectory(sourceDir, readOnlyDir);

        System.out.println("\nAttempting to copy to a directory with insufficient space:");
        Path insufficientSpaceDir = Paths.get("C:/insufficient_space_dir"); // Make sure this path is valid for your testing
        DirectoryCopy.copyDirectory(sourceDir, insufficientSpaceDir);
    }
}