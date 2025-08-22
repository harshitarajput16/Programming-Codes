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

    // Overriding input method to get TwoWheeler information
    @Override
    public void input() {
        super.input();  // Calls Vehicle's input method
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two-wheeler name: ");
        name = sc.nextLine();
        System.out.print("Enter two-wheeler type (gear/non-gear): ");
        type = sc.nextLine();
    }

    // Overriding display method to show TwoWheeler information
    @Override
    public void display() {
        super.display();  // Calls Vehicle's display method
        System.out.println("Two-Wheeler Name: " + name);
        System.out.println("Two-Wheeler Type: " + type);
    }
}

// Derived class: FourWheeler (inherits from Vehicle)
class FourWheeler extends Vehicle {
    String name;
    String modelNo;
    String fuelType;

    // Overriding input method to get FourWheeler information
    @Override
    public void input() {
        super.input();  // Calls Vehicle's input method
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four-wheeler name: ");
        name = sc.nextLine();
        System.out.print("Enter four-wheeler model number: ");
        modelNo = sc.nextLine();
        System.out.print("Enter four-wheeler fuel type (Petrol/Diesel/Electric): ");
        fuelType = sc.nextLine();
    }

    // Overriding display method to show FourWheeler information
    @Override
    public void display() {
        super.display();  // Calls Vehicle's display method
        System.out.println("Four-Wheeler Name: " + name);
        System.out.println("Model Number: " + modelNo);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        // Create TwoWheeler object and input/display information
        TwoWheeler tw = new TwoWheeler();
        System.out.println("Input Two-Wheeler Information:");
        tw.input();
        System.out.println("\nDisplaying Two-Wheeler Information:");
        tw.display();

        // Create FourWheeler object and input/display information
        FourWheeler fw = new FourWheeler();
        System.out.println("\nInput Four-Wheeler Information:");
        fw.input();
        System.out.println("\nDisplaying Four-Wheeler Information:");
        fw.display();
    }
}
