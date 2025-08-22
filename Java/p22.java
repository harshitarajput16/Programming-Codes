/*Create class ShapeArea which will calculate area of different geographical shape like triangle, circle, square, rectangle, etc.
Write a program which will calculate and display the area of shapes using the concept of method overloading.*/

class p22 //ShapeArea 
{
    // Method Overloading for different shapes
    public double area(double radius) {  // Circle
        return 3.14 * radius * radius;
    }

    public double area(double length, double breadth) {  // Rectangle or Square
        return length * breadth;
    }

    public double area(double a, double b, double c) {  // Triangle (Heron's formula)
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    
    public static void main(String[] args) {
        ShapeArea shape = new ShapeArea();
        
        System.out.println("Circle Area: " + shape.area(5));  // Circle with radius 5
        System.out.println("Rectangle Area: " + shape.area(4, 5));  // Rectangle with length 4, breadth 5
        System.out.println("Triangle Area: " + shape.area(3, 4, 5));  // Triangle with sides 3, 4, 5
    }
}
