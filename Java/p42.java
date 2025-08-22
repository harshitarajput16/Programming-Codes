/** Write a Java program which will insert data from the console and write into file.*/
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the file name: ");
        String filename = sc.nextLine();

        System.out.println("Enter data to write into the file: ");
        String data = sc.nextLine();

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(data);
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
