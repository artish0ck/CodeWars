package CountPositivesSumNegatives;

import java.util.Arrays;

/*
Given an array of integers.

Return an array, where the first element is the count of positives numbers and
the second element is sum of negative numbers. 0 is neither positive nor negative.

If the input is an empty array or is null, return an empty array.

Example
For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
 */

public class CountPositivesSumNegatives {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        System.out.println(Arrays.toString(countPositivesSumNegatives(ints)));
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        } else {
             int countPos = 0;
            int sumNeg = 0;
            for (int number : input) {
                if (number > 0) {
                    countPos++;
                } else if (number < 0) {
                    sumNeg += number;
                }
                System.out.println(number);
                System.out.println("countpos = " + countPos);
                System.out.println("sumNeg = " + sumNeg + "\n");
            }
            return new int[]{countPos,sumNeg};
        }
    }
}
