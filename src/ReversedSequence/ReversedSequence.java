package ReversedSequence;

import java.util.Arrays;

/*
Build a function that returns an array of integers from n to 1 where n>0.

Example : n=5 --> [5,4,3,2,1]
 */

public class ReversedSequence {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(Arrays.toString(reverse(number)));
    }

    public static int[] reverse(int n) {
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = n - i;
        }
        return intArray;
    }
}
