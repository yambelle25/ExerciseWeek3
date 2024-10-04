package Assignments;

public class dv {
    public static void main(String[] args) {
        // Declare arrays for different data types without explicitly setting values
        int[] intArray = new int[5];
        double[] doubleArray = new double[5];
        char[] charArray = new char[5];
        boolean[] booleanArray = new boolean[5];
        String[] stringArray = new String[5];

        // Print default values of the arrays
        System.out.println("Default values for int array:");
        for (int i : intArray) {
            System.out.println(i);
        }

        System.out.println("Default values for double array:");
        for (double d : doubleArray) {
            System.out.println(d);
        }

        System.out.println("Default values for char array:");
        for (char c : charArray) {
            System.out.println("[" + c + "]");  // Empty characters show as blanks
        }

        System.out.println("Default values for boolean array:");
        for (boolean b : booleanArray) {
            System.out.println(b);
        }

        System.out.println("Default values for String array:");
        for (String s : stringArray) {
            System.out.println(s);
        }
    }
}
