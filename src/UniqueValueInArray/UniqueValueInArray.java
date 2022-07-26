package UniqueValueInArray;

import java.util.Arrays;

//There is an array with some numbers. All numbers are equal except for one. Try to find it!
public class UniqueValueInArray {
    public static void main(String[] args) {
        double[] doubles = {1, 1, 1, 1, 3};
        System.out.println(findUniq(doubles));
    }

    public static double findUniq(double arr[]) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
    }
}
