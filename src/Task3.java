import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Task 3
        System.out.println("Task 3: ");

        int menuSelector = menu();

        if (menuSelector == 1) {
            palindrome();
        } else if (menuSelector == 2) {
            filterArray();
        } else if (menuSelector == 3) {
            checkDivisibility();
        } else {
            System.out.println("Wrong input.");
        }
    }

    public static int menu() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Menu: ");
        System.out.println("1. Is string a palindrome");
        System.out.println("2. Filter an Array");
        System.out.println("3. Number is divisible by X.");
        System.out.println("\nChoose option (1, 2 or 3): ");

        return reader.nextInt();
    }

    public static void palindrome() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter string: ");
        if (isPalindrome(reader.nextLine())) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }
    }

    public static void filterArray() {
        Scanner reader = new Scanner(System.in);
        int[] arrayElements = new int[1000];
        int newNumber = 0;
        int counter = 0;
        int exitLoopCondition = -10;
        System.out.println("Enter numbers (enter -10 to exit): ");

        do {
            newNumber = reader.nextInt();
            if (newNumber != exitLoopCondition) {
                arrayElements[counter++] = newNumber;
            }
        } while (newNumber != exitLoopCondition && counter < 1000);

        System.out.println("Enter the number you want to delete from the array: ");
        int valueToDelete = reader.nextInt();

        System.out.println("Array elements before filtering: ");
        writeIntArray(arrayElements, counter);

        int[] arrayAfterFiltering = deleteElementFromArray(arrayElements, valueToDelete, counter);

        if (counter != arrayAfterFiltering.length) {
            System.out.println("\n\nArray elements after filtering: ");
            writeIntArray(arrayAfterFiltering, arrayAfterFiltering.length);
        } else {
            System.out.println("Value " + valueToDelete + " can't be found in the array.");
        }
    }

    public static void checkDivisibility() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int firstNumber = reader.nextInt();

        System.out.println("Enter the number with which you want to check divisibility: ");
        int denominator = reader.nextInt();

        if (isNumberDivisibleByX(firstNumber, denominator)) {
            System.out.println("Number " + firstNumber + " is divisible by " + denominator + ".");
        } else {
            System.out.println("Number " + firstNumber + " is not divisible by " + denominator + ".");
        }
    }

    public static boolean isPalindrome(String expression) {
        expression = expression.toLowerCase().replaceAll(" ", "");
        System.out.println(expression);
        char[] textToCheck = expression.toCharArray();
        for (int i = 0; i < expression.length() / 2; i++) {
            if (textToCheck[i] != textToCheck[expression.length() - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] deleteElementFromArray(int[] arrayToDeleteElements, int elementToDelete, int arraySize) {
        int newArraySize = arraySize - countElements(arrayToDeleteElements, elementToDelete, arraySize);
        int[] newArray = new int[newArraySize];
        int counter = 0;
        for (int i = 0; i < arraySize; i++) {
            if (arrayToDeleteElements[i] != elementToDelete) {
                newArray[counter++] = arrayToDeleteElements[i];
            }
        }

        return newArray;
    }

    public static boolean isNumberDivisibleByX(int firstNumber, int numberX) {
        return (firstNumber % numberX) == 0;
    }

    public static int countElements (int[] array, int elementToCount, int arraySize) {
        int counter = 0;
        for (int i = 0; i < arraySize; i++) {
            if (array[i] == elementToCount) {
                counter++;
            }
        }
        return counter;
    }

    public static void writeIntArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
