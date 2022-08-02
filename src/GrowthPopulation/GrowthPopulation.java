package GrowthPopulation;

/*
In a small town the population is p0 = 1000 at the beginning of a year.
The population regularly increases by 2 percent per year and moreover 50 new
inhabitants per year come to live in the town. How many years does the town need to see its
population greater or equal to p = 1200 inhabitants?

More generally given parameters:
p0, percent, aug (inhabitants coming or leaving each year), p (population to surpass)
the function nb_year should return n number of entire years needed to get a population greater or equal to p.
aug is an integer, percent a positive or null floating number, p0 and p are positive integers (> 0)
 */

public class GrowthPopulation {
    public static void main(String[] args) {
        System.out.println(nbYear(1000, 2, 50, 1200));
    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        while (p0 < p) {
            p0 = p0 + ((int) (p0 * percent * 0.01)) + aug;
            System.out.println("p0 = " + p0);
            years += 1;
        }
        return years;
    }
}
