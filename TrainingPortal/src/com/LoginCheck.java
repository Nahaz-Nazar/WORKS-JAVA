package com;

public class LoginCheck {
    public static void main(String[] args) {

        
        String enteredUsername = "admin";
=======
        
        String enteredPassword = "java123";

        // Default credentials (Correct data)
        String defaultUsername = "admin";
        String defaultPassword = "java123";

        if (enteredUsername.equals(defaultUsername) && enteredPassword.equals(defaultPassword)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Access Denied");
        }
    }
}
