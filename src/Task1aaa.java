import java.util.Scanner;

public class Task1aaa {
    public static void main(String[] args) {
        // Task 1.aaa
        System.out.println("Task 1.aaa: ");
        Scanner reader = new Scanner(System.in);
        int total = 1;

        do {
            System.out.print("Enter positive number: ");
            total = reader.nextInt();
        } while (total >= 0);
    }
}
