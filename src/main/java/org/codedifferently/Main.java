package org.codedifferently;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name ");
        String customerName = input.nextLine();
        System.out.print("Enter your budget (numbers only) ");
        String customerBudget = input.nextLine();
        System.out.print("Enter a coupon code ");
        String couponCode= input.nextLine();
    }
}
