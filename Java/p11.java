//Write a program that reads the elements of a one dimensional array print the sum of array elements.

import java.util.Scanner;

public class prac11
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	
	// Input: size of the array
	System.out.print("Enter the number of elements in the array: ");
	int n = sc.nextInt();
	
	// Initialize the array
	int[] array = new int[n];
	int sum = 0;
	
	// Input: elements of the array
	System.out.println("Enter the elements of the array:");
	for (int i = 0; i < n; i++) {
	array[i] = sc.nextInt();
	sum += array[i]; // Add each element to the sum
	}
	
	// Output: Sum of the array elements
	System.out.println("The sum of the array elements is: " + sum);
	sc.close();
	}
}