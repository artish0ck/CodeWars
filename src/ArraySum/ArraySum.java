package ArraySum;

public class ArraySum {
    public static void main(String[] args) {
        double[] numbers = {3.0, 5.0, 8.2};
        System.out.println("Sum of doubles: " + sum(numbers));

    }

    public static double sum(double[] numbers) {
        double sum = 0;
        for (double i : numbers) {
            sum += i;
        }
        return sum;
    }
}
