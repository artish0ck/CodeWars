package SortedAlphabetical;

/*Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string,
        the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.

        Examples:
        a = "xyaabbbccccdefww"
        b = "xxxxyyyyabklmopq"
        longest(a, b) -> "abcdefklmopqwxy"

        a = "abcdefghijklmnopqrstuvwxyz"
        longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"*/

import java.util.*;

public class SortedAlphabetical {
    public static void main(String[] args) {
        String string1 = "abcdhvjaa";
        String string2 = "vnaksof";
        System.out.println(longest(string1, string2));
    }

    public static String longest(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        char[] characterList = s1.concat(s2).toCharArray();
        TreeSet<Character> treeSet1 = new TreeSet<>();
        for (int i = 0; i < characterList.length; i++) {
            treeSet1.add(characterList[i]);
        }
        System.out.println(treeSet1);
        String finalString = treeSet1.toString();
        return finalString.replaceAll("\\W", "");
    }
}
