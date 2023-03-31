import java.util.Scanner;

public class Task1e {
    public static void main(String[] args) {
        // Task 1.e
        System.out.println("Task 1.e: ");
        Scanner reader = new Scanner(System.in);
        int total = 0;
        int exitLoopCondition = -1000;
        int newNumber;

        do {
            System.out.println("Which operation would you like to use: *, /, +, -?");
            String arithmeticOperator;
            arithmeticOperator = reader.nextLine();
            System.out.print("Please enter integer: ");
            newNumber = reader.nextInt();
            reader.nextLine(); // "swallow" leftover newline
            if (newNumber == exitLoopCondition) {
                System.out.println("Exit number " + exitLoopCondition + " detected");
            } else {
                int finalResult = calculateResult(total, newNumber, arithmeticOperator);
                writeResult(total, newNumber, arithmeticOperator, finalResult);
                total = finalResult;
            }
        } while (newNumber != exitLoopCondition);
    }

    public static void writeResult (int numberA, int numberB, String arithmeticOperator, int finalResult) {
        if (arithmeticOperator.equals("+")) {
            System.out.println("Sum of " + numberA + " and " + numberB + " is " + finalResult);
        } else if (arithmeticOperator.equals("-")) {
            System.out.print("Difference of " + numberA + " and " + numberB + " is " + finalResult);
        } else if (arithmeticOperator.equals("*")) {
            System.out.print("Product of " + numberA + " and " + numberB + " is " + finalResult);
        } else if (arithmeticOperator.equals("/")) {
            System.out.print("Quotient of " + numberA + " and " + numberB + " is " + finalResult);
        }
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
