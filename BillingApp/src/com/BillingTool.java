package com;

public class BillingTool {

    public static void main(String[] args) {

        String itemName = "Soap";
        int quantity = 4;
        double unitPrice = 18.75;

        double totalCost = quantity * unitPrice;

        System.out.println("===== BILL DETAILS =====");
        System.out.println("Item Name    : " + itemName);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Unit Price   : " + unitPrice);
        System.out.println("Total Cost   : " + totalCost);
    }
}