package shopdata;

import java.util.Scanner;
import java.time.LocalDateTime;

public class BillCalculator {

    // Method to calculate total and apply discount
    public static double calculateTotal(int[] prices, int[] quantities) {

        double total = 0;

        for (int i = 0; i < prices.length; i++) {
            total = total + (prices[i] * quantities[i]);
        }

        // Apply 10% discount if total is more than Rs.500
        if (total > 500) {
            total = total - (total * 0.10);
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Items and prices
        String[] items = {"Rice", "Sugar", "Oil", "Soap", "Milk"};
        int[] prices = {50, 40, 100, 25, 30};

        int[] quantities = new int[5];

        try {

            // Display available items
            System.out.println("----- Available Items -----");

            for (int i = 0; i < items.length; i++) {
                System.out.println(
                    (i + 1) + ". " + items[i] + " - Rs." + prices[i] + " per unit"
                );
            }

            System.out.println();

            // Ask quantity for each item
            for (int i = 0; i < items.length; i++) {

                System.out.print("Enter quantity of " + items[i] + ": ");
                quantities[i] = sc.nextInt();

                if (quantities[i] < 0) {
                    System.out.println("Quantity cannot be negative.");
                    return;
                }
            }

            // Calculate final amount
            double finalAmount = calculateTotal(prices, quantities);

            // Calculate original total for displaying discount
            double originalTotal = 0;

            for (int i = 0; i < prices.length; i++) {
                originalTotal = originalTotal + (prices[i] * quantities[i]);
            }

            // Display bill
            System.out.println("\n----- Grocery Bill -----");

            for (int i = 0; i < items.length; i++) {
                double itemTotal = prices[i] * quantities[i];

                System.out.println(
                    items[i] + " : " + quantities[i] +
                    " x Rs." + prices[i] +
                    " = Rs." + itemTotal
                );
            }

            System.out.println("------------------------");
            System.out.println("Original Total: Rs." + originalTotal);

            if (originalTotal > 500) {
                System.out.println("Discount: 10%");
            } else {
                System.out.println("Discount: 0%");
            }

            System.out.println("Final Amount: Rs." + finalAmount);

            // Display date and time
            System.out.println("Purchase Date & Time: " + LocalDateTime.now());

        } catch (Exception e) {

            System.out.println("Invalid input! Please enter numbers only.");

        } finally {

            sc.close();
        }
    }
}