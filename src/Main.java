import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        
    }

    public static int addingNumbers(int numberA, int numberB) {
        return numberA + numberB;
    }

    public static int substractingNumbers(int numberA, int numberB) {
        return numberA - numberB;
    }

    public static int multipleyingNumbers(int numberA, int numberB) {
        return numberA * numberB;
    }

    public static double dividingNumbers(int numberA, int numberB) {
        return numberA / numberB;
    }
    public static void writeSumText (int numberA, int numberB) {
        System.out.print("Total of " + numberA);
        System.out.print(" and " + numberB);
        System.out.println(" is " + addingNumbers(numberA, numberB));
    }
}