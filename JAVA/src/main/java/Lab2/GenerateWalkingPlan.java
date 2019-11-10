package Lab2;

import java.util.Scanner;

/**
 * @author zack
 * @create 2019-11-11-3:09
 */
public class GenerateWalkingPlan {
    public static void main(String[] args) {
        System.out.print("What is your name? ");
        String name = new Scanner(System.in).nextLine();
        System.out.println();
        System.out.print("Hello " + name + ";");
        System.out.print(" how old are you?");
        int age = 100;
        //If input wrong age will be 100
        try {
            age = new Scanner(System.in).nextInt();
        } catch (Exception e) {
            System.out.println("Input Wrong, Age is 100 Now");
        }
        System.out.println(name + "(" + age + ") - this is your walking plan");
        WalkingPlan walkingPlan = new WalkingPlan();
        walkingPlan.toPrint();
    }
}
