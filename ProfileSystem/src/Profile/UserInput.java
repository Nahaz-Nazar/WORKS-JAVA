package Profile;

import java.util.Scanner;

public class UserInput {

    // Get the user's name
    public static String getName() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        sc.close();
        return name;
    }
}
