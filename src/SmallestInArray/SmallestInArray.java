package SmallestInArray;

import java.util.Arrays;

public class SmallestInArray {
    public static void main(String[] args) {
        int[] intArray = {561,824, 15, 16, 3, 1};
        System.out.println(smallestNumber(intArray));
    }
    public static int smallestNumber(int[] args) {
        Arrays.sort(args);
        return args[0];
    }
}
