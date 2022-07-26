package RearrangedInteger;
/*
Output the biggest possible number that you can get from the digits of a given number.
 */

import java.util.Arrays;


public class RearrangedInteger {
    public static void main(String[] args) {
        int number = 712381;
        System.out.println(sortDesc(number));
    }

    public static int sortDesc(final int num) {
        char[] charArray = String.valueOf(num).toCharArray();
        Arrays.sort(charArray);
        StringBuilder sb = new StringBuilder(String.valueOf(charArray)).reverse();
        return Integer.parseInt(sb.toString());
    }
}
