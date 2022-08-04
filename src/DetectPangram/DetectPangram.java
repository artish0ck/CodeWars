package DetectPangram;
/*
A pangram is a sentence that contains every single letter of the alphabet at least once.
For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
 */


import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

public class DetectPangram {
    public static void main(String[] args) {
        String sentence = "mder xziulfoj wkyn ..abc rtgsv mpqha";
        System.out.println(check(sentence));
    }

    public static boolean check(String sentence) {
        return new HashSet<>(Arrays.
                asList(sentence.toUpperCase().replaceAll("[^A-Z]", "").split(""))).size()==26;
    }
}
