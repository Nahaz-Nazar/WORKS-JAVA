package com;

public class LoginCheck {
    public static void main(String[] args) {
<<<<<<< HEAD
        
        String enteredUsername = "admin";
=======
        // Hardcoded entered values 
>>>>>>> e74e2ac9a16a36ae6256bf47b040282ef7469841
        String enteredPassword = "java123";

        // Default credentials (Correct data)
        String defaultUsername = "admin";
        String defaultPassword = "java123";

<<<<<<< HEAD
=======

>>>>>>> e74e2ac9a16a36ae6256bf47b040282ef7469841
        
        if (enteredUsername.equals(defaultUsername) && enteredPassword.equals(defaultPassword)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Access Denied");
        }
    }
}
