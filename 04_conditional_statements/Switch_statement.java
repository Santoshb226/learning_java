public class Switch_statement {

    public static void main(String[] args) {

        // =========================
        // Basic Switch Statement
        // =========================
        int i = 1;

        // The switch expression can be:
        // byte, short, int, char, enum, and (since Java 7) String.
        switch (i) {
            case 1:
                System.out.println("i is 1");
                break; // Exits the switch block.

            case 2:
                System.out.println("i is 2");
                break;

            case 3:
                System.out.println("i is 3");
                break;

            default:
                // Executes when none of the cases match.
                System.out.println("i is greater than 3");
                break;
        }


        // =========================
        // Nested Switch Statement
        // =========================
        int j = 5;
        int k = 1;

        switch (j) {

            case 4:
                System.out.println("j is 4");
                break;

            case 5:
                // A switch statement can be nested inside another switch.
                switch (k) {

                    case 1:

                        // Another nested switch.
                        switch (j) {
                            // Add cases here if needed.
                        }

                        // No break here, so execution falls through to case 2.
                        // This is called "fall-through."
                    case 2:
                        break;
                }

                // No break here, so execution continues to the default case.
                // This is another example of fall-through.

            default:
                System.out.println("j is neither 4 nor handled completely.");
                break;
        }


        /*
         * Important Notes:
         *
         * 1. The switch expression can be:
         *    - byte
         *    - short
         *    - int
         *    - char
         *    - enum
         *    - String (since Java 7)
         *
         * 2. Case labels must be unique.
         *
         * 3. The break statement prevents fall-through.
         *    Without break, execution continues to the next case.
         *
         * 4. The default block is optional but recommended.
         *
         * 5. Since Java 14, the enhanced switch expression
         *    (using -> syntax) is available and is generally preferred
         *    for cleaner and less error-prone code.
         */
    }
}