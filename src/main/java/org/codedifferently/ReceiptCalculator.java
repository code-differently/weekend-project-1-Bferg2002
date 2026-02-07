package org.codedifferently;

import java.util.Random;

public class ReceiptCalculator {

    Random random = new Random();
   //final String COUPON_CODE = "Abc123";
    double discount;

    public int generateItemPrice(){
        return random.nextInt(0,101);
    }

    public double calcBillSubtotal(double firstItemPrice, double secondItemPrice, double thirdItemPrice){
        return firstItemPrice + secondItemPrice + thirdItemPrice;
    }

    //takes in the bill amount and returns the tax rate percentage
    public double calcTaxAmount(double billAmt){
        return billAmt * (random.nextDouble(0.0, 8.25)/100);
    }

    public boolean isValidCoupon(String couponCode){
        switch (couponCode){
            case "ABC123":
                discount = 10.00;
                return true;
            case "123ABC":
                discount = 20.00;
                return false;
            case "CODE_DIFFERENTLY":
                discount = 50.00;
            default:
                return false;
        }
    }

    public double calcFinalTotal(String couponCode, double firstItemPrice, double secondItemPrice, double thirdItemPrice ){
        double subTotal = calcBillSubtotal(firstItemPrice ,secondItemPrice, thirdItemPrice);
        double tax = calcTaxAmount(subTotal);
        double finalTotal;
        if (isValidCoupon(couponCode)){
             finalTotal = Math.round((subTotal + tax) - discount);
            if (finalTotal < 0){
                return 0;
            }
        }

        finalTotal = Math.round((subTotal + tax) - discount);
        return finalTotal;
        }

}   //ends ReceiptCalculator class
