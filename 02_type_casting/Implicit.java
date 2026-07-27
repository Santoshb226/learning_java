public class Implicit {
    public static void main(String[] args) {
        //implicit type casting (widening conversion)
        // byte -> int 
        byte b = 10;
        int i = b;
        System.out.println("Byte value: " + b); // Output: Byte value: 10
        System.out.println("Integer value: " + i); // Output: Integer value: 10

        // char -> int
        char c = 'A';
        int j = c;
        System.out.println("Char value: " + c); // Output: Char value: A
        System.out.println("Integer value: " + j); // Output: Integer value: 65
    }
}

// Implicit type casting, also known as widening conversion, occurs when a smaller data type is automatically converted to a larger data type. In this example, a byte value is assigned to an int variable, and a char value is assigned to an int variable. The conversion happens without any explicit casting required by the programmer.
// In the case of the char to int conversion, the character 'A' is converted to its corresponding ASCII value, which is 65. This demonstrates how implicit type casting allows for seamless data type conversions in Java.
// Note: Implicit type casting can only occur when the target data type has a larger range than the source data type. If the target data type has a smaller range, explicit type casting (narrowing conversion) is required, which may lead to data loss or unexpected results.