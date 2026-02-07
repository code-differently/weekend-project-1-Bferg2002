package org.codedifferently;
import java.util.Random;

public class Receipt {
    Random random = new Random();
    ReceiptCalculator calculator = new ReceiptCalculator();

    public int generateVistId(){
        return random.nextInt(1000,10_000);
    }



   // public string

    public void displayReceipt(String customerName, String customerBudget, String couponCode){
      //call item price methods from the calculator object.
    }

} //ends Receipt class
