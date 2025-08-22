/*Write a program which will use the concept of method overloading and calculate the volume of a Box. Box class have following properties:
Data Members:
Width
Height
Depth
Method:
volume() having three argument
volume() having two argument
display()
Note: volume = (width*height*depth)*/

class p23 //Box 
{
    private double width;
    private double height;
    private double depth;

    public Box() {
    }

    public double volume(double width, double height, double depth) {
        return width * height * depth;
    }

    public double volume(double width, double height) {
        return width * height * this.depth;
    }

    public void display(double width, double height, double depth) {
        System.out.println("Volume: " + volume(width, height, depth));
    }

    public static void main(String[] args) {
        Box box = new Box();
        box.display(2, 3, 4);  // Example: width 2, height 3, depth 4
    }
}
