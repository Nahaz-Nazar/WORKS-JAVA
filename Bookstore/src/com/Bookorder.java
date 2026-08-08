package com;

public class Bookorder {

    public static void main(String[] args) {

        int quantity = 3;
        int pricePerBook = 275;
        int discount = 10;

        double totalAmount = (double) (quantity * pricePerBook);
        double discountPercentage = (double) discount;

        double discountAmount = totalAmount * (discountPercentage / 100);
        double finalBill = totalAmount - discountAmount;

        System.out.println("===== BOOK ORDER DETAILS =====");
        System.out.println("Number of Books      : " + quantity);
        System.out.println("Price per Book       : " + pricePerBook);
        System.out.println("Total Amount         : " + totalAmount);
        System.out.println("Discount Percentage  : " + discountPercentage + "%");
        System.out.println("Discount Amount      : " + discountAmount);
        System.out.println("Final Bill Amount    : " + finalBill);
    }
}