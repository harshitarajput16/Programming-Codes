/*Write a program which will throw an exception whenever a user enter a string in which the first character is not capital. */

import java.util.Scanner;

// Custom exception class
class FirstCharacterNotCapitalException extends Exception {
    // Constructor for custom exception
    public FirstCharacterNotCapitalException(String message) {
        super(message);
    }
}

public class Main {
    // Method to check if the first character is capital
    public static void checkFirstCharacter(String str) throws FirstCharacterNotCapitalException {
        // Check if the string is not empty and the first character is uppercase
        if (!Character.isUpperCase(str.charAt(0))) {
            // Throw custom exception if the first character is not uppercase
            throw new FirstCharacterNotCapitalException("The first character of the string must be a capital letter.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input a string from the user
            System.out.print("Enter a string: ");
            String userInput = sc.nextLine();

            // Check if the first character is capital
            checkFirstCharacter(userInput);

            // If no exception is thrown, display success message
            System.out.println("The string is valid: " + userInput);

        } catch (FirstCharacterNotCapitalException e) {
            // Catch and display custom exception message
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Handle other general exceptions
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
