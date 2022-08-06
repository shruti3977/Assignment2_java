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

class Account1
{
    private int id=0;
    double balance=500;
    double annualInterest=7,amount;
    String dateCreated;
    Account1()
    {
        id=0;
        balance=50000;
        annualInterest=7;
    }
    Account1(int i,double bal)
    {
        id=i;
        balance=bal;
    }
    void setdata(int i,double bal,double anInt,String date)
    {
        id=i;
        balance=bal;
        annualInterest=anInt;
        dateCreated=date;
    }
    int getId()
    {
        return id;
    }
    double getBalance()
    {
        return balance;
    }
    double getAnnualInterest()
    {
        return annualInterest;
    }
    double getMonthlyInterestRate()
    {
        return (annualInterest*100)/12;
    }
    double getMonthlyInterest()
    {
        return balance*(annualInterest*100)/12;
    }
    String getDateCreated()
    {
        return dateCreated;
    }
    void withdraw(double amount)
    {
        balance-=amount;
        if(balance>0)
            System.out.println("The balance left after withdrawal of Rs."+amount+" is Rs."+balance);
        else
            System.out.println("Withdrawal of Rs."+amount+" is not possible!!");
    }
    void deposit(double amount)
    {
        balance+=amount;
        System.out.println("The balance left after deposit of Rs."+amount+" is Rs."+balance);
    }
}

class SavingAccount extends Account1
{
    SavingAccount(double a)
    {
        amount=a;
        balance-=amount;
    }
    public String toString()
    {
        if(balance>=3000)
        {
            return "The balance left after withdrawal of Rs."+amount+" is Rs. "+balance;
        }
        else
        {
            return "Beyond1 Over Draft Limit Not Possible!!\nMinimum balance of Rs. 3000 is required.";
        }
    }
}

class CheckingAccount extends Account1
{
    CheckingAccount(double am)
    {
        amount = am;
        balance-=amount;
    }
    public String toString()
    {
        System.out.println("Withdrawal Successful!!");
        return "Now the balance left is Rs."+balance+" after the withdrawal of Rs."+amount;
    }
}
