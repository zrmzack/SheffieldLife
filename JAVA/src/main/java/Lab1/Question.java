package Lab1;

import java.util.Random;
import java.util.Scanner;

/**
 * @author zack
 * @create 2019-11-11-4:22
 */
public class Question {
    private int answer;
    private int x;
    private int y;
    private int mark = 0;


    private char judge() {
        int x = new Random().nextInt(2);
        if (x == 0) {
            return '-';
        } else {
            return '+';
        }
    }

    private void generate() {
        Random random = new Random();
        x = random.nextInt(20);
        y = random.nextInt(20);
        if (judge() == '-') {
            if (x >= y) {
                System.out.println(x + "-" + y);
                this.setAnswer(x - y);
            } else {
                System.out.println(y + "-" + x);
                this.setAnswer(y - x);
            }
        } else {
            System.out.println(y + "+" + x);
            this.setAnswer(y + x);
        }
    }

    private boolean judgeanswer(int userInput) {
        if (this.getAnswer() == userInput) {
            System.out.println("Correct, well done");
            return true;
        } else {
            System.out.println("The correct answer is " + this.getAnswer());
            return false;
        }
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getallquestions() {

        for (int x = 0; x < 10; x++) {
            System.out.print("Question " + (x+1) + ": ");
            generate();
            System.out.print("Answer?");
            int userinput = new Scanner(System.in).nextInt();
            if (judgeanswer(userinput)) {
                this.mark += 1;
            }
        }
        return mark;
    }
}