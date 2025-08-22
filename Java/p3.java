//Write a program to calculate sum of even number till n numbers.[ N number is provided through command line arguments]

class p3
{
	public static void main(String[] args) {
	// Check if command line arguments are provided
	if (args.length == 0)
		{
		System.out.println("Please provide a number as a command line argument.");
		return;
	}
	// Parse the command line argument to an integer
	int n = Integer.parseInt(args[0]);
	// Initialize sum variable
	int sum = 0;
	// Calculate sum of even numbers from 1 to n
		for (int i = 2; i <= n; i += 2) {
		sum += i;
	}
	// Display the result
	System.out.println("The sum of even numbers up to " + n + " is: " + sum);
	}
}