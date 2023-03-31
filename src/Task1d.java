import java.util.Scanner;

public class Task1d {
    public static void main(String[] args) {
        // Task 1.d
        System.out.println("Task 1.d: ");
        Scanner reader = new Scanner(System.in);
        int total = 0;
        int exitLoopCondition = -1000;
        int newNumber;

        do {
            System.out.println("Which operation would you like to use: *, /, +, -?");
            String arithmeticOperator = reader.nextLine();
            System.out.print("Please enter integer: ");
            newNumber = reader.nextInt();
            reader.nextLine(); // "swallow" leftover newline
            if (newNumber == exitLoopCondition) {
                System.out.println("Exit number " + exitLoopCondition + " detected");
            } else {
                int finalResult = calculateResult(total, newNumber, arithmeticOperator);
                writeResult(total, newNumber, finalResult);
                total = finalResult;
            }
        } while (newNumber != exitLoopCondition);
    }

    public static void writeResult (int numberA, int numberB, int finalResult) {
        System.out.print("Total of " + numberA);
        System.out.print(" and " + numberB);
        System.out.println(" is " + finalResult);
    }

    public static int calculateResult (int numberA, int numberB, String arithmeticOperator) {
        if (arithmeticOperator.equals("+")) {
            return Task1a.addingNumbers(numberA, numberB);
        } else if (arithmeticOperator.equals("-")) {
            return Task1a.subtractingNumbers(numberA, numberB);
        } else if (arithmeticOperator.equals("*")) {
            return Task1a.multiplyingNumbers(numberA, numberB);
        } else if (arithmeticOperator.equals("/")) {
            return Task1a.dividingNumbers(numberA, numberB);
        } else {
            System.out.println("Operator is invalid.");
            return 0;
        }
    }
}
