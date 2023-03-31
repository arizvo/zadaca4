import java.util.Scanner;

public class Task1f {
    public static void main(String[] args) {
        // Task 1.f
        System.out.println("Task 1.f: ");
        Scanner reader = new Scanner(System.in);
        int total = 0;
        int newNumber = 0;

        while (true) {
            System.out.println("Which operation would you like to use: *, /, +, -?");
            String arithmeticOperator;
            arithmeticOperator = reader.nextLine();
            if (arithmeticOperator.equals("=")) {
                System.out.println("Calculator Result is " + total + ";\n");
                break;
            } else {
                System.out.print("Please enter integer: ");
                newNumber = reader.nextInt();
                reader.nextLine(); // "swallow" leftover newline
                total = calculateResult(total, newNumber, arithmeticOperator);
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
