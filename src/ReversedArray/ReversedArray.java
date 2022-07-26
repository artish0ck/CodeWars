package ReversedArray;

import java.util.Arrays;

/*
Output the negative values of numbers from a provided array.
 */

public class ReversedArray {
    public static void main(String[] args) {
        int[] array = {15, 26, 38};
        System.out.println(Arrays.toString(invert(array)));
    }

    public static int[] invert(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[i] * -1;
        }
        return reversedArray;
    }
}
