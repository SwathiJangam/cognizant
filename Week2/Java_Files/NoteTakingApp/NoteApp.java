import java.util.Scanner;

public class NoteApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a note
        System.out.println("Enter your note:");
        String note = scanner.nextLine();

        // Specify the file name
        String fileName = "note.txt";

        // Save the note to the file
        FileWriterDemo.saveNoteToFile(fileName, note);

        // Read the note back from the file
        System.out.println("Reading the note from the file:");
        FileReaderDemo.readNoteFromFile(fileName);
    }
}