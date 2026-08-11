import profile.UserInput;
import greeting.GreetingDisplay;

public class MainProfile {

    public static void main(String[] args) {

        // Get the user's name from UserInput
        String name = UserInput.getName();

        // Display the greeting using GreetingDisplay
        GreetingDisplay.displayGreeting(name);
    }
}