/*Create three classes Vehicle, TwoWheeler and FourWheeler. Vehicle is a parent class of TwoWheeler and FourWheeler.
In Vehicle class data members are company name, and methods are input and display. In TwoWheelers class, data
members are name, type(gear, non gear); and methods are input and display. In FourWheelers data members are name,
model no, fuel type; and methods are input and display. Write a program which will input and display information
of two wheeler and four wheeler using the concept of method overriding. */
import java.util.Scanner;

// Parent class: Vehicle
class Vehicle {
    String companyName;

    // Method to input Vehicle information
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle company name: ");
        companyName = sc.nextLine();
    }

    // Method to display Vehicle information
    public void display() {
        System.out.println("Vehicle Company Name: " + companyName);
    }
}

// Derived class: TwoWheeler (inherits from Vehicle)
class TwoWheeler extends Vehicle {
    String name;
    String type; // gear or non-gear

    // Method to input TwoWheeler information (overriding Vehicle's input)
    @Override
    public void input() {
        super.input();  // Calling Vehicle class input method
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two-wheeler name: ");
        name = sc.nextLine();
        System.out.print("Enter two-wheeler type (gear/non-gear): ");
        type = sc.nextLine();
    }

    // Method to display TwoWheeler information (overriding Vehicle's display)
    @Override
    public void display() {
        super.display();  // Calling Vehicle class display method
        System.out.println("Two-Wheeler Name: " + name);
        System.out.println("Two-Wheeler Type: " + type);
    }
}

// Derived class: FourWheeler (inherits from Vehicle)
class FourWheeler extends Vehicle {
    String name;
    String modelNo;
    String fuelType;

    // Method to input FourWheeler information (overriding Vehicle's input)
    @Override
    public void input() {
        super.input();  // Calling Vehicle class input method
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four-wheeler name: ");
        name = sc.nextLine();
        System.out.print("Enter four-wheeler model number: ");
        modelNo = sc.nextLine();
        System.out.print("Enter four-wheeler fuel type (Petrol/Diesel/Electric): ");
        fuelType = sc.nextLine();
    }

    // Method to display FourWheeler information (overriding Vehicle's display)
    @Override
    public void display() {
        super.display();  // Calling Vehicle class display method
        System.out.println("Four-Wheeler Name: " + name);
        System.out.println("Model Number: " + modelNo);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        // Creating objects for TwoWheeler and FourWheeler
        TwoWheeler tw = new TwoWheeler();
        FourWheeler fw = new FourWheeler();

        // Input and display information for TwoWheeler
        System.out.println("Input Two-Wheeler Information:");
        tw.input();
        System.out.println("\nDisplaying Two-Wheeler Information:");
        tw.display();

        // Input and display information for FourWheeler
        System.out.println("\nInput Four-Wheeler Information:");
        fw.input();
        System.out.println("\nDisplaying Four-Wheeler Information:");
        fw.display();
    }
}
