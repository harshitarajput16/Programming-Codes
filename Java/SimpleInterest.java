import java.util.Scanner;

public class SimpleInterest 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double p = scanner.nextDouble();
        
        System.out.print("Enter rate of interest: ");
        double r = scanner.nextDouble();
        
        System.out.print("Enter time (years): ");
        double t = scanner.nextDouble();
        
        double si = (p * r * t) / 100;
        
        System.out.println("Simple Interest: " + si);
    }
}
