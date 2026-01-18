void main() {

    try (Scanner scanner = new Scanner(System.in)) {
        double principal, rate, time;
        // Get principal amount
        IO.print("Enter the principal amount: ");
        principal = scanner.nextDouble();
        if (principal <= 0) {
            IO.println("Principal must be greater than zero.");
            return;
        }

        // Get annual interest rate
        IO.print("Enter the annual interest rate (in %): ");
        rate = scanner.nextDouble();
        if (rate <= 0) {
            IO.println("Rate must be greater than zero.");
            return;
        }

        // Get time in years
        IO.print("Enter the time (in years): ");
        time = scanner.nextDouble();
        if (time <= 0) {
            IO.println("Time must be greater than zero.");
            return;
        }

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display result
        System.out.printf("Simple Interest = %.2f%n", simpleInterest);

    } catch (Exception e) {
        IO.println("Invalid input. Please enter numeric values only.");
    }
}