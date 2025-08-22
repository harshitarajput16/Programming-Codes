//command line arguments

public class CommandLineArgs
{
    public static void main(String[] args)
	{
        // Check if there are any command-line arguments
        if (args.length == 0)
		{
            System.out.println("No command-line arguments provided.");
        } 
		
		else 
		{
            // Display each command-line argument
            System.out.println("Command-line arguments:");
			
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " =+ args[i]);
            }
        }
    }
}
