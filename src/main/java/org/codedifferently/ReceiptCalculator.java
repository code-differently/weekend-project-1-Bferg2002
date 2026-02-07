package org.codedifferently;

import java.util.Random;

public class ReceiptCalculator {
    Random random = new Random();


    public int generateItemPrice(){
        return random.nextInt(0,101);
    }
    //takes in the bill amount and returns the tax rate percentage
    public double calcTaxAmount(double billAmt){

        return billAmt * (random.nextDouble(0.0, 8.25)/100);
    }


    public double calculateBillSubtotal(){
        return 0.0;

    }
}
