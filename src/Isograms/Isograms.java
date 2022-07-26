package Isograms;/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive.
Implement a function that determines whether a string that contains only letters is an isogram.
Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true
"aba" --> false
"moOse" --> false (ignore letter case)
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Isograms {

    public static void main(String[] args) {
        String word = "aAbc";
        System.out.println(isIsogram(word));
    }

    public static boolean isIsogram(String str) {
        Set<String> stringSet = new HashSet<>();
        String[] strings = str.toLowerCase().split("");
        for (int i = 0; i < strings.length; i++) {
            stringSet.add(strings[i]);
        }
        return (strings.length == stringSet.size()) ? true : false;
    }

}