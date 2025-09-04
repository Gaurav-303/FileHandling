package file_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) {
        String inputFile = "text_file.txt";
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    String[] words = line.split(" ");
                    for (String word : words) {
                        if (!word.isEmpty()) {
                            wordCount++;
                        }
                    }
                }
            }
            System.out.println("Total words in file: " + wordCount);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

