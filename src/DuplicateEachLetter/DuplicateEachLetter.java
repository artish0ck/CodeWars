package DuplicateEachLetter;
/*
Write a function that will duplicate each character of a string.
 */

public class DuplicateEachLetter {
    public static void main(String[] args) {
        String word = "Hello how are you doing ";
        System.out.println(doubleChar(word));
    }

    public static String doubleChar(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length() * 2; ) {
            sb.insert(i + 1, sb.charAt(i));
            i += 2;
        }
        return sb.toString();
    }
}
