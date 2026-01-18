void main() {

    try (Scanner scanner = new Scanner(System.in)) {
        // Prompt the user for words
        IO.print("Enter a noun: ");
        String noun = scanner.nextLine().trim();

        IO.print("Enter a verb: ");
        String verb = scanner.nextLine().trim();

        IO.print("Enter an adjective: ");
        String adjective = scanner.nextLine().trim();

        IO.print("Enter an adverb: ");
        String adverb = scanner.nextLine().trim();

        // Validate inputs (basic check for empty strings)
        if (noun.isEmpty() || verb.isEmpty() || adjective.isEmpty() || adverb.isEmpty()) {
            IO.println("Error: All fields must be filled in.");
            return;
        }

        // Create the story using string concatenation
        String story = "Once upon a time, there was a " + adjective + " " + noun +
                " who loved to " + verb + " " + adverb + ". " +
                "Everyone in the village admired the " + noun + " for its " + adjective + " nature.";

        // Display the story
        IO.println("\nHere’s your Mad Libs story:");
        IO.println(story);

    } catch (Exception e) {
        IO.println("An unexpected error occurred: " + e.getMessage());
    }
}
