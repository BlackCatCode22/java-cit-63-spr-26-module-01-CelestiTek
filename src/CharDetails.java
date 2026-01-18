void main() {
    Scanner scanner = new Scanner(System.in);

    IO.print("Enter a single character: ");
    String input = scanner.nextLine();

    // Validate that exactly one character is entered
    if (input.length() != 1) {
        IO.println("Error: Please enter exactly one character.");
        scanner.close();
        return;
    }

    char ch = input.charAt(0);

    // Get Unicode value (int cast gives the code point for BMP characters)

    // Determine if it's a letter or digit using conditional operators
    String type = Character.isLetter(ch) ? "Letter" :
            (Character.isDigit(ch) ? "Digit" : "Neither letter nor digit");

    // Display results
    IO.println("Character: " + ch);
    IO.println("Unicode value: " + (int) ch);
    IO.println("Type: " + type);

    scanner.close();
}