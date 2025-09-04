package file_io1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileContent {
    public static void main(String[] args) {
        String inputFile = "src/text_file1/input.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

