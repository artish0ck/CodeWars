package FindTheStrayNumber;
/*
Write a function that will output a digit that differs from others.
 */

import java.util.Arrays;

public class FindTheStrayNumber {
    public static void main(String[] args) {
        int[] numbers = {2,1,1,1};
        System.out.println(stray(numbers));
    }

    static int stray(int[] numbers) {
        int arrayLength = numbers.length;
        Arrays.sort(numbers);
        return (numbers[0] == numbers[1]) ? (numbers[arrayLength - 1]) : numbers[0];
    }
}
