package TempConverter;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for Fahrenheit temperature
        System.out.print("Enter temperature in Fahrenheit: ");

        // Validate input
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.close();
            return;
        }

        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using formula: C = (F - 32) * 5/9
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        // Display result with 2 decimal places
        System.out.printf("%.2f°F is equal to %.2f°C%n", fahrenheit, celsius);

        scanner.close();
    }
}