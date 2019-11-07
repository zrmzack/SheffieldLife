package labs;

import labs.sheffield.EasyReader;

public class Game {
    public static void main(String[] args) {
        EasyReader keyboard;
        String name;
        Question question;
        keyboard = new EasyReader();
        System.out.print("Please type in your name: ");
        name = keyboard.readString();
        System.out.println("Hello " + name + "\n");
        question = new Question(name);
        question.printQuestion();
        question.scorePrint();
    }
}