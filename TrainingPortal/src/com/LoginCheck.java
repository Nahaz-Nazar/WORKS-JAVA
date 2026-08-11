package com;

public class LoginCheck {
    public static void main(String[] args) {
        // Hardcoded entered values (User enter cheyyunna data)
        String enteredUsername = "admin";
        String enteredPassword = "java123";

        // Default credentials (Correct data)
        String defaultUsername = "admin";
        String defaultPassword = "java123";

        // Username-um Password-um correct aano ennu check cheyyunnu
        if (enteredUsername.equals(defaultUsername) && enteredPassword.equals(defaultPassword)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Access Denied");
        }
    }
}
