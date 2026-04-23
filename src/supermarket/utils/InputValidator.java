package supermarket.utils;

import java.util.Scanner;

public class InputValidator {
    private static Scanner scanner = new Scanner(System.in);

    public static String getNonEmptyString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) return input;
            System.out.println(" Error: Input cannot be empty. Try again.");
        }
    }

    public static double getPositiveDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                scanner.nextLine();
                if (value > 0) return value;
                System.out.println(" Error: Value must be positive.");
            } else {
                System.out.println(" Error: Invalid number format.");
                scanner.nextLine();
            }
        }
    }

    public static int getPositiveInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();
                if (value > 0) return value;
                System.out.println(" Error: Value must be positive.");
            } else {
                System.out.println(" Error: Invalid number format.");
                scanner.nextLine();
            }
        }
    }
}