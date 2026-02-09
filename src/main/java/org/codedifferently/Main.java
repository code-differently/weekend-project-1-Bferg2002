package org.codedifferently;

import java.util.*; //Imports a variety of classes
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Scanner object named "input"

        //This chunk of code prompts the user to enter their information
        System.out.print("Enter your name ");
        String customerName = input.nextLine();
        System.out.print("Enter your budget (numbers only) ");
        String customerBudget = input.nextLine();
        System.out.print("Enter a coupon code ");
        String couponCode = input.nextLine().toUpperCase();
        System.out.println();

        Receipt customerReceipt = new Receipt();    //Creates a new receipt object used to call the receipt methods
        customerReceipt.displayReceipt(customerName,Double.parseDouble(customerBudget),couponCode);     //calls the displayReceipt method to display all the receipt information
        input.close();
    }

}
