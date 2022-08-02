package AnagramDetection;

import java.util.Arrays;

/*
An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).

Note: anagrams are case insensitive

Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.

Examples
"foefet" is an anagram of "toffee"

"Buckethead" is an anagram of "DeathCubeK"
 */

public class AnagramDetection {
    public static void main(String[] args) {
        String string1 = "fofeet";
        String string2 = "toffee";
        System.out.println(isAnagram(string1, string2));
    }

    public static boolean isAnagram(String test, String original) {
        char[] charsTest = test.toLowerCase().toCharArray();
        Arrays.sort(charsTest);
        char[] charsOriginal = original.toLowerCase().toCharArray();
        Arrays.sort(charsOriginal);
        return (Arrays.equals(charsTest, charsOriginal));
    }
}
