/**. Write a Java program which will use below methods of the file class.
 (a) canRead() (b) exists() (c) getName() (d) getAbsolutePath() (e) delete(). */
import java.io.File;

public class FileMethodsDemo {
    public static void main(String[] args) {
        // Create a File object
        File file = new File("example.txt");

        // Check if the file exists
        if (file.exists()) {
            System.out.println("File exists.");
            
            // Check if the file can be read
            System.out.println("Can read: " + file.canRead());

            // Get file name
            System.out.println("File name: " + file.getName());

            // Get absolute path of the file
            System.out.println("Absolute path: " + file.getAbsolutePath());

            // Delete the file
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("File deletion failed.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
