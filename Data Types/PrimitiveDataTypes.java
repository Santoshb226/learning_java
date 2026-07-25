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

        System.out.println("Short value: " + num);
        System.out.println("Integer value: " + age);
        System.out.println("Long value: " + l); 
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
        System.out.println("Char value: " + grade);
        System.out.println("Boolean value: " + isStudent);
    }
}
