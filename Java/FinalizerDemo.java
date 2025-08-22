class Car {
    String model;

    Car(String model) {
        this.model = model;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Car object is being garbage collected: " + model);
        super.finalize();
    }
}

public class FinalizerDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda");

        // Nullify the references to trigger garbage collection
        car1 = null;
        car2 = null;

        // Suggest garbage collection
        System.gc();

        System.out.println("End of the program.");
    }
}
