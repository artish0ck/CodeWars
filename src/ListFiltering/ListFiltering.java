package ListFiltering;/*
In this kata you will create a function that takes a list of non-negative integers and strings and
returns a new list with the strings filtered out.
 */

import java.util.ArrayList;
import java.util.List;

public class ListFiltering {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(12);
        list.add(16);
        list.add(13);
        list.add("123");
        list.add("abc");
        list.add("ldasd");
        System.out.println(filterList(list));
    }

    public static List<Object> filterList(final List<Object> list) {
        List list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Number) {
                list1.add(list.get(i));
            }
        }
        return list1;
    }
}
