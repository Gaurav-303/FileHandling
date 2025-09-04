package reader_writer;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "src/buffertxtfile/source.txt";
        String destinationFile = "src/buffertxtfile/destination.txt";

        try (
                BufferedReader br = new BufferedReader(new FileReader(sourceFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

