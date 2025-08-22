/**Write a Java program which will read data from the file and display on console. */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            // Create a file object
            File file = new File("example.txt");

            // Create a scanner to read the file
            Scanner reader = new Scanner(file);

            // Read file line by line
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }

            // Close the reader
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
