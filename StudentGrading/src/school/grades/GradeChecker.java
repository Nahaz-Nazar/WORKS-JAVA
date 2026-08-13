package school.grades;

public class GradeChecker {
    public static void main(String[] args) {z
        // Stores the 5 scores in a single-dimension array
        int[] scores = {92, 85, 74, 48, 90};

        // Loop through the array to evaluate each score
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            
            // Check conditions and print corresponding evaluation
            if (score >= 90) {
                System.out.println("Score: " + score + " - Excellent");
            } else if (score >= 75) {
                System.out.println("Score: " + score + " - Good");
            } else if (score >= 50) {
                System.out.println("Score: " + score + " - Average");
            } else {
                System.out.println("Score: " + score + " - Fail");
            }
        }
    }
}
