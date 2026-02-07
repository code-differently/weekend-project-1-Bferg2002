package org.codedifferently;
import java.util.Random;

public class Receipt {
    Random random = new Random();

    public int generateVistId(){
        return random.nextInt(1000,10_000);
    }

    public int generateItemPrice(){
        return random.nextInt(0,101);
    }

   // public string

    public void displayReceipt(double subTotal, double tax, double discounts, double total, double budget){
        double firstItemprice = generateItemPrice();
        double secondItemprice = generateItemPrice();
        double thirdItemprice = generateItemPrice();
    }

} //ends Receipt class
