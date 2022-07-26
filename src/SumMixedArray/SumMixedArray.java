package SumMixedArray;

/*
Find a sum of provided numbers of a different type.
 */

import java.util.ArrayList;
import java.util.List;

public class SumMixedArray {
    public static void main(String[] args) {
        List typeList = new ArrayList<>();
        typeList.add(12);
        typeList.add(15);
        typeList.add(14);
        typeList.add("19");
        typeList.add("11");
        System.out.println(sum(typeList));
    }

    public static int sum(List<?> mixed) {
        int sum = 0;
        for (Object element : mixed) {
            sum += Integer.parseInt(element.toString());
        }
        return sum;
    }
}