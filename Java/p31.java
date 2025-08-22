/*Create two classes one is Friend and another is Buddy, Friend class has data members like name and email-id, and Buddy class 
inherits the properties of Friend class and it has data members like dob, mobile no and address and do the following operation.
1. Create three constructor for base and derived class.
2. Insert data through derived class parameterized constructor.
3. Illustrate the use of this reference and Super.
4. Display all the information through the parent class reference variable*/

// Parent class: Friend
class Friend {
    String name;
    String email;

    // Constructor 1: Default constructor for Friend
    public Friend() {
        System.out.println("Friend class default constructor called");
    }

    // Constructor 2: Parameterized constructor for Friend
    public Friend(String name, String email) {
        this.name = name;
        this.email = email;
        System.out.println("Friend class parameterized constructor called");
    }

    // Method to display Friend information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

// Derived class: Buddy
class Buddy extends Friend {
    String dob;
    String mobileNo;
    String address;

    // Constructor 1: Default constructor for Buddy
    public Buddy() {
        super();  // Call the default constructor of Friend class
        System.out.println("Buddy class default constructor called");
    }

    // Constructor 2: Parameterized constructor for Buddy (inheriting from Friend)
    public Buddy(String name, String email, String dob, String mobileNo, String address) {
        super(name, email);  // Call the parameterized constructor of Friend class
        this.dob = dob;
        this.mobileNo = mobileNo;
        this.address = address;
        System.out.println("Buddy class parameterized constructor called");
    }

    // Constructor 3: Another parameterized constructor for Buddy
    public Buddy(String dob, String mobileNo, String address) {
        this.dob = dob;
        this.mobileNo = mobileNo;
        this.address = address;
    }

    // Method to display Buddy information
    public void displayInfo() {
        super.displayInfo();  // Call the displayInfo method from Friend class
        System.out.println("Date of Birth: " + dob);
        System.out.println("Mobile No: " + mobileNo);
        System.out.println("Address: " + address);
    }
}

public class Main {
    public static void main(String[] args) {
        // Using the derived class's parameterized constructor to insert data
        Buddy buddy = new Buddy("John Doe", "johndoe@example.com", "01-01-1990", "1234567890", "123 Elm St");

        // Display information using parent class reference
        Friend friendRef = buddy;  // Parent class reference to Buddy object
        friendRef.displayInfo();  // Will call the Buddy's displayInfo method due to polymorphism
    }
}
