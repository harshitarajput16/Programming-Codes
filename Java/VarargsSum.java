public class VarargsSum {
    public static int calculateSum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 1, 2, 3: " + calculateSum(1, 2, 3));
        System.out.println("Sum of 10, 20, 30, 40: " + calculateSum(10, 20, 30, 40));
    }
}
