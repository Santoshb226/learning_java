// public class Constructor {

//     public static void main(String[] args) {
//         Student s1 = new Student("Santosh", 26, 21, "DTSS");
//         Student s2 = new Student();
//         System.out.println(s1.name);

//     // If we dont create constructor then by default it will output "null"
//     // String -> null, int -> 0, float -> 0.0, boolean -> false
//     System.out.println(s2.name);

//     }
    
// }

// class Student {
//     String name;
//     int age;
//     int rollNumber;
//     String college;

//     // Rules of Constructor:
//     // 1. Same name as class. 2. Not retrun typ, not even void. 3. Automatically called during object creation. 4. Used to initialize an object. 5. It can also be overloaded.
//     Student(String name, int age, int rollNumber, String college) {
//         this.name = name;
//         this.age = age;
//         this.rollNumber = rollNumber;
//         this.college = college;

//         //We can also write like this
//         // this(name, age, rollNumber, college);
//     }

//     Student() {}
// }

// --------------------------------------------------------------------------------------------------------------------

// Constructor chaining and this keyword
public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        // Student s2 = new Student("Santosh");
        // Student s3 = new Student("Zeon", 24);
        // Student s4 = new Student("Panda", 25, 21, "IIT Bombay");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);
    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    Student() {
    this("Unknown");
    System.out.println("1st Constructor");
}

    Student(String name) {
        this(name, 0);
        System.out.println("2nd Constructor");
    }

    Student(String name, int age) {
        this(name, age, 0);
        System.out.println("3rd Constructor");
    }

    Student(String name, int age, int rollNumber) {
        this(name, age, rollNumber, "Unknown");
        System.out.println("4th Constructor");
    }

    Student(String name, int age, int rollNumber, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
        System.out.println("5th Constructor");
    }
}