//Write a program which will take three numbers using command line arguments and
//display minimum and maximum numbers from it.
public class prac5
{
	public static void main(String[] args) {
	// Check if three command line arguments are provided
	if (args.length < 3)
	{
		System.out.println("Please provide three numbers as command line arguments.");
		return;
	}
	
	// Parse the command line arguments to double
	double num1 = Double.parseDouble(args[0]);
	double num2 = Double.parseDouble(args[1]);
	double num3 = Double.parseDouble(args[2]);
	
	// Calculate the minimum and maximum values
	double min = Math.min(num1, Math.min(num2, num3));
	double max = Math.max(num1, Math.max(num2, num3));
	
	// Display the minimum and maximum numbers
	System.out.println("First Number: " + num1);
	System.out.println("Second Number: " + num2);
	System.out.println("Third Number: " + num3);
	System.out.println("Minimum Number: " + min);
	System.out.println("Maximum Number: " + max);
	}
}