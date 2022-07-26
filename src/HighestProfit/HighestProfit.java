package HighestProfit;
/*
Highest and lowest value from an array of integers.
 */

import java.util.Arrays;

public class HighestProfit {
    public static void main(String[] args) {
        int[] intArray = {5,3,8,2};
        System.out.println(Arrays.toString(minMax(intArray)));
    }

    public static int[] minMax(int[] arr) {
        int[] returnArray = new int[2];
        Arrays.sort(arr);
        returnArray[0] = arr[0];
        returnArray[1] = arr[arr.length-1];
        return returnArray;
    }
}
