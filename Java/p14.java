//Write a program that read the elements of one dimensional array and print occurrence of element of it.
import java.util.HashMap;
import java.util.Scanner;

public class prac14{
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
	for (int i = 0; i < n; i++) {
	arr[i] = sc.nextInt();
	}
	
	// Using HashMap to store the frequency of each element
	HashMap<Integer, Integer> occurrences = new HashMap<>();
	
	// Loop through the array to count occurrences of each element
	for (int i = 0; i < n; i++) 
	{
	if (occurrences.containsKey(arr[i])) {
	occurrences.put(arr[i], occurrences.get(arr[i]) + 1);
	} else {
	occurrences.put(arr[i], 1);
	}
	}
	
	// Printing the occurrences of each element
	System.out.println("Element occurrences in the array:");
	for (int key : occurrences.keySet()) {
	System.out.println(key + " occurs " + occurrences.get(key) + " time(s).");
	}
	sc.close(); // Close the scanner to avoid resource leak
	}
}