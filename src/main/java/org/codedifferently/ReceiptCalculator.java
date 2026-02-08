package org.codedifferently;

import java.util.Random;

public class ReceiptCalculator {

    Random random = new Random();
    double discount;

    public int generateItemPrice() {
        return random.nextInt(0, 101);
    }

    public double calcBillSubtotal(double firstItemPrice, double secondItemPrice, double thirdItemPrice) {
        return firstItemPrice + secondItemPrice + thirdItemPrice;
    }

    //takes in the bill amount and returns the tax rate percentage
    public double calcTaxAmount(double billAmt) {
        return Math.round(billAmt * (random.nextDouble(0.0, 8.25) / 100));
    }

    public boolean isValidCoupon(String couponCode) {
        switch (couponCode) {
            case "ABC123", "123ABC", "CODE_DIFFERENTLY":
                return true;
            default:
                return false;
        }
    }

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
