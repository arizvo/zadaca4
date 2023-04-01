import java.util.Scanner;

public class Task1g {
    public static void main(String[] args) {
        // Task 1.g
        System.out.println("Task 1.g: ");
        Scanner reader = new Scanner(System.in);
        int total = 0;
        int newNumber = 0;
        int exitLoopCondition = -1000;
        Integer firstNumber = null;

        while (true) {
            if (firstNumber == null) {
                System.out.println("Please enter the starting integer: ");
                firstNumber = reader.nextInt();

                if (firstNumber == -1000) {
                    System.out.println("Exit number " + exitLoopCondition + " detected");
                    break;
                }

                total = firstNumber;
                reader.nextLine(); // "swallow" leftover newline
            }

            System.out.println("Which operation would you like to use: *, /, +, -, =?");
            String arithmeticOperator;
            arithmeticOperator = reader.nextLine();
            if (arithmeticOperator.equals("=")) {
                System.out.println("Calculator Result is " + total + "\n");
                total = firstNumber; // The first number that was initially entered is used again
            } else {
                System.out.print("Please enter integer: ");
                newNumber = reader.nextInt();
                reader.nextLine(); // "swallow" leftover newline
                total = calculateResult(total, newNumber, arithmeticOperator);
            }

            if (newNumber == exitLoopCondition) {
                System.out.println("Exit number " + exitLoopCondition + " detected");
                break;
            }
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
            return 0;
        }
    }
}
