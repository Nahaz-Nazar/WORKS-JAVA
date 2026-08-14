public class GradeChecker {
    public static void main(String[] args) {
        // Store 5 student scores in a single-dimension array
        int[] scores = {95, 82, 74, 45, 89};

        // Loop through the array to check and categorize each score
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            System.out.print("Score: " + score + " - ");

            // Check conditions using if-else statements
            if (score >= 90) {
                System.out.println("Excellent");
            } else if (score >= 75) {
                System.out.println("Good");
            } else if (score >= 50) {
                System.out.println("Average");
            } else {
                System.out.println("Fail");
            }
        }
    }
}
