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

import java.util.Date;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    //Default Constructor.
    public Account() {
        id=0;
        balance=500;
        annualInterestRate=7;
        dateCreated=new Date();
    }
    //Parameterized constructor.
    public Account(int id, double blnc) {
        this.id=id;
        this.balance=blnc;
        dateCreated=new Date();
    }

    // Accessor and mutator (getter - setter method)
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public double getblnc()
    {
        return balance;
    }
    public void setblnc(double blnc)
    {
        this.balance = blnc;
    }
    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated()
    {
        return dateCreated;
    }
    //Method to return Interest rate and interest.
    public double getMonthlyInterestRate()
    {
        return annualInterestRate / 12;
    }
    public double getMonthlyInterest()
    {
        return balance * annualInterestRate / 1200;
    }
    //method to withdraw amount from account.
    public void withdraw(double amt)
    {
        balance-= amt;
        System.out.println(amt + " Rs. Withdrawn successfully.");
    }
    //method to deposit the amount.
    public void deposit(double amt)
    {
        balance += amt;
        System.out.println(amt + " Rs. Deposited successfully.");
    }
    public String toString()
    {
        return "Account Details :\n" +
                "Id = " + id +"\n"+
                "Balance = " + balance + "\n"+
                "Annual Interest Rate = " + annualInterestRate +"\n"+
                "Date of creation = " + dateCreated;
    }
}