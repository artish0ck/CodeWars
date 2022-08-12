package FormTheMinimum;/*
Task
Given a list of digits, return the smallest number that could be formed from these digits,
using the digits only once (ignore duplicates).

Notes:
Only positive integers will be passed to the function (> 0 ), no negatives or zeros.
 */

import java.util.Arrays;
import java.util.stream.Collectors;

public class FormTheMinimum {
    public static void main(String[] args) {
        int[] values = {1, 1, 2, 8, 1, 3, 2};
        System.out.println(minValue(values));
    }

    public static int minValue(int[] values) {
        String uniqueSortedString = Arrays.stream(values)
                .distinct()
                .sorted()
                .mapToObj(String::valueOf) // or Integer.toString(x)
                .collect(Collectors.joining());

        return Integer.parseInt(uniqueSortedString); // 1238
    }
}
