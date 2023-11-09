package utils;

import java.util.Scanner;

public class InputHandler {
    private static final Scanner scanner = new Scanner(System.in);


    public static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }


    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.next(); // Clear the invalid input
            System.out.print(prompt);
        }
        return scanner.nextInt();
    }


    public static void closeScanner() {
        scanner.close();
    }
}
