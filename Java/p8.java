/*Create class “Student” which have following properties: Data Members: enrolmentNo,
name,course, and fee. Methods: insert and display. Write a program which will insert
and display student information through class methods*/

import java.util.Scanner;
class Student 
{
	// Data Members
	String enrolmentNo;
	String name;
	String course;
	double fee;
	
	// Method to insert student details
	public void insert() 
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Enrolment No: ");
	enrolmentNo = sc.nextLine();
	System.out.print("Enter Name: ");
	name = sc.nextLine();
	System.out.print("Enter Course: ");
	course = sc.nextLine();
	System.out.print("Enter Fee: ");
	fee = sc.nextDouble();
}

	// Method to display student details
	public void display() {
	System.out.println("\nStudent Information:");
	System.out.println("Enrolment No: " + enrolmentNo);
	System.out.println("Name: " + name);
	System.out.println("Course: " + course);
	System.out.println("Fee: " + fee);
	}
}	
public class prac8
{
	public static void main(String[] args) {
	// Create a Student object
	Student student = new Student();
	// Insert student details
	student.insert();
	// Display student details
	student.display();
	}
}