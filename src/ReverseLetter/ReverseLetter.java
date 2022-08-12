package ReverseLetter;/*
Task
Given a string str, reverse it and omit all non-alphabetic characters.

Example
For str = "krishan", the output should be "nahsirk".

For str = "ultr53o?n", the output should be "nortlu".

Input/Output
[input] string str
A string consists of lowercase latin letters, digits and symbols.

[output] a string
 */

public class ReverseLetter {
    public static void main(String[] args) {
        String test = "avV1324^";
        System.out.println(reverseLetter(test));
    }

    public static String reverseLetter(final String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString().replaceAll("(?i)[^a-z]", ""); //coding and coding..
    }
}
