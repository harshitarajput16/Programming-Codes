/*Create class Product which have following properties: Data Members: ProductNo, Name, quantity and price per quantity. Methods: purchase, sale and display. Write a
menu driven program which asks the end user whether he/she wants to purchase, or sell a product; according to the user choice perform operation and make necessary
updation in quantity. Note: before giving choice to user insert minimum five product information through constructor.*/

import java.util.Scanner;
class Product 
{
	int productNo;
	String name;
	int quantity;
	double pricePerUnit;
	
	// Constructor to initialize product details
	public Product(int productNo, String name, int quantity, double pricePerUnit) {
	this.productNo = productNo;
	this.name = name;
	this.quantity = quantity;
	this.pricePerUnit = pricePerUnit;
	}
	
	// Method to purchase a product
	public void purchase(int amount) {
	quantity += amount;
	System.out.println("Purchased " + amount + " units of " + name);
	System.out.println("New Quantity: " + quantity);
	}
	
	// Method to sell a product
	public void sale(int amount) {
	if (amount > quantity) {
	System.out.println("Insufficient stock to sell " + amount + " units.");
	} else {
	quantity -= amount;
	System.out.println("Sold " + amount + " units of " + name);
	System.out.println("Remaining Quantity: " + quantity);
	}
	}
	
	// Method to display product details
	public void display() {
	System.out.println("Product No: " + productNo + ", Name: " + name + ", Quantity: " +
	quantity + ", Price: " + pricePerUnit);
	}
}
public class prac10
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	
	// Initialize products
	Product product1 = new Product(101, "Laptop", 10, 50000);
	Product product2 = new Product(102, "Phone", 20, 20000);
	System.out.println("Choose an option: 1. Purchase 2. Sale 3. Display 0. Exit");
	int choice = sc.nextInt();
	
	while (choice != 0) 
	{
	System.out.print("Enter Product No: ");
	int productNo = sc.nextInt();
	Product selectedProduct = null;
	// Select product based on productNo
	if (productNo == 101) {
	selectedProduct = product1;
	} 
	else if (productNo == 102) 
	{
	selectedProduct = product2;
	} 
	else
	{
	System.out.println("Invalid Product No.");
	choice = sc.nextInt();
	continue;
	}
	switch (choice) 
	{
	case 1: // Purchase
	System.out.print("Enter quantity to purchase: ");
	int purchaseQty = sc.nextInt();
	selectedProduct.purchase(purchaseQty);
	break;
	
	case 2: // Sale
	System.out.print("Enter quantity to sell: ");
	int saleQty = sc.nextInt();
	selectedProduct.sale(saleQty);
	break;
	
	case 3: // Display
	selectedProduct.display();
	break;
	default:
	System.out.println("Invalid choice.");
	}
	System.out.println("Choose an option: 1. Purchase 2. Sale 3. Display 0. Exit");
	choice = sc.nextInt();
	}
	sc.close();
	}
}