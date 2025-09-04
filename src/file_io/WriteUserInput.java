package file_io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteUserInput {
    public static void main(String[] args) {
        String outputFile = "user_input.txt";

        try (Scanner scanner = new Scanner(System.in);
             FileWriter writer = new FileWriter(outputFile)) {

            System.out.println("Enter text to write into the file (type 'exit' to stop):");

            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                writer.write(input + System.lineSeparator());
            }

            System.out.println("User input has been written to " + outputFile);

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}


