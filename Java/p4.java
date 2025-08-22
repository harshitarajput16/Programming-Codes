//Write a program which will perform arithmetic operations and display the value of it.
//Take input of two numbers using command line arguments.

public class prac4{
	public static void main(String[] args) {
	// Check if two command line arguments are provided
	if (args.length < 2) 
	{
		System.out.println("Please provide two numbers as command line arguments.");
		return;
	}
	
	// Parse the command line arguments to double
	double num1 = Double.parseDouble(args[0]);
	double num2 = Double.parseDouble(args[1]);
	
	// Perform arithmetic operations
	double sum = num1 + num2;
	double difference = num1 - num2;
	double product = num1 * num2;
	double quotient = num1 / num2;
	
	// Display the results
		System.out.println("First Number: " + num1);
		System.out.println("Second Number: " + num2);
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		System.out.println("Quotient: " + quotient);
	}
}