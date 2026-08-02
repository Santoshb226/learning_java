public class Function {
    public static void main(String[] args) {

        /*
         * Function (Method) in Java:
         * A function (called a method in Java) is a reusable block of code
         * that performs a specific task. Instead of writing the same code
         * multiple times, we write it once inside a function and call it
         * whenever needed.
         *
         * Syntax:
         * returnType functionName(parameters) {
         *     // Code
         * }
         *
         * Return Type:
         * - Specifies what value the function sends back to the caller.
         * - Example: int, double, String, boolean, char, etc.
         *
         * void:
         * - 'void' means the function does NOT return any value.
         * - It performs a task but sends nothing back.
         */

        greet();

        sayHello("Santosh");

        System.out.println(getNumber());

        System.out.println(sum(4, 5));

        return; // This is optional becuse main methods return type is void.
    }

    // 1. No Input and No Output
    // Doesn't take any parameters and doesn't return any value.
    static void greet() {
        System.out.println("Hello!");
        return;
    }

    // 2. Input but No Output
    // Takes input (parameter) but doesn't return any value.
    static void sayHello(String name) {
        System.out.println("Hello! " + name);
        return;
    }

    // 3. No Input but Output
    // Doesn't take any parameters but returns an integer.
    static int getNumber() {
        return 5;
    }

    // 4. Input and Output
    // Takes two integers as input and returns their sum.
    static int sum(int x, int y) {
        return x + y;
    }
}