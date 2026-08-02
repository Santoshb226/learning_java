public class Function_overloading {
    public static void main(String[] args) {

        /*
         * Function Overloading:
         * Function overloading means creating multiple methods with the
         * same name but different parameter lists (number, type, or order
         * of parameters). The compiler decides which method to call based
         * on the arguments passed during the method call.
         *
         * Benefits:
         * - Improves code readability.
         * - Allows the same method name to perform similar tasks.
         * - Eliminates the need for different method names.
         */

        int x = sum(2, 4);
        System.out.println(x);

        int y = sum(5, 6);
        System.out.println(y);

        int z = sum(3, 5, 6);
        System.out.println(z);

        greet("Santosh", 26);
        greet(26, "Santosh");

        func();
    }

    // Same method name, 2 integer parameters
    static int sum(int x, int y) {
        return x + y;
    }

    // Overloaded: Different number of parameters
    static int sum(int x, int y, int z) {
        return x + y + z;
    }

    // Overloaded: Different parameter data types
    static int sum(double x, double y) {
        return (int) (x + y);
    }

    // Overloaded: String comes first, then int
    static void greet(String name, int age) {
        System.out.println("Hi " + name + ". Your age is " + age);
    }

    // Overloaded: int comes first, then String
    static void greet(int age, String name) {
        System.out.println("Hi " + name + ". Your age is " + age);
    }


    // Not overloaded becuase func and func2 names are different.
    static void func() {
        System.out.println("Hello");
    }

    static int func2() {
        System.out.println("Hello");
        return 5;
    }
}