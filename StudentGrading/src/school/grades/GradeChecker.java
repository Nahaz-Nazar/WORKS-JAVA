public class GradeReport {
    public static void main(String[] args) {
        // 1. Store marks in an array
        int[] marks = {78, 82, 91, 65, 34};
        
        // 2. Initialize variables
        int totalMarks = 0;
        boolean hasFailed = false;
        
        // 3. Loop through marks to check for immediate failure and add to total
        for (int mark : marks) {
            if (mark < 35) {
                hasFailed = true;
                break; // Break the loop immediately
            }
            totalMarks += mark;
        }
        
        // 4. Process and display final result
        if (hasFailed) {
            System.out.println("Result: Fail");
        } else {
            double average = (double) totalMarks / marks.length;
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Marks: " + average);
            
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
