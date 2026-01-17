// Program: VarsAndMath.java
// Demonstrates primitive variables, arithmetic, and string concatenation

public static void main(String[] args) {
    // Primitive type variables
    int apples = 5;
    int oranges = 3;
    double pricePerApple = 0.75; // in dollars
    double pricePerOrange = 0.60;
    char currencySymbol = '$';
    boolean hasDiscount = true;

    // Arithmetic operations
    int totalFruits = apples + oranges;
    double totalCost = (apples * pricePerApple) + (oranges * pricePerOrange);

    // Apply a discount if applicable
    double discountRate = 0.10; // 10% discount
    if (hasDiscount) {
        totalCost = totalCost - (totalCost * discountRate);
    }

    // Format total cost to two decimal places for currency display
    String formattedTotalCost = String.format("%.2f", totalCost);

    // String concatenation for output
    String message = "You bought " + totalFruits + " fruits ("
            + apples + " apples and " + oranges + " oranges)"
            + " for a total of " + currencySymbol + formattedTotalCost;

    // Output the result
    IO.println(message);
}