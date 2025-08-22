//Write a program that prints the numbers between 1 and 100 which are divisible by 5 but not divisible by 10.

class p2
{
	public static void main(String[] args) 
	{
	System.out.println("Numbers between 1 and 100 that are divisible by 5 but not
	divisible by 10:");
	
	// Loop through numbers from 1 to 100
	for (int i = 1; i <= 100; i++) 
	{
	// Check if the number is divisible by 5 and not by 10
	if (i % 5 == 0 && i % 10 != 0)
		{
			System.out.println(i);
		}
	}
}
}.