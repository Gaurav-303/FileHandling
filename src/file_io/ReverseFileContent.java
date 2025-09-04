package file_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReverseFileContent {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "reversed.txt";

        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            return;
        }

        content.reverse();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write(content.toString());
            System.out.println("File content reversed and written to " + outputFile);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file: " + e.getMessage());
        }
    }
}

