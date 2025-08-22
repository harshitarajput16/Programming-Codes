/*Use above class structure and perform following task: 1. Create default constructor, one argument constructor, two argument constructor and copy constructor. 2. Call
all the above created constructors one by one and display information about it through function.*/
class Friend
{
	// Data Members
	String name;
	String address;
	String mobileNo;
	String emailId;
	
	// Default Constructor
	public Friend() 
	{
	name = "Default Name";
	address = "Default Address";
	mobileNo = "0000000000";
	emailId = "default@example.com";
	}
	// One-Argument Constructor
	public Friend(String name) {
	this.name = name;
	address = "Default Address";
	mobileNo = "0000000000";
	emailId = "default@example.com";
	}
	
	// Two-Argument Constructor
	public Friend(String name, String address) {
	this.name = name;
	this.address = address;
	mobileNo = "0000000000";
	emailId = "default@example.com";
	}
	
	// Copy Constructor
	public Friend(Friend other) {
	this.name = other.name;
	this.address = other.address;
	this.mobileNo = other.mobileNo;
	this.emailId = other.emailId;
	}
	
	// Method to display the details
	public void display() {
	System.out.println("Friend's Details:");
	System.out.println("Name: " + name);
	System.out.println("Address: " + address);
	System.out.println("Mobile No: " + mobileNo);
	System.out.println("Email ID: " + emailId);
	}
}
public class p7// FriendDemo 
{
	public static void main(String[] args) 
	{
		
	// Calling Default Constructor
	System.out.println("Using Default Constructor:");
	Friend friend1 = new Friend();
	friend1.display();
	System.out.println();
	
	// Calling One-Argument Constructor
	System.out.println("Using One-Argument Constructor:");
	Friend friend2 = new Friend("Jaykishan");
	friend2.display();
	System.out.println();
	
	// Calling Two-Argument Constructor
	System.out.println("Using Two-Argument Constructor:");
	Friend friend3 = new Friend("Jaykishan", "Vivekanand Nagar, Ahmedabad");
	friend3.display();
	System.out.println();
	
	// Calling Copy Constructor
	System.out.println("Using Copy Constructor:");
	Friend friend4 = new Friend(friend3);
	friend4.display();
	System.out.println();
	}
}