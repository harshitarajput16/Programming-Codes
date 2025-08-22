// Write a Java program which will read data from one file and store it into another file.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        try {
            // Create FileReader object for source file
            FileReader fr = new FileReader("source.txt");

            // Create FileWriter object for destination file
            FileWriter fw = new FileWriter("destination.txt");

            int c;
            // Read from source file and write to destination file
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }

            // Close both files
            fr.close();
            fw.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}
