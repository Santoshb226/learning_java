/*
 * ============================================================
 *                    JAVA OOP BASICS
 * ============================================================
 *
 * OOP = Object-Oriented Programming
 * Object-Oriented Programming is a programming paradigm where
 * we organize code around "objects".
 * 
 * An object represents a real-world entity and contains:
 * 1. State  -> Data / properties of the object
 * 2. Behavior -> Actions / methods the object can perform
 * Example:
 * Student
 *   State    -> name, age, rollNumber
 *   Behavior -> markAttendance()
 *
 * CORE OOP CONCEPTS:
 * 1. Class
 *    A class is a blueprint/template for creating objects.
 * 2. Object
 *    An object is an instance of a class.
 * 3. Encapsulation
 *    Bundling data and the methods that operate on that data
 *    inside a single class.
 * 4. Inheritance
 *    A class can acquire properties and methods from another
 *    class using "extends".
 * 5. Polymorphism
 *    One interface/method can have different implementations.
 *    Commonly achieved through method overloading and overriding.
 * 6. Abstraction
 *    Hiding unnecessary implementation details and exposing
 *    only the essential functionality.
 *
 * ============================================================
 */


public class OOPS {

    public static void main(String[] args) {
        /*
         * Creating objects of the Student class.
         * "new Student()" creates a new Student object in memory.
         * s1 and s2 are reference variables that refer to
         * two different Student objects.
         * This demonstrates:
         *      Class  -> Student
         *      Objects -> s1 and s2
         */

        Student s1 = new Student();
        Student s2 = new Student();


        /*
         * Assigning data to the first Student object.
         *
         * These variables represent the STATE of the object.
         */

        s1.name = "Santosh";
        s1.age = 26;
        s1.rollNumber = 21;


        /*
         * Assigning different data to the second Student object.
         *
         * Notice that s1 and s2 have their own separate data.
         */

        s2.name = "Zeon";
        s2.age = 24;
        s2.rollNumber = 22;


        /*
         * Calling a method using the s1 object.
         *
         * markAttendance() represents the BEHAVIOR of a Student.
         *
         * Inside the method, "name" refers to the name belonging
         * to the object that called the method.
         *
         * Therefore, this prints:
         * Attendance marked by Santosh
         */

        s1.markAttendance();


        /*
         * Accessing the properties of the s2 object.
         *
         * Since s2 contains:
         * name = Zeon
         * age = 24
         *
         * The output will be:
         * Zeon is 24 years old.
         */

        System.out.println(s2.name + " is " + s2.age + " years old.");
    }
}


/*
 * ============================================================
 *                        STUDENT CLASS
 * ============================================================
 *
 * A CLASS is a blueprint/template used to create objects.
 *
 * Think of the class as a design:
 *
 * Student
 *   |
 *   |-- name
 *   |-- age
 *   |-- rollNumber
 *   |
 *   |-- markAttendance()
 *
 * From this blueprint, we can create many Student objects.
 */

class Student {

    /*
     * These are INSTANCE VARIABLES / FIELDS.
     *
     * They represent the STATE (data) of a Student object.
     *
     * Every Student object gets its own copy of these variables.
     *
     * Example:
     *
     * s1.name = "Santosh";
     * s2.name = "Zeon";
     *
     * s1 and s2 therefore have different names.
     */

    String name;
    int age;
    int rollNumber;


    /*
     * This is a METHOD.
     *
     * A method represents the BEHAVIOR / ACTION that an object
     * can perform.
     *
     * The method uses the "name" variable belonging to the
     * object that calls it.
     *
     * If:
     *
     * s1.markAttendance();
     *
     * then "name" refers to s1.name.
     *
     * If:
     *
     * s2.markAttendance();
     *
     * then "name" refers to s2.name.
     */

    void markAttendance() {
        System.out.println("Attendance marked by " + name);
    }
}


/*
 * ============================================================
 *                    IMPORTANT OOP RELATION
 * ============================================================
 *
 * CLASS:
 *     Blueprint / template
 *
 * OBJECT:
 *     Real instance created from the class
 *
 * In this example:
 *
 *     Student          -> Class
 *
 *     s1               -> Object
 *     s2               -> Object
 *
 *
 * Each object has its own STATE:
 *
 *     s1
 *       name = Santosh
 *       age = 26
 *       rollNumber = 21
 *
 *     s2
 *       name = Zeon
 *       age = 24
 *       rollNumber = 22
 *
 *
 * Both objects use the same BEHAVIOR:
 *
 *     markAttendance()
 *
 * This is the basic idea behind Object-Oriented Programming:
 *
 *              OBJECT = STATE + BEHAVIOR
 *
 * ============================================================
 */
