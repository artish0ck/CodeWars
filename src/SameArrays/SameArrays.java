package SameArrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Given two arrays a and b write a function comp(a, b) (orcompSame(a, b)) that checks whether the two arrays have
the "same" elements, with the same multiplicities (the multiplicity of a member is the number of times it appears).
"Same" means, here, that the elements in b are the elements in a squared, regardless of the order.

Examples
Valid arrays
a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
comp(a, b) returns true because in b 121 is the square of 11, 14641 is the square of 121, 20736 the square of 144,
361 the square of 19, 25921 the square of 161, and so on. It gets obvious if we write b's elements in terms of squares:

a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]
 */

public class SameArrays {
    public static void main(String[] args) {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a, b));

    }

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null)
            return false;
        List<Integer> listA = Arrays.stream(a)
                .sorted()
                .map(n -> n * n)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> listB = Arrays.stream(b)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        System.out.println(listA);
        System.out.println(listB);
        return listA.equals(listB);


// without list:
/*      int[] aa = Arrays.stream(a)
                .map(n -> n * n)
                .sorted()
                .toArray();

        int[] bb = Arrays.stream(b)
                .sorted()
                .toArray();
        return Arrays.equals(aa, bb);
*/
    }
}
