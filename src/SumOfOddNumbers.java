/*
Given the triangle of consecutive odd numbers:

             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
...
Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)

1 -->  1
2 --> 3 + 5 = 8
 */

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(rowSumOddNumbers(n));
    }


    //or just n*n*n;
    public static int rowSumOddNumbers(int n) {
    int result = 0;
    int firstNumberInRow = n*(n-1)+1;
    for (int i = 1; i <= n; i++) {
        result += firstNumberInRow;
        firstNumberInRow +=2;
    }
    return result;
    }
}