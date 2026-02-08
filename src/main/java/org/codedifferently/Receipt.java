package org.codedifferently;
import java.util.Random;

public class Receipt {
    Random random = new Random();
    ReceiptCalculator calculator = new ReceiptCalculator();

    public int generateVistId(){
        return random.nextInt(1000,10_000);
    }

    public String generateReceiptCode(String customerName) {
        customerName = customerName.trim().toLowerCase();
        int index = customerName.indexOf(" ");
        String firstName;
        String lastName;

        if (index == -1) {
            firstName = customerName;
            lastName = "";
        } else {
            firstName = customerName.substring(0, index);
            lastName = customerName.substring(index + 1);
        }

        if (firstName.length() > 3) {
            firstName = firstName.substring(0, 3);
        }

        if (lastName.length() > 3) {
            lastName = lastName.substring(0, 3);
        }

        return firstName + lastName + random.nextInt(1000, 10_000);
    }

    public void generateReceiptTagline() {
        int value = random.nextInt(1, 7);
        if (value % 2 == 0) {
            System.out.println("Have a WONDERFUL day!");
        } else {
            System.out.println("Have a FANTASTIC day!");
        }
    }

    public void generateWelcomeMessage(){
        int value = random.nextInt(1, 7);
        if (value % 2 != 0) {
            System.out.println("Welcome to Walmart");
        } else {
            System.out.println("Welcome to Target");
        }
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

        generateWelcomeMessage();
        System.out.println("Visit ID: " + generateVistId());
        System.out.println("Receipt Code " + generateReceiptCode(customerName));
        System.out.println("Your Item prices are: " + item1 + ", " + item2 + ", " + item3);
        System.out.println("Subtotal: " + subTotal);
        System.out.println("Tax: " + tax);
        System.out.println("You have a $" + discount + " discount off your bill");
        System.out.println("Your final total is " + finalTotal);

        if (customerBudget >= finalTotal){
            System.out.println("You have $" + (customerBudget - finalTotal) + " left in your budget" );
        }
        else{
            System.out.println("You are $" + (finalTotal - customerBudget) + " dollars short");
        }

        generateReceiptTagline();
    }

} //ends Receipt class
