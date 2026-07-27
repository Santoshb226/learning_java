public class Bitwise { 
    public static void main(String[] args) {
        // Bitwise operations are used to perform operations on individual bits of integer values. The bitwise operators in Java are:
        // 1. AND (&)
        // 2. OR (|)
        // 3. XOR (^)   
        // 4. NOT (~)

        int x = 5; // Binary: 0101
        int y = 3; // Binary: 0011  

        // Bitwise AND
        int andResult = x & y; // Binary: 0001 (Decimal: 1)
        System.out.println("Bitwise AND: " + andResult); // Output: Bitwise AND: 1  

        // Bitwise OR
        int orResult = x | y; // Binary: 0111 (Decimal: 7)
        System.out.println("Bitwise OR: " + orResult); // Output: Bitwise OR: 7     

        // Bitwise XOR
        int xorResult = x ^ y; // Binary: 0110 (Decimal: 6)
        System.out.println("Bitwise XOR: " + xorResult); // Output: Bitwise XOR: 6

        // Bitwise NOT
        int notResult = ~x; // Binary: 1010 (Decimal: -6
        System.out.println("Bitwise NOT: " + notResult); // Output: Bitwise NOT: -6

        // Bitwise shift operators
        // 1. Left shift (<<)
        // 2. Right shift (>>)

        int z = 8; // Binary: 1000
        // Left shift
        int leftShiftResult = z << 2; // Binary: 100000 (Decimal: 32)
        System.out.println("Left Shift: " + leftShiftResult); // Output: Left Shift: 32

        // Right shift
        int rightShiftResult = z >> 2; // Binary: 0010 (Decimal : 2)
        System.out.println("Right Shift: " + rightShiftResult); // Output: Right Shift: 2
    }
}
