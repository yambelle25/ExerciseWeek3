package Assignments;

public class Mda {
    public static void main(String[] args) {
        // Declare and initialize a 2D array (matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6, 7},
            {8, 9}
        };

        // Print the length of the main array
        System.out.println("Length of main array (matrix): " + matrix.length);

        // Print the lengths of sub-arrays
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Length of sub-array " + i + " : " + matrix[i].length);
        }

        // Loop through the array and print each element
        System.out.println("Elements of the array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}
