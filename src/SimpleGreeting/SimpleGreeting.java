void main() {
    Scanner scanner = new Scanner(System.in);

    IO.print("Please enter your name: ");
    String name = scanner.nextLine().trim(); // Remove leading/trailing spaces

    // Validate input
    if (name.isEmpty()) {
        IO.println("You didn't enter a name. Please run the program again.");
    } else {
        IO.println("Hello, " + name + "! Nice to meet you.");
    }

    scanner.close();
}