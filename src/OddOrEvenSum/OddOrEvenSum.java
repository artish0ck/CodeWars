package OddOrEvenSum;

/*
Print out if sum of values in an array is odd or even.
 */

public class OddOrEvenSum {
    public static void main(String[] args) {
        int[] int1 = {15, 30, 168};
        System.out.println(oddOrEven(int1));
    }

    public static String oddOrEven(int[] array) {
        String returnValue = "";
        if (array == null) {
            returnValue = "0";
        } else {
            int sum = 0;
            for (int i : array) {
                sum += i;
            }
            returnValue = sum % 2 == 0 ? "even" : "odd";
        }
        return returnValue;
    }
}
