package file_io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileContent {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(destinationFile)) {

            int data;
            while ((data = reader.read()) != -1) {
                writer.write(data);
            }

            System.out.println("File content copied successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while copying file: " + e.getMessage());
        }
    }
}
