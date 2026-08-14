package studentdata;

import java.util.Scanner;
import java.time.LocalDateTime;

public class MarkRecord {

    
    public static double calculateAverage(int[] marks) {
        int total = 0;

        for (int mark : marks) {
            total = total + mark;
        }

        return (double) total / marks.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Arrays to store names and marks
        String[] names = new String[n];
        int[] marks = new int[n];

        // Get student details
        for (int i = 0; i < n; i++) {

            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.next();

            System.out.print("Enter mark of " + names[i] + ": ");
            marks[i] = sc.nextInt();
        }

        // Display student details
        System.out.println("\n--- Student Details ---");

        for (int i = 0; i < n; i++) {

            System.out.println("Name: " + names[i]);
            System.out.println("Mark: " + marks[i]);

            // Check marks below 35
            if (marks[i] < 35) {
                System.out.println("Needs Improvement");
            }

            System.out.println();
        }

        // Calculate average
        double average = calculateAverage(marks);

        System.out.println("Average Mark: " + average);

        // Display current date and time
        System.out.println("Program ended at: " + LocalDateTime.now());

        sc.close();
    }
}