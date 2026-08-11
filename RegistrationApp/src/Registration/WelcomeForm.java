package Registration;

import java.util.Scanner;

public class WelcomeForm {

    public static void main(String[] args) {

        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Ask for first name
        System.out.print("Enter your first name: ");
        String name = sc.nextLine();

        // Ask for age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Display welcome message
        System.out.println("Welcome, " + name + "!");
        System.out.println("You are " + age + " years old.");

        // Close Scanner
        sc.close();
    }
}