package ConcatenateStringNTimes;

public class ConcatenateStringNTimes {
    public static void main(String[] args) {
        System.out.println(repeatStr(5, "Hello"));
    }

    public static String repeatStr(final int repeat, final String string) {
        StringBuilder finalString = new StringBuilder(repeat);
        for (int i = 0; i < repeat; i++) {
            finalString.append(string);
        }
        return finalString.toString();
    }
}
