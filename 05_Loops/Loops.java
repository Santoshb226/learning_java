public class Loops {
    public static void main(String[] args) {

        /*
         * ==========================================================
         *                         LOOPS
         * ==========================================================
         * Definition:
         * A loop is a control flow statement that repeatedly executes
         * a block of code as long as a specified condition is true.
         *
         * Java provides three types of loops:
         * 1. for loop
         * 2. while loop
         * 3. do-while loop
         */


        // ==========================================================
        //                     1. FOR LOOP
        // ==========================================================

        /*
         * Definition:
         * A for loop is used when the number of iterations
         * is known in advance.
         */


        // ----------------------------------------------------------
        // Syntax
        // ----------------------------------------------------------

        /*
         * for (initialization; condition; update) {
         *     // Code to be executed
         * }
         *
         * initialization -> Executes only once before the loop starts.
         * condition      -> Checked before every iteration.
         *                   If true, the loop continues.
         *                   If false, the loop terminates.
         * update         -> Executes after every iteration.
         */


        // ----------------------------------------------------------
        // Example 1: Print numbers from 1 to 10
        // ----------------------------------------------------------

        /*
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        */


        // ----------------------------------------------------------
        // Example 2: Print Even Numbers (Using if)
        // ----------------------------------------------------------

        /*
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        */


        // ----------------------------------------------------------
        // Example 3: Print Even Numbers (Optimized)
        // ----------------------------------------------------------

        /*
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
        */


        // ----------------------------------------------------------
        // Nested for Loop
        // ----------------------------------------------------------

        /*
         * Definition:
         * A nested loop is a loop inside another loop.
         * For every iteration of the outer loop,
         * the inner loop executes completely.
         */

        /*
        for (int i = 1; i <= 3; i++) {

            System.out.println("Outer Loop: " + i);

            for (int j = 1; j <= 5; j++) {
                System.out.println("Inner Loop: " + j);
            }

            System.out.println();
        }
        */


        // ----------------------------------------------------------
        // Multiplication Pattern
        // ----------------------------------------------------------

        /*
         * Output:
         * 123
         * 246
         * 369
         */

        /*
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j);
            }

            System.out.println();
        }
        */



        // ==========================================================
        //                    2. WHILE LOOP
        // ==========================================================

        /*
         * Definition:
         * A while loop repeatedly executes a block of code
         * as long as the specified condition is true.
         *
         * It is generally used when the number of iterations
         * is NOT known beforehand.
         */


        // ----------------------------------------------------------
        // Syntax
        // ----------------------------------------------------------

        /*
         * initialization;
         *
         * while (condition) {
         *     // Code to be executed
         *     update;
         * }
         *
         * initialization -> Executes once before the loop starts.
         * condition      -> Checked before every iteration.
         * update         -> Changes the loop variable.
         */


        // ----------------------------------------------------------
        // Example 1: Print numbers from 1 to 10
        // ----------------------------------------------------------

        /*
        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        */


        // ----------------------------------------------------------
        // Example 2: Print Even Numbers
        // ----------------------------------------------------------

        /*
        int i = 0;

        while (i <= 10) {
            System.out.println(i);
            i += 2;
        }
        */


        // ----------------------------------------------------------
        // Example 3: Countdown
        // ----------------------------------------------------------

        /*
        int count = 5;

        while (count >= 1) {
            System.out.println(count);
            count--;
        }

        System.out.println("Liftoff!");
        */


        // ----------------------------------------------------------
        // Infinite while Loop
        // ----------------------------------------------------------

        /*
         * If the condition never becomes false,
         * the loop runs forever.
         */

        /*
        while (true) {
            System.out.println("Running...");
        }
        */



        // ==========================================================
        //                  3. DO-WHILE LOOP
        // ==========================================================

        /*
         * Definition:
         * A do-while loop executes the code block first
         * and checks the condition afterward.
         *
         * Therefore, the loop executes at least once.
         */


        // ----------------------------------------------------------
        // Syntax
        // ----------------------------------------------------------

        /*
         * initialization;
         *
         * do {
         *     // Code to be executed
         *     update;
         * } while (condition);
         */


        // ----------------------------------------------------------
        // Example 1: Print numbers from 1 to 10
        // ----------------------------------------------------------

        /*
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
        */


        // ----------------------------------------------------------
        // Example 2: Print Even Numbers
        // ----------------------------------------------------------

        /*
        int i = 0;

        do {
            System.out.println(i);
            i += 2;
        } while (i <= 10);
        */


        // ----------------------------------------------------------
        // Example 3: Executes At Least Once
        // ----------------------------------------------------------

        /*
         * Even though the condition is false initially,
         * the loop executes once because
         * the condition is checked afterward.
         */

        /*
        int i = 11;

        do {
            System.out.println("Executed once!");
        } while (i <= 10);
        */


        // ==========================================================
        //             DIFFERENCE BETWEEN LOOPS
        // ==========================================================

        /*
         * for loop
         * - Best when the number of iterations is known.
         * - Initialization, condition, and update are in one statement.
         *
         * while loop
         * - Best when the number of iterations is unknown.
         * - Condition is checked before execution.
         * - May execute zero times.
         *
         * do-while loop
         * - Condition is checked after execution.
         * - Executes at least once.
         */
    }
}