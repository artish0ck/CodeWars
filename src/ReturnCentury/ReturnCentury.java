package ReturnCentury;

/*
Output a century of  provided year.
 */

public class ReturnCentury {
    public static void main(String[] args) {
        int year = 1701;
        System.out.println(year + " is a " + century(year) + " century.");
    }

    public static int century(int number) {
        return (number % 100 == 0) ? (number / 100) : (number / 100 + 1);
    }
}

