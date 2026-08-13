package stock;

public class CheckStock {

    public static void main(String[] args) {
        // Simple 5-item inventory array
        int[] items = {20, 15, 30, 0, 25}; 

        boolean missing = false;
        int total = 0;

        // Loop through each item
        for (int qty : items) {
            if (qty == 0) {
                System.out.println("Out of stock");
                missing = true;
                break; 
            }
            total = total + qty;
        }

        // Print results if no item is 0
        if (missing == false) {
            System.out.println("Total: " + total);

            if (total < 50) {
                System.out.println("Low Stock");
            } else if (total <= 100) {
                System.out.println("Moderate Stock");
            } else {
                System.out.println("Good Stock");
            }
        }
    }
}
