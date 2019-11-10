package Lab2;

import java.util.Random;

/**
 * @author zack
 * @create 2019-11-11-3:08
 */
public class WalkingPlan {
    //modify days
    private static int DAYS = 14;
    //init array
    private int[] distances = new int[DAYS + 1];

    //method of print
    public void toPrint() {
        int sum = 0;
        distances = getAllTargetArray(distances);
        for (int x = 0; x < 14; x++) {
            if (distances[x] > 1500)
                System.out.println("Day " + (x + 1) + ": walk" + distances[x] + "m" + " <----------- hard");
            else {
                System.out.println("Day " + (x + 1) + ": walk" + distances[x] + "m");
            }
            sum += distances[x];
        }
        System.out.println("Total number of meters walked = " + sum);
        System.out.println("Average number of meters walked per day = " + Math.round(sum / DAYS));

    }

    //method generatedistance
    public int generatedistance() {
        int distance;
        Random random = new Random();
        while (true) {
            //generate x between 100 to 2500;
            int x = random.nextInt(2400) + 100;
            if (x % 10 == 0) {
                distance = x;
                return distance;
            }
        }

    }

    //method getall target
    public int[] getAllTargetArray(int[] arrays) {
        for (int x = 0; x < 14; x++) {
            distances[x] = this.generatedistance();
        }
        for (int x = 0; x < 14; x++) {
            if (distances[x] > 1500) {
                distances[x + 1] = 1000;
            }
        }
        return distances;
    }

}
