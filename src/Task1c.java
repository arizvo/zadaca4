import java.util.Scanner;

public class Task1c {
    public static void main(String[] args) {
        // Task 1.c
        System.out.println("Task 1.c: ");
        Scanner reader = new Scanner(System.in);
        Integer total = null;
        int exitLoopCondition = -1000;
        int newNumber;

        do {
            if (total == null) {
                total = 0;
            }
            System.out.print("Please enter integer: ");
            newNumber = reader.nextInt();
            reader.nextLine(); // "swallow" leftover newline
            if (newNumber == exitLoopCondition) {
                System.out.println("Exit number " + exitLoopCondition + " detected");
            } else {
                writeResult(total, newNumber);
                total += newNumber;
            }
        } while (newNumber != exitLoopCondition);
    }

    public static void writeResult (int numberA, int numberB) {
        System.out.print("Total of " + numberA);
        System.out.print(" and " + numberB);
        System.out.println(" is " + Task1a.addingNumbers(numberA, numberB));
    }
}
