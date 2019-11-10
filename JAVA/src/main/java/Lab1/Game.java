package Lab1;

import java.util.Scanner;
/**
 * @author zack
 * @create 2019-11-11-4:22
 */
public class Game {

    public static void main(String[] args) {
        System.out.print("Please type your name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Hello " + name);
        Question question = new Question();
        System.out.println("You scored " + question.getallquestions() + " out of 10");
        System.out.println("A good effort" + name);
    }
}
