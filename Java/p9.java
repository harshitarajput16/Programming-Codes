/*Create class Product which have following properties: Data Members: ProductNo,Name,Quantity and Price Methods: insert,bill and display Write a program
which ask user to insert information of product which user want to purchase and  based on it calculate bill and display the bill in a proper format.*/
import java.util.Scanner;
class Product 
{
	// Data Members
	int productNo;
	String name;
	int quantity;
	double price;
	
	// Method to insert product details
	public void insert() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Product No: ");
	productNo = sc.nextInt();
	sc.nextLine(); // consume newline
	System.out.print("Enter Product Name: ");
	name = sc.nextLine();
	System.out.print("Enter Quantity: ");
	quantity = sc.nextInt();
	System.out.print("Enter Price: ");
	price = sc.nextDouble();
	}
	
	// Method to calculate total bill
	public double bill() {
	return quantity * price;
	}
	// Method to display product details and bill
	public void display() {
		System.out.println("\n********** Bill **********");
		System.out.println("Product No: " + productNo);
		System.out.println("Product Name: " + name);
		System.out.println("Quantity: " + quantity);
		System.out.println("Price per Unit: " + price);
		System.out.println("Total Bill: " + bill());
		System.out.println("***************************");
	}
}
public class prac9{
	public static void main(String[] args) 
	{
		// Create a Product object
		Product product = new Product();
		// Insert product details
		product.insert();
		// Display product details and the bill
		product.display();
	}
}