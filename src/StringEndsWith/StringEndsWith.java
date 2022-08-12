package StringEndsWith;/*
Complete the solution so that it returns true if the first argument(string) passed in
ends with the 2nd argument (also a string).

Examples:

solution('abc', 'bc') // returns true
solution('abc', 'd') // returns false
 */

public class StringEndsWith {
    public static void main(String[] args) {
        String string1 = "abc";
        String string2 = "c";
        System.out.println(solution(string1, string2));
    }

    public static boolean solution(String str, String ending) {
//        if (str.length() < ending.length() || str.length() < 1)
//            return false;
//        int substringStart = str.length() - ending.length();
//        if (str.substring(substringStart).equals(ending))
//            return true;
//        return false;
        return str.endsWith(ending);
    }
}
