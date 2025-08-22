/*Write a program to input a string and print all vowels from it. */
import java.util.Scanner;

public class p26//VowelsInString
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String vowels = "aeiouAEIOU";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) != -1) {
                result += input.charAt(i);
            }
        }
        System.out.println("Vowels in the string: " + result);
    }
}
