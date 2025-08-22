/*Write a program that creates string variables called Name,father’s name, Surname and myName.Using concatenation,
assigns the value of Name,father’s name and surname into myName, and displays it on screen.*/

import java.util.Scanner;

public class p27//ConcatenateStrings 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your father's name: ");
        String fatherName = sc.nextLine();
        
        System.out.print("Enter your surname: ");
        String surname = sc.nextLine();

        String myName = name + " " + fatherName + " " + surname;
        System.out.println("Full Name: " + myName);
    }
}
