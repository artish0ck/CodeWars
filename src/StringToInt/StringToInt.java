package StringToInt;

public class StringToInt {
    public static void main(String[] args) {
        String stringNumber = "12453";
        System.out.println(stringToNumber(stringNumber));
    }

    public static int stringToNumber(String str) {
        //TODO: Convert str into a number
        return Integer.parseInt(str);
    }
}
