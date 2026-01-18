import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");

        // Validate input
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a numeric value for the radius.");
            scanner.close();
            return;
        }

        double radius = scanner.nextDouble();

        // Check for negative radius
        if (radius < 0) {
            System.out.println("Radius cannot be negative.");
            scanner.close();
            return;
        }

        // Calculate area using formula: Area = π * r²
        double area = Math.PI * radius * radius;

        // Display result with 2 decimal places
        System.out.printf("The area of the circle with radius %.2f is %.2f%n", radius, area);

        scanner.close();
    }
}