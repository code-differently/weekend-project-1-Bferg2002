package org.codedifferently;

import java.util.Random; //imports the Random class

public class ReceiptCalculator {

    Random random = new Random();   //Creates a Random object named "random"
    double discount;

    //Returns a random value ranging from 0 to 100
    public int generateItemPrice() {
        return random.nextInt(0, 101);
    }

    //Returns the raw total of the bill before tax and discounts are applied
    public double calcBillSubtotal(double firstItemPrice, double secondItemPrice, double thirdItemPrice) {
        return firstItemPrice + secondItemPrice + thirdItemPrice;
    }

    //Takes in the bill amount and returns the tax rate amount
    public double calcTaxAmount(double billAmt) {
        return Math.round(billAmt * (random.nextDouble(0.0, 8.25) / 100));
    }

    //Checks if the user enters a valid coupon code
    public boolean isValidCoupon(String couponCode) {
        switch (couponCode) {
            case "ABC123", "123ABC", "CODE_DIFFERENTLY":
                return true;
            default:
                return false;
        }
    }

    //Returns the discount that the user receives based on the coupon code they enter in
    public double getDiscountAmt(String couponCode) {
        switch (couponCode) {
            case "ABC123":
                return discount = 10.00;
            case "123ABC":
                return discount = 20.00;
            case "CODE_DIFFERENTLY":
                return discount = 50.00;
            default:
                return 0.0;
        }
    }

    //Returns the final bill amount including tax and any discounts applied
    public double calcFinalTotal(String couponCode, double firstItemPrice, double secondItemPrice, double thirdItemPrice, double budget, double tax) {
        double subTotal = calcBillSubtotal(firstItemPrice, secondItemPrice, thirdItemPrice);
        double finalTotal;

        if (isValidCoupon(couponCode)) {
            finalTotal = Math.round((subTotal + tax) - discount);
            if (finalTotal < 0) {
                return 0;
            }
        }

        finalTotal = Math.round((subTotal + tax) - discount);
        return finalTotal;
    }

}   //ends ReceiptCalculator class
