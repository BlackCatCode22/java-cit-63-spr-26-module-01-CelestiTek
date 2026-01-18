import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your favorite number: ");
        String input = scanner.nextLine().trim();

        try {
            // Try parsing as integer first
            if (input.contains(".")) {
                // If it contains a decimal point, parse as double
                double favoriteDouble = Double.parseDouble(input);
                System.out.println("Your favorite number is " + favoriteDouble + ". That's a great choice!");
            } else {
                // Otherwise, parse as integer
                int favoriteInt = Integer.parseInt(input);
                System.out.println("Your favorite number is " + favoriteInt + ". That's awesome!");
            }
        } catch (NumberFormatException e) {
            System.out.println("That doesn't seem to be a valid number. Please run the program again.");
        }

        scanner.close();
    }
}