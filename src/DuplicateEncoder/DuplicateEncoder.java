package DuplicateEncoder;
/* The goal of this exercise is to convert a string to a new string where each character in the
new string is "(" if that character appears only once in the original string, or ")" if that character
appears more than once in the original string. Ignore capitalization when determining if a
character is a duplicate.

        Examples
        "din"      =>  "((("
        "recede"   =>  "()()()"
        "Success"  =>  ")())())"
        "(( @"     =>  "))((" */

public class DuplicateEncoder {
    public static void main(String[] args) {
        System.out.println(encode("test"));
    }

    static String encode(String word) {
        StringBuilder sb = new StringBuilder(word.length());
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            sb = word.lastIndexOf(c) == word.indexOf(c) ? sb.append("(") : sb.append(")");
        }
        return sb.toString();
    }
}
