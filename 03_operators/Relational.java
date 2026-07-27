public class Relational {
    public static void main(String[] args) {

        // Relational operations are used to compare two values and return a boolean result (true or false). The relational operators in Java are:
        // 1. Greater than (>)
        // 2. Less than (<)
        // 3. Greater than or equal to (>=)
        // 4. Less than or equal to (<=)
        // 5. Equal to (==)
        // 6. Not equal to (!=)

        int x = 10;
        int y = 20;

        // Greater than
        boolean isGreater = x > y;
        System.out.println("Is x greater than y? " + isGreater); // Output: Is x greater than y? false

        // Less than
        boolean isLess = x < y;
        System.out.println("Is x less than y? " + isLess); // Output: Is x less than y? true

        // Greater than or equal to
        boolean isGreaterOrEqual = x >= y;
        System.out.println("Is x greater than or equal to y? " + isGreaterOrEqual); // Output: Is x greater than or equal to y? false

        // Less than or equal to
        boolean isLessOrEqual = x <= y;
        System.out.println("Is x less than or equal to y? " + isLessOrEqual); // Output: Is x less than or equal to y? true

        // Equal to
        boolean isEqual = x == y;
        System.out.println("Is x equal to y? " + isEqual); // Output: Is x equal to y? false

        // Not equal to
        boolean isNotEqual = x != y;
        System.out.println("Is x not equal to y? " + isNotEqual); // Output: Is x not equal to y? true
    }    
}