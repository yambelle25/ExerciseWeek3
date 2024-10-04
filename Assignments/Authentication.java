package Assignments;

public class Authentication {
    public static void main(String[] args) {
        // Declare and initialize boolean variables
        boolean isLoggedIn = true;
        boolean hasPermission = true;

        // Check if the user is logged in and has permission using negation
        if (!isLoggedIn) {
            System.out.println("Access Denied: User is not logged in.");
        } else if (!hasPermission) {
            System.out.println("Access Denied: User does not have permission.");
        } else {
            System.out.println("Access Granted: Welcome!");
        }
    }
}

