package CountTheSmiley;

import java.util.ArrayList;
import java.util.List;

/*
Given an array (arr) as an argument complete the function countSmileys that should return the total
number of smiling faces.

Rules for a smiling face:

Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
Every smiling face must have a smiling mouth that should be marked with either ) or D
No additional characters are allowed except for those mentioned.

Valid smiley face examples: :) :D ;-D :~)
Invalid smiley faces: ;( :> :} :]

Example
countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;
Note
In case of an empty array return 0. You will not be tested with invalid input (input will always be an array).
Order of the face (eyes, nose, mouth) elements will always be the same.
 */
public class CountTheSmiley {
    public static void main(String[] args) {
        List<String> inputString = new ArrayList<>();
        inputString.add(":)");
        inputString.add(";(");
        inputString.add(":-D");
        inputString.add(";}");
        inputString.add(";*");

        System.out.println(countSmileys(inputString));
    }

    public static int countSmileys(List<String> arr) {
//        String validSmileys = ":) :D :-) :-D :~) :~D ;) ;D ;-) ;-D ;~) ;~D";
//        int count = 0;
//        for (String smiley : arr) {
//            if (validSmileys.contains(smiley))
//                count++;
//        }
//        return count;

        return (int) arr.stream()
                .filter(x->x.matches("[:;][-~]?[)D]"))
                .count();
    }
}
