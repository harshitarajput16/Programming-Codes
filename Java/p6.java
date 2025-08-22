/*Create class “Friend” which have following properties: Data Members: name, address, mobile-no and email-id. Method: display. Write a program which will insert 
details of Friend through no argument constructor and display information of it through display method.*/

class Friend 
{
	// Data Members
	String name;
	String address;
	String mobileNo;
	String emailId;
	
	// No-argument Constructor to insert details
	public Friend() 
	{
	name = "Jaykishan";
	address = "Vivekanand Nagar, Ahmedabad";
	mobileNo = "9106153615";
	emailId = "jaykishan@gmail.com";
	}
	
	// Method to display the details
	public void display() 
	{
	System.out.println("Friend's Details:");
	System.out.println("Name: " + name);
	System.out.println("Address: " + address);
	System.out.println("Mobile No: " + mobileNo);
	System.out.println("Email ID: " + emailId);
	}
}

public class prac6
{
	public static void main(String[] args) 
	{
	// Creating an object of the Friend class
	Friend friend = new Friend();
	// Calling display method to show friend's details
	friend.display();
	}
}