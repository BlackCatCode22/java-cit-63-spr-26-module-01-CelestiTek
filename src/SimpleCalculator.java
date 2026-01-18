void main() {

    try (Scanner scanner = new Scanner(System.in)) {
        double num1, num2;
        char operator;
        // Get first number
        IO.print("Enter first number: ");
        if (!scanner.hasNextDouble()) {
            IO.println("Invalid input. Please enter a numeric value.");
            return;
        }
        num1 = scanner.nextDouble();

        // Get second number
        IO.print("Enter second number: ");
        if (!scanner.hasNextDouble()) {
            IO.println("Invalid input. Please enter a numeric value.");
            return;
        }
        num2 = scanner.nextDouble();

        // Get operation
        IO.print("Enter an operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        double result;

        // Perform calculation based on operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                IO.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                IO.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                IO.println("Result: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    IO.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    IO.println("Result: " + result);
                }
                break;
            default:
                IO.println("Invalid operator. Please use +, -, *, or /.");
        }

    } catch (Exception e) {
        IO.println("An unexpected error occurred: " + e.getMessage());
    }
}