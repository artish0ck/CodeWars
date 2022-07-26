package CountNumberOfDuplicates;
/*
Write a function that will return the count of distinct case-insensitive alphabetic characters
and numeric digits that occur more than once in the input string.
The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice

 */

public class CountNumberOfDuplicates {
    public static void main(String[] args) {
        String text1 = "AAAA111bbc";
        System.out.println(duplicateCount(text1));
    }

    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            if (i != text.indexOf(text.charAt(i))) {
                continue;
            } else if (i != text.lastIndexOf(text.charAt(i))) {
                sum += 1;
            } else continue;
        }
        return sum;
    }
}
