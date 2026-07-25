public class Explicit {
    public static void main(String[] args) {
        // explicit type casting (narrowing conversion)
        // int -> byte
        int i = 300;
        byte b = (byte) i;
        System.out.println("Integer value: " + i); // Output: Integer value: 300
        System.out.println("Byte value: " + b); // Output: Byte value: 44
        // Let's understand why the byte value is 44 instead of 300. The range of a byte in Java is from -128 to 127. When we cast the integer value 300 to a byte, it exceeds the maximum value of a byte. The conversion wraps around, and the resulting value is calculated as follows:
        // 300 - 256 = 44 (since 256 is the range of byte, which is 2^8)
        // Therefore, the byte value becomes 44 after the explicit type casting.


        // truncating conversion
        // float -> int
        float f = 9.78f;
        int j = (int) f;
        System.out.println("Float value: " + f); // Output: Float value: 9.78
        System.out.println("Integer value: " + j); // Output: Integer value: 9
        // In this case, the float value 9.78 is explicitly cast to an int. The fractional part (.78) is truncated, and only the whole number part (9) is retained in the integer variable j. This demonstrates how explicit type casting can lead to loss of precision when converting from a floating-point type to an integer type.


        // boolean to int conversion is not allowed in Java, so we cannot perform explicit type casting between these two types. If you try to cast a boolean value to an int, it will result in a compilation error.
    }    
}
