package labs;

import java.util.*;

import labs.sheffield.EasyReader;


public class Question {

    private String name;
    private int questionListLength = 10;
    private int[] param_1 = new int[questionListLength];
    private boolean[] operator = new boolean[questionListLength];
    private int[] param_2 = new int[questionListLength];
    private int[] answer = new int[questionListLength];
    private static int score = 0;
    EasyReader keyboard = new EasyReader();
    public Question(String name) {
        this.name = name;
        for (int i = 0; i < this.questionListLength; i++) {
           this.generateQuestion(i);
        }
    }
    public void generateQuestion(int i) {
        Random ran = new Random();
        boolean opt = ran.nextBoolean();
        this.operator[i] = opt;
        if (opt) {
            this.param_1[i] = ran.nextInt(20);
            this.param_2[i] = ran.nextInt(20 - this.param_1[i]);
            this.answer[i] = this.param_1[i] + this.param_2[i];
        } else {
            this.param_1[i] = ran.nextInt(20);
            while (this.param_1[i] == 0) {
                this.param_1[i] = ran.nextInt(20);
                System.out.print("BAD QQQQQQuestion");
            }
            this.param_2[i] = ran.nextInt(this.param_1[i]);
            this.answer[i] = this.param_1[i] - this.param_2[i];
        }
    }
    public void printQuestion() {
        for (int i = 0; i < this.questionListLength; i++) {
            System.out.print("Question " + Integer.toString(i + 1) + " : ");
            //转化
            System.out.print(Integer.toString(this.param_1[i]));
            if (this.operator[i]) {
                System.out.print(" + ");
            } else {
                System.out.print(" - ");
            }
            System.out.print(Integer.toString(this.param_2[i]) + "\n");
            this.checkAnswer(i);
        }
    }
    public void checkAnswer(int index) {
        System.out.print("Answer ? ");
        int uesrAnswer = keyboard.readInt();
        if (this.answer[index] == uesrAnswer) {
            System.out.println("Correct, well done");
            this.score++;
        } else {
            System.out.println("The correct answer is " + Integer.toString(this.answer[index]));
        }
    }


    public void scorePrint() {
        System.out.println("\nYou scored " + Integer.toString(this.score)
                + " out of " + Integer.toString(this.questionListLength) + "\n" +
                "A good effort " + this.name);
    }
}