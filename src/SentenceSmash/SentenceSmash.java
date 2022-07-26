package SentenceSmash;

/*
Write a function that takes an array of words and smashes them together into a sentence and returns the sentence.
You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word.
Be careful, there shouldn't be a space at the beginning or the end of the sentence!
 */

public class SentenceSmash {
    public static void main(String[] args) {
        System.out.println(smash("hello", "world", "this", "is", "great"));
    }

    public static String smash(String... words) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i] + " ");
        }
        return sb.toString().trim();
    }
}
