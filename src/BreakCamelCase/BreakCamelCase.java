package BreakCamelCase;

/*
Complete the solution so that the function will break up camel casing, using a space between words.

Example
"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""
 */

public class BreakCamelCase {
    public static void main(String[] args) {
        String string1 = "howAreYou";
        System.out.println(camelCase(string1));

    }

    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}
