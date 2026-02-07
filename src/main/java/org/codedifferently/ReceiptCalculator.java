package org.codedifferently;

import java.util.Random;

public class ReceiptCalculator {
    Random random = new Random();

    public int generateVistId(){
        return random.nextInt(1000,10_000);
    }

    public double calculateBillSubtotal(){
        return 0.0;


    }
    //takes in the bill amount and returns the tax rate percentage
    public double calcTaxAmount(double billAmt){

        return billAmt * (random.nextDouble(0.0, 8.25)/100);
    }
}
