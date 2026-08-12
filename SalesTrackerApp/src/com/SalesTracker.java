package com;

public class SalesTracker {
    public static void main(String[] args) {
        
        int[][] salesData = {
            {120, 80, 50},  // Day 1
            {95, 90, 45},   // Day 2
            {110, 85, 60},  // Day 3
            {130, 75, 55},  // Day 4
            {105, 95, 40}   // Day 5
        };

        int numProducts = salesData[0].length;
        int numDays = salesData.length;

       
        int[] totalSales = new int[numProducts];

        
        for (int prod = 0; prod < numProducts; prod++) {
            
            for (int day = 0; day < numDays; day++) {
                totalSales[prod] += salesData[day][prod];
            }
        }

        
        System.out.println("=== WEEKLY SALES PERFORMANCE ===");
        for (int i = 0; i < numProducts; i++) {
            int total = totalSales[i];
            String performanceMessage;

            if (total >= 500) {
                performanceMessage = "Target Achieved";
            } else if (total >= 300) {
                performanceMessage = "Average Performance";
            } else {
                performanceMessage = "Needs Improvement";
            }

            System.out.println("Product " + (i + 1) + " - Total Sales: " + total + " | Status: " + performanceMessage);
        }
    }
}
