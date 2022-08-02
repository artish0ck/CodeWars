package AllStarCode18;

/*
Create a function that accepts 2 string arguments and returns an integer of the count of occurrences
the 2nd argument is found in the first one.

If no occurrences can be found, a count of 0 should be returned.

("Hello", "o")  ==>  1
("Hello", "l")  ==>  2
("", "z")       ==>  0
Notes:

The first argument can be an empty string
The second string argument will always be of length 1
 */

public class AllStarCode18 {
    public static void main(String[] args) {
        String string1 = "Hello";
        char char1 = 'H';
        System.out.println(strCount(string1, char1));
    }

    public static int strCount(String str, char letter) {
        int numberOfOcc = 0;
        for (int i = 0; i < str.length(); i++) {
            int index = str.indexOf(letter, i);
            if (index >= 0) {
                numberOfOcc += 1;
                i = index;
            }
        }
        return numberOfOcc;
    }
}
