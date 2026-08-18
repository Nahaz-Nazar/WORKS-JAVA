package ride;

import java.util.Scanner;


public class BookingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter ride type (auto/car): ");
        String chosenType = scanner.next().trim().toLowerCase();

        
        System.out.print("Enter distance in kilometers: ");
        int distance = scanner.nextInt();

        
        if (distance <= 0) {
            System.out.println("Invalid distance! Please enter a positive integer.");
            scanner.close();
            return;
        }

        Ride selectedRide = null;

        
        if (chosenType.equals("auto")) {
            selectedRide = new AutoRide();
        } else if (chosenType.equals("car")) {
            selectedRide = new CarRide();
        } else {
            System.out.println("Invalid ride type selected!");
            scanner.close();
            return;
        }

        
        System.out.println("\n--- Ride Details ---");
        selectedRide.rideType();
        int totalFare = selectedRide.calculateFare(distance);
        System.out.println("Total Fare: ₹" + totalFare);

        scanner.close();
    }
}
