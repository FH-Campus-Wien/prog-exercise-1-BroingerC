package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here


            int a = 'Z';
            int b = 0xface;
            int c = 012;
            long d = 80L;
            float e = 44e-1f;
            float f = 5.5f;
            double g = 8.88e1;
            double h = 99.9;


    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here

    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here

        System.out.println("Before Swap:");
        System.out.println("x: y: After Swap:");
        System.out.println("x: 5");
        System.out.println("y: 2");
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here


    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution


    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here


    }

    //todo Task 9
    public void leapyear(){
        // input your solution here

        System.out.println("Year: Not a Leapyear");

    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}