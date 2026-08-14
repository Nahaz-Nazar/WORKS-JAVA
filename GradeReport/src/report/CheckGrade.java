package report;

public class CheckGrade {

    public static void main(String[] args) {
        // 1. Store marks of 5 subjects in an array
        int[] marks = {78, 82, 91, 65, 34}; 

        boolean hasFailed = false;
        int total = 0;

        // 2. Loop through each subject to check for instant fail and calculate total
        for (int mark : marks) {
            if (mark < 35) {
                System.out.println("Fail");
                hasFailed = true;
                break; // Stop checking the rest immediately
            }
            total = total + mark;
        }

        // 3. If the student passed all subjects, calculate average and display grade
        if (hasFailed == false) {
            double average = (double) total / marks.length;

            System.out.println("Total Marks: " + total);
            System.out.println("Average Mark: " + average);

            if (average >= 90) {
                System.out.println("Grade: A");
            } else if (average >= 75) {
                System.out.println("Grade: B");
            } else if (average >= 60) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D");
            }
        }
    }
}
