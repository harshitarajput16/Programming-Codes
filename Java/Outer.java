public class Outer {
    private String outerField = "Outer Class Field";

    // Inner class
    class Inner {
        String innerField = "Inner Class Field";

        void display() {
            System.out.println("Inside Inner Class Method");
        }
    }

    public void accessInner() {
        Inner inner = new Inner(); // Instantiating Inner class
        System.out.println(inner.innerField); // Access inner field
        inner.display(); // Invoke inner class method
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.accessInner(); // Access inner class from outer class
    }
}
