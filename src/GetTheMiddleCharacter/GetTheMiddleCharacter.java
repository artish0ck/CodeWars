package GetTheMiddleCharacter;
/*
You are going to be given a word. Your job is to return the middle character of the word.
If the word's length is odd, return the middle character.
If the word's length is even, return the middle 2 characters.

#Examples:

Kata.getMiddle("test") should return "es"

Kata.getMiddle("testing") should return "t"

Kata.getMiddle("middle") should return "dd"

Kata.getMiddle("A") should return "A"
 */

public class GetTheMiddleCharacter {
    public static void main(String[] args) {
        String input = "test";
        System.out.println(getMiddle(input));
    }

    public static String getMiddle(String word) {
        if (word.length() % 2 == 0) {
            return word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
        } else {
            return word.substring(word.length() / 2, word.length() / 2 + 1);
        }
    }
}
