//Write a program that reads the elements of a one dimensional array print how many
//times 5 occurs in the array.

import java.util.Scanner;

public class prac13
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	
	// Asking the user for the size of the array
	System.out.print("Enter the number of elements in the array: ");
	int n = sc.nextInt();
	
	// Creating an array of size n
	int[] arr = new int[n];
	
	// Taking array elements as input from the user
	System.out.println("Enter the elements of the array:");
	for (int i = 0; i < n; i++) 
	{
		arr[i] = sc.nextInt();
	}
	
	// Variable to count the occurrence of 5
	int count = 0;
	
	// Loop to count how many times 5 occurs in the array
	for (int i = 0; i < n; i++) {
	if (arr[i] == 5) {
	count++;
	}
	}
	// Printing the result
	System.out.println("The number 5 occurs " + count + " times in the array.");
	sc.close(); // Close the scanner to avoid resource leak
	}
}