// Java is a pass-by-value language.
//
// For primitive values, the actual value is copied.
// For objects, the value of the reference is copied.
//
// Java NEVER uses true pass-by-reference.

public class PassByValue {

    // Here, x and y receive copies of the primitive values.
    public static void addTen(int x, int y) {
        x += 10;
        y += 10;

        // Only the local copies are changed.
        // The original a1.x and a1.y remain unchanged.
    }

    // Here, 'a' receives a copy of the reference stored in a1.
    public static void addFive(Addition a) {
        a.x += 5;
        a.y += 5;

        //         a1 ──────────┐
        //              ↓
        //         ┌──────────────┐
        //         │ Addition     │
        //         │ x = 10       │
        //         │ y = 10       │
        //         └──────────────┘
        //              ↑
        //              │
        // a  ──────────┘
        
        // 'a' and 'a1' point to the SAME Addition object.
        // Therefore, changing a.x and a.y changes the actual object.
    }

    public static void main(String[] args) {

        Addition a1 = new Addition(10, 10);

        System.out.println(a1.x + " " + a1.y);
        // Output: 10 10


        // Passing the VALUES of a1.x and a1.y.
        // These are primitive int values, so copies are passed.
        addTen(a1.x, a1.y);

        System.out.println(a1.x + " " + a1.y);
        // Output: 10 10
        //
        // No change because addTen() modified only the copied values
        // of x and y, not a1.x and a1.y.


        // Passing the REFERENCE VALUE stored inside a1.
        // The reference itself is copied into parameter 'a'.
        addFive(a1);

        System.out.println(a1.x + " " + a1.y);
        // Output: 15 15
        //
        // a and a1 point to the SAME object.
        // Therefore, modifying a.x and a.y modifies the same object
        // that a1 refers to.
    }
}


class Addition {

    int x;
    int y;

    Addition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}