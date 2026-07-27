public class Selection_statement {

    public static void main(String[] args) {

        // =========================
        // Selection Statements (if, if-else, nested if, if-else-if ladder)
        // =========================

        // Declare and initialize a variable.
        byte i = 24;

        // =========================
        // Simple if-else Statement
        // =========================

        // The condition must evaluate to either true or false.
        // Both conditions must be true because of the && (AND) operator.
        if (i < 5 && i > 10) {
            // This block will never execute because a number
            // cannot be less than 5 and greater than 10 at the same time.
            System.out.println("i is less than 5 and greater than 10");
        } else {
            System.out.println("Condition is false");
        }

        // =========================
        // Check Even or Odd
        // =========================

        // If the remainder is 0 after dividing by 2,
        // the number is even.
        if (i % 2 == 0) {
            System.out.println("i is even");
        } else {
            System.out.println("i is odd");
        }

        // =========================
        // Nested if Statement
        // =========================

        // Nested if statements are used when one condition
        // depends on another.
        if (i > 5) {

            if (i < 25) {

                if (i == 24) {
                    System.out.println("Value of i is equal to 24");
                } else {
                    System.out.println("Value of i is not equal to 24");
                }

            } else {
                System.out.println("Value of i is greater than or equal to 25");
            }

        } else {
            System.out.println("Value of i is less than or equal to 5");
        }

        // =========================
        // if-else-if Ladder
        // =========================

        // The conditions are checked from top to bottom.
        // As soon as one condition is true, the remaining
        // conditions are skipped.
        if (i == 5) {
            System.out.println("i is 5");
        } else if (i == 6) {
            System.out.println("i is 6");
        } else if (i == 7) {
            System.out.println("i is 7");
        } else if (i == 8) {
            System.out.println("i is 8");
        } else if (i == 24) {
            System.out.println("i is 24");
        } else {
            System.out.println("i does not match any condition");
        }

        /*
         * Important Notes:
         *
         * 1. if executes only when the condition is true.
         *
         * 2. if-else chooses one of two blocks.
         *
         * 3. Nested if is useful when multiple conditions
         *    must be checked in sequence.
         *
         * 4. In an if-else-if ladder, conditions are evaluated
         *    from top to bottom. Only the first matching block executes.
         *
         * 5. else is optional but recommended when you want
         *    to handle all remaining cases.
         */
    }
}