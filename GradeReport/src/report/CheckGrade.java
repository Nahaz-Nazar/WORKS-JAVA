package report;

public class CheckGrade {

    public static void main(String[] args) {

        // Store 5 student scores in a single-dimensional array
        int[] scores = {95, 82, 68, 45, 90};

        // Check each score
        for (int i = 0; i < scores.length; i++) {

            System.out.print("Student " + (i + 1) + " Score: " + scores[i] + " - ");

            if (scores[i] >= 90) {
                System.out.println("Excellent");

            } else if (scores[i] >= 75) {
                System.out.println("Good");

            } else if (scores[i] >= 50) {
                System.out.println("Average");

            } else {
                System.out.println("Fail");
            }
        }
    }
}