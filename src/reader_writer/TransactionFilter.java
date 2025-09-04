package reader_writer;

import java.io.*;

public class TransactionFilter {
    public static void main(String[] args) {
        String inputFile = "src/buffertxtfile/transactions.txt";
        String outputFile = "src/buffertxtfile/filtered_transactions.txt";
        double threshold = 1000.0;

        try (
                BufferedReader br = new BufferedReader(new FileReader(inputFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                if (parts.length == 4) {
                    try {
                        double amount = Double.parseDouble(parts[2].trim());
                        if (amount > threshold) {
                            bw.write(line);
                            bw.newLine();
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid transaction amount in line: " + line);
                    }
                } else {
                    System.out.println("Skipping invalid record: " + line);
                }
            }

            System.out.println("Filtered transactions written to " + outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

