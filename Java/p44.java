/* Write a Java program which will count total number of character, word and line from the file.*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStatistics {
    public static void main(String[] args) {
        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            // Create a file object
            File file = new File("example.txt");

            // Create a scanner to read the file
            Scanner reader = new Scanner(file);

            // Read file line by line
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                lineCount++;

                // Count characters
                characterCount += line.length();

                // Count words
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            // Close the reader
            reader.close();

            // Display statistics
            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + characterCount);

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
