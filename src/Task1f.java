import java.util.Scanner;

public class Task1f {
    public static void main(String[] args) {
        // Task 1.f
        System.out.println("Task 1.f: ");
        Scanner reader = new Scanner(System.in);
        int total = 0;
        int newNumber = 0;
        int exitLoopCondition = -1000;

        do {
            System.out.println("Which operation would you like to use: *, /, +, -, =?");
            char arithmeticOperator = reader.next().charAt(0);
            if (arithmeticOperator == '=') {
                System.out.println("Calculator Result is " + total + ";\n");
                total = 0;
            } else {
                System.out.println("Please enter integer: ");
                newNumber = reader.nextInt();
                reader.nextLine(); // "swallow" leftover newline
                total = calculateResult(total, newNumber, arithmeticOperator);
            }
            if (newNumber == exitLoopCondition) {
                System.out.println("Exit number " + exitLoopCondition + " detected");
            }
        } while (newNumber != exitLoopCondition);
    }

    public static int calculateResult(int numberA, int numberB, char arithmeticOperator) {
        if (arithmeticOperator == '+') {
            return Task1a.addingNumbers(numberA, numberB);
        } else if (arithmeticOperator == '-') {
            return Task1a.subtractingNumbers(numberA, numberB);
        } else if (arithmeticOperator == '*') {
            return Task1a.multiplyingNumbers(numberA, numberB);
        } else if (arithmeticOperator == '/') {
            return Task1a.dividingNumbers(numberA, numberB);
        } else {
            return 0;
        }
    }
}
