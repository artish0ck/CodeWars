package StringWithoutFirstAndLast;

/*
return provided string without first and last symbol.
 */

public class StringWithoutFirstAndLast {
    public static void main(String[] args) {
        String text = "animal";
        System.out.println(remove(text));
    }

    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }
}
