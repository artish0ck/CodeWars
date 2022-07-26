package GradeBook;
/*
a program should return your grade based on three marks.
 */

public class GradeBook {
    public static void main(String[] args) {
        System.out.println(getGrade(60, 60, 99));
    }

    public static char getGrade(int s1, int s2, int s3) {
        int average = (s1 + s2 + s3) / 3;
        System.out.println(average);
        return (average < 60) ? 'F' : (average < 70) ? 'D' : (average < 80) ? 'C' : (average < 90) ? 'B' : 'A';
    }
}
