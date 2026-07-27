public class Logical {
    public static void main(String[] args) {
        // Logical operations are used to combine multiple boolean expressions and return a boolean result (true or false). The logical operators in Java are:
        // 1. AND (&&)
        // 2. OR (||)
        // 3. NOT (!)

        boolean a = true;
        boolean b = false;

        // Logical AND
        boolean andResult = a && b; // true && false = false
        System.out.println("Logical AND: " + andResult); // Output: Logical AND: false

        // Logical OR
        boolean orResult = a || b; // true || false = true
        System.out.println("Logical OR: " + orResult); // Output: Logical OR: true

        // Logical NOT
        boolean notResult = !a; // !true = false
        System.out.println("Logical NOT: " + notResult); // Output: Logical NOT: false


        // Short-circuit evaluation
        // In Java, logical operators && and || use short-circuit evaluation. This means that if the result of the expression can be determined by evaluating only the first operand, the second operand is not evaluated. This can improve performance and prevent unnecessary computations.
        int x = 10; 
        int y = 5;
        boolean shortCircuitAnd = (x > 0) && (y++ > 0); // The second condition is not evaluated because the first condition is true
        System.out.println("Short-circuit AND: " + shortCircuitAnd); // Output: Short-circuit AND: true
        System.out.println("Value of y after short-circuit AND: " + y); // Output: Value of y after short-circuit AND: 6        
    }
}
