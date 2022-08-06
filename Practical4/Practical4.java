package Practical4;//This program is prepared by 21CE118 Shruti Sangani

/* Aim :: (Subclasses of Account) In Programming Exercise 2, the Account class was
defined to model a bank account. An account has the properties account number,
balance, annual interest rate, and date created, and methods to deposit and
withdraw funds. Create two subclasses for checking and saving accounts. A
checking account has an overdraft limit, but a savings account cannot be
overdrawn. Draw the UML diagram for the classes and then implement them.
Write a test program that creates objects of Account, SavingsAccount, and
CheckingAccount and invokes their toString() methods.
*/

import java.util.*;
public class Practical4
{
    public static void main(String[] args)
    {
        Account1 a1=new Account1();
        Account1 a2=new Account1(120000,100000);
        a2.setdata(12397712,100000, 5.6, "12-5-2020");
        System.out.println("Account Details ::\n");
        System.out.println("Balance ::"+a2.getBalance());
        System.out.println("Annual Interest is ::"+a2.getAnnualInterest());
        System.out.println("Monthly Interest Rate is ::"+a2.getMonthlyInterestRate());
        System.out.println("Monthly Interest is :: "+a2.getMonthlyInterest());
        System.out.println("Account was created on the date of "+a2.getDateCreated());
        a2.withdraw(15000);
        a2.deposit(17000);
        System.out.print("------------------------\n");
        SavingAccount a=new SavingAccount(1100);
        CheckingAccount b=new CheckingAccount(1200);
        System.out.println("For Saving Account:\n");
        System.out.println(a);
        System.out.print("------------------------\n");
        System.out.println("For Checking Account:\n");
        System.out.println(b);
    }
}
