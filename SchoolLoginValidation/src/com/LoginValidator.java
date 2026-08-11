package com;

import java.util.Scanner;

public class LoginValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter role ID (1 for admin, 2 for student, 3 for guest): ");
        int roleId = scanner.nextInt();

        System.out.print("Enter username code (A/S/G): ");
        char userCode = scanner.next().charAt(0);

        System.out.print("Enter password (integer): ");
        int password = scanner.nextInt();

        if (roleId == 3) {
            System.out.println("Welcome Guest. View-only access.");
        } else if (roleId == 1 && userCode == 'A' && password == 1234) {
            System.out.println("Welcome Admin. Full access granted.");
        } else if (roleId == 2 && userCode == 'S' && password == 1111) {
            System.out.println("Welcome Student. Limited access granted.");
        } else {
            System.out.println("Invalid credentials or role.");
        }

        scanner.close();
    }
}
