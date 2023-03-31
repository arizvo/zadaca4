import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Task 2
        System.out.println("Task 2: ");
        Scanner reader = new Scanner(System.in);
        int newNumber;
        int exitLoopCondition = -10;
        String arrayElements = "";
        String yesOrNoString = "";

        do {
            System.out.println("Enter numbers (enter -10 to exit): ");
            do {
                newNumber = reader.nextInt();
                if (newNumber != exitLoopCondition) {
                    arrayElements += (newNumber + ", ");
                }
            } while (newNumber != exitLoopCondition);

            System.out.println(arrayElements.substring(0, arrayElements.length() - 2));
            System.out.println("Do you want to expand the array? y/n");
            yesOrNoString = reader.next();
        } while (!yesOrNoString.equals("n"));

        System.out.println("You chose not to expand the array.");
    }
}
