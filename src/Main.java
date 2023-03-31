import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Task 1.aa
        System.out.println("Task 1.aa: ");
        Scanner reader = new Scanner(System.in);
        int total = 1;

        while (total >= 0) {
            System.out.print("Enter positive number: ");
            total = reader.nextInt();
        }

        //Task 1.aaa
        System.out.println("\nTask 1.aaa: ");
        do {
            System.out.print("Enter positive number: ");
            total = reader.nextInt();
        } while (total >= 0);

        //Task 1.b
        System.out.println("\nTask 1.b: ");
        int exitLoopCondition = -1000;
        do {
            System.out.print("Please enter any integer: ");
            total = reader.nextInt();
            if (total == exitLoopCondition) {
                System.out.println("Exit number " + exitLoopCondition + " detected");
            }
        } while (total != exitLoopCondition);

        //Task 1.c
        total = 0;
        int newNumber;
        System.out.println("\nTask 1.c: ");
        do {
            System.out.print("Please enter integer: ");
            newNumber = reader.nextInt();
            if (newNumber == exitLoopCondition) {
                System.out.println("Exit number " + exitLoopCondition + " detected");
            } else {
                writeSumText(total, newNumber);
                total += newNumber;
            }
        } while (newNumber != exitLoopCondition);
    }

    public static int addingNumbers(int numberA, int numberB) {
        return numberA + numberB;
    }

    public static int substractingNumbers(int numberA, int numberB) {
        return numberA - numberB;
    }

    public static int multipleyingNumbers(int numberA, int numberB) {
        return numberA * numberB;
    }

    public static double dividingNumbers(int numberA, int numberB) {
        return numberA / numberB;
    }
    public static void writeSumText (int numberA, int numberB) {
        System.out.print("Total of " + numberA);
        System.out.print(" and " + numberB);
        System.out.println(" is " + addingNumbers(numberA, numberB));
    }
}