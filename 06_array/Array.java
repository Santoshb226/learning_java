public class Array {
    public static void main(String[] args) {

        /*
         * ========================= ARRAY =========================
         *
         * Definition:
         * An array is an object that stores multiple values of the same
         * data type in contiguous memory locations.
         *
         * - Arrays are fixed in size once created.
         * - Indexing starts from 0.
         * - The array object is created in Heap memory.
         * - The reference variable (if local) is stored in Stack memory.
         */

        // =========================================================
        // 1D ARRAY
        // =========================================================

        // Create an integer array of size 5.
        // By default, all values are initialized to 0.
        // int[] rollNums = new int[5];

        // ---------- Manual way ----------
        // rollNums[0] = 21;
        // rollNums[1] = 22;
        // rollNums[2] = 23;
        // rollNums[3] = 24;
        // rollNums[4] = 25;

        // ---------- Using a loop ----------
        // int rollNum = 21;

        // for (int i = 0; i < rollNums.length; i++) {
        //     rollNums[i] = rollNum;
        //     rollNum++;
        // }

        // ---------- Print the array ----------
        // for (int i = 0; i < rollNums.length; i++) {
        //     System.out.println(rollNums[i]);
        // }

        // ---------- Direct initialization ----------
        // int[] arr = {21, 22, 23};

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }


        /*
         * ========================= 2D ARRAY =========================
         *
         * Definition:
         * A 2D array is an array whose elements are references
         * to other 1D arrays.
         *
         * It is also called an "Array of Arrays".
         *
         * Memory Representation:
         *
         * student
         *    |
         *    +----> Row 0 --> [88, 88, 88]
         *    |
         *    +----> Row 1 --> [88, 88, 88]
         *    |
         *    +----> Row 2 --> [88, 88, 88]
         *
         * student[0] -> Reference to first row
         * student[1] -> Reference to second row
         * student[2] -> Reference to third row
         */

        // =========================================================
        // Regular (Rectangular) 2D Array
        // =========================================================

        // int[][] student = new int[3][3];

        // Store values
        // for (int i = 0; i < student.length; i++) {
        //     for (int j = 0; j < student[i].length; j++) {
        //         student[i][j] = 88;
        //     }
        // }

        // Print values
        // for (int i = 0; i < student.length; i++) {
        //     for (int j = 0; j < student[i].length; j++) {
        //         System.out.print(student[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        // =========================================================
        // Jagged (Ragged) 2D Array
        // Each row can have a different number of columns.
        // =========================================================

        // int[][] student = new int[3][];

        // Create each row separately.
        // student[0] = new int[1];
        // student[1] = new int[2];
        // student[2] = new int[3];

        // Store values
        // int value = 1;

        // for (int i = 0; i < student.length; i++) {
        //     for (int j = 0; j < student[i].length; j++) {
        //         student[i][j] = value++;
        //     }
        // }

        // Print values
        // for (int i = 0; i < student.length; i++) {
        //     for (int j = 0; j < student[i].length; j++) {
        //         System.out.print(student[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        // =========================================================
        // Direct Initialization
        // =========================================================

        // 1D Array
        // int[] arr1 = {21, 22, 23};

        // 2D Array
        // int[][] arr2 = {
        //     {21, 22, 23},
        //     {32, 43, 25},
        //     {54, 76, 87}
        // };
    }
}