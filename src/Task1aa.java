import java.util.Scanner;

public class Task1aa {
    public static void main(String[] args) {
        // Task 1.aa
        System.out.println("Task 1.aa: ");
        Scanner reader = new Scanner(System.in);
        int total = 1;

        while (total >= 0) {
            System.out.print("Enter positive number: ");
            total = reader.nextInt();
        }
    }
}
