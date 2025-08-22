public class WrapperClassDemo {
    public static void main(String[] args) {
        // Primitive types
        int num = 10;
        double decimal = 15.5;

        // Converting primitives to wrapper objects
        Integer numWrapper = Integer.valueOf(num); // Autoboxing
        Double decimalWrapper = Double.valueOf(decimal);

        // Converting wrapper objects back to primitives
        int numPrimitive = numWrapper.intValue(); // Unboxing
        double decimalPrimitive = decimalWrapper.doubleValue();

        // Display values
        System.out.println("Integer object: " + numWrapper);
        System.out.println("Double object: " + decimalWrapper);
        System.out.println("Unboxed Integer: " + numPrimitive);
        System.out.println("Unboxed Double: " + decimalPrimitive);

        // Arithmetic operation using wrapper objects
        Integer result = numWrapper + numPrimitive;
        System.out.println("Result of addition: " + result);
    }
}
