package AverageScore;

public class AverageScore {
    public static void main(String[] args) {
        int[] rates = {5, 6, 8, 5, 4, 5};
        System.out.println("Is your score better than average? - " + betterThanAverage(rates, 5));

    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int allPoints = 0;
        for (int eachPerson : classPoints) {
            allPoints += eachPerson;
        }
        return yourPoints > allPoints / classPoints.length;
    }
}
