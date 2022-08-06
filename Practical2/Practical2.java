package Practical2;
//This Program is Prepared by 21CE118 Shruti Sangani

/* Aim :: Design a class named Account that contains:
• A private int data field named id for the account (default 0).
• A private double data field named balance for the account (default 500₹).
• A private double data field named annualInterestRate that stores the current
interest rate (default 7%). Assume all accounts have the same interest rate.
• A private Date data field named dateCreated that stores the date when the
account was created.
• A no-arg constructor that creates a default account.
• A constructor that creates an account with the specified id and initial balance.
• The accessor and mutator methods for id, balance, and annualInterestRate.
• The accessor method for dateCreated.
• A method named getMonthlyInterestRate() that returns the monthly interest rate.
• A method named getMonthlyInterest() that returns the monthly interest.
• A method named withdraw that withdraws a specified amount from the account.
• A method named deposit that deposits a specified amount to the account.
 */

import java.util.Scanner;

public class Practical2 {
    public static void main(String[] args)
    {
        Account Check_object = new Account(139,7000);
        Account Save_object = new Account(177,3000);
        System.out.println("Before Withdrawing ....");
        System.out.println("");
        System.out.println("Account Details :: ");
        System.out.println(Check_object);
        System.out.println("Account Details of saving object:");
        System.out.println(Save_object);

        // passing the withdraw money
        Check_object.withdraw(15000);
        Save_object.withdraw(8000);

        System.out.println("\nAfter Withdrawing ....\n");
        System.out.println("\nAccount Details of checking object:");
        System.out.println(Check_object);
        System.out.println("\nAccount Details of saving object:");
        System.out.println(Save_object);
    }
}

