package MaxExpression;
/*
Find a combination of operators and brackets that will output the maximum value. Order of integers can`t be changed.
 */

import java.util.Arrays;

public class MaxExpression {
    public static void main(String[] args) {
        int a = 2, b = 1, c = 1;
        System.out.println("Maximum value is: " + expressionsMatter(a, b, c));
    }

    public static int expressionsMatter(int a, int b, int c) {
        int multiplied = a * b * c;
        int sum = a + b + c;
        int bracketsFirst = (a + b) * c;
        int bracketsSecond = a * (b + c);
        int[] results = {multiplied, sum, bracketsFirst, bracketsSecond};
        Arrays.sort(results);
        return results[3];
    }
}
