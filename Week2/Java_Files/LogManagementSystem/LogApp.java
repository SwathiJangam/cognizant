import java.util.Scanner;

public class LogApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "log.txt";

        // Write multiple log messages to the file
        System.out.println("Enter log messages (type 'exit' to finish):");
        String logMessage;
        while (!(logMessage = scanner.nextLine()).equalsIgnoreCase("exit")) {
            LogWriter.writeLog(fileName, logMessage);
        }

       
    }
}