//Write a program to display the product of two diagonal arrays. [Assume that the
//array size is 3x3]

import java.util.Scanner;

public class prac12
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	
	// Initialize a 3x3 array
	int[][] array = new int[3][3];
	
	// Input: elements of the 3x3 array
	System.out.println("Enter the elements of the 3x3 array:");
	for (int i = 0; i < 3; i++) 
	{
	for (int j = 0; j < 3; j++) 
	{
		array[i][j] = sc.nextInt();
	}
	}
	
	// Calculate product of the primary diagonal (top-left to bottom-right)
	int primaryDiagonalProduct = array[0][0] * array[1][1] * array[2][2];
	
	// Calculate product of the secondary diagonal (top-right to bottom-left)
	int secondaryDiagonalProduct = array[0][2] * array[1][1] * array[2][0];
	
	// Output the product of both diagonals
		System.out.println("Product of the primary diagonal: " + primaryDiagonalProduct);
		System.out.println("Product of the secondary diagonal: " + secondaryDiagonalProduct);
	sc.close();
	}
}