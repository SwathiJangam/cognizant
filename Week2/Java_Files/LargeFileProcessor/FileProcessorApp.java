import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileProcessorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input and output file names
        String inputFileName = "sales_data.txt";
        String outputFileName = "processed_sales_data.txt";
        
        // Read and process the large sales data file
        System.out.println("Reading and processing the large sales data file...");
        List<String> processedData = processSalesData(inputFileName);
        
        // Write the processed data to a new file
        System.out.println("Writing processed data to the new file...");
        LargeFileWriter.writeProcessedData(outputFileName, processedData);
        
    }

    private static List<String> processSalesData(String inputFileName) {
        List<String> processedData = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Example processing: Filtering and transforming records
                if (line.contains("Sale")) { // Simple filter example
                    processedData.add("Processed: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error processing the file: " + e.getMessage());
        }
        return processedData;
    }
}