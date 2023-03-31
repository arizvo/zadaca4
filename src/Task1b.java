import java.util.Scanner;

public class Task1b {
    public static void main(String[] args) {
        // Task 1.b
        System.out.println("Task 1.b: ");
        Scanner reader = new Scanner(System.in);
        int total = 1;
        int exitLoopCondition = -1000;

        do {
            System.out.print("Please enter any integer: ");
            total = reader.nextInt();
            if (total == exitLoopCondition) {
                System.out.println("Exit number " + exitLoopCondition + " detected");
            }
        } while (total != exitLoopCondition);
    }
}
