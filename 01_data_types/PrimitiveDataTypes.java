public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // Example of different data types

        //short is 8bit signed integer data type, range -127 to 128.
        short num = 10;

        //int is 32bit signed integer data type, range -2,147,483,648 to 2,147,483,647.
        int age = 25;

        //long is 64bit signed integer data type, range -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
        long l = 180L;
        
        // float is 32bit floating point data type.
        float f = 12.4f;

        //double is 64bit floating point data type.
        double d = 5.9;

        //char is 16bit unsigned integer data type, range 0 to 65,535.
        char grade = 'A';

        //boolean is a data type that can only have the values true or false.
        boolean isStudent = true;

        System.out.println("Short value: " + num); // Output: Short value: 10
        System.out.println("Integer value: " + age); // Output: Integer value: 25
        System.out.println("Long value: " + l); // Output: Long value: 180
        System.out.println("Float value: " + f); // Output: Float value: 12.4
        System.out.println("Double value: " + d); // Output: Double value: 5.9
        System.out.println("Char value: " + grade); // Output: Char value: A
        System.out.println("Boolean value: " + isStudent); // Output: Boolean value: true
    }
}


// HOW JAVA STORES NEGATIVE NUMBERS
// Java uses a method called "two's complement" to store negative numbers in binary.
// In two's complement, the most significant bit (MSB) is used as the sign bit.
// If the MSB is 0, the number is positive; if it is 1, the number is negative.
// For example, in an 8-bit representation:
// Positive number 5 in binary: 00000101
// Negative number -5 in binary: 11111011
// To get the two's complement of a number, you invert all the bits and add 1 to the least significant bit (LSB).
// For example, to get -5 from 5:
// 1. Start with the binary representation of 5: 00000101
// 2. Invert the bits: 11111010
// 3. Add 1 to the LSB: 11111010 + 1 = 11111011
// Therefore, -5 is represented as 11111011 in two's complement.
// This method allows for simple arithmetic operations between positive and negative numbers in binary.
