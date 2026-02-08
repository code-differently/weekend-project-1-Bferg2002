package org.codedifferently;
import java.util.Random;

public class Receipt {
    Random random = new Random();
    ReceiptCalculator calculator = new ReceiptCalculator();

    public int generateVistId(){
        return random.nextInt(1000,10_000);
    }

   public String generateReceiptCode(String customerName ){
       int index = customerName.indexOf(" ");
       if (index == -1) {
           return customerName.toLowerCase() + Integer.toString(random.nextInt(1000,9999));
       }

       String firstName = customerName.substring(0, 3);
       String lastName = customerName.substring(index + 1, index + 4);
       return (firstName + lastName).toLowerCase() + Integer.toString(random.nextInt(1000,9999));
    }

    public void displayReceipt(String customerName, double customerBudget, String couponCode){
      //call item price methods from the calculator object.
        double item1 = calculator.generateItemPrice();
        double item2 = calculator.generateItemPrice();
        double item3 = calculator.generateItemPrice();
        double subTotal = calculator.calcBillSubtotal(item1, item2, item3);
        double tax = calculator.calcTaxAmount(subTotal);
        double discount = calculator.getDiscountAmt(couponCode);
        double finalTotal = calculator.calcFinalTotal(couponCode, item1, item2, item3, customerBudget, tax);

        System.out.println("Store name: Walmart");
        System.out.println("Visit ID: " + generateVistId());
        System.out.println("Receipt Code " + generateReceiptCode(customerName));
        System.out.println("Your Item prices are: " + item1 + ", " + item2 + ", " + item3);
        System.out.println("Subtotal: " + subTotal);
        System.out.println("Tax: " + tax);
        System.out.println("You have a " + discount + " dollar discount off your bill");
        System.out.println("Your final total is " + finalTotal);

        if (customerBudget >= finalTotal){
            System.out.println("You have $" + (customerBudget - finalTotal) + " left in your budget" );
        }
        else{
            System.out.println("You are $" + (finalTotal - customerBudget) + " dollars short");
        }

    }

} //ends Receipt class
