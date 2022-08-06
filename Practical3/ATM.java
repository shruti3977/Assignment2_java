package Practical3;
//This Program is prepared by 21CE118 Shruti Sangani

/* Aim :: Use the Account class created as above to simulate an ATM machine.
Create 10 accounts with id AC001…..AC010 with initial balance 300₹. The
system prompts the users to enter an id. If the id is entered incorrectly, ask
the user to enter a correct id. Once an id is accepted, display menu with
multiple choices.
1. Balance inquiry
2. Withdraw money [Maintain minimum balance 300₹]
3. Deposit money
4. Money Transfer
5. Create Account
6. Deactivate Account
7. Exit
Hint: Use ArrayList, which is can shrink and expand with compared to Array.
*/

public class ATM {
    private static int cnt;
    private final String id;
    private double balance;

    //constructor to initialize id and balance
    public ATM() {
        cnt++;
        if (cnt<10)
        {
            id="AC00"+(cnt);
        }
        else
        {
            id="AC0"+(cnt);
        }
        balance=300;
    }
    public void setBalance(double balance) //getters and setters for balance and ID.
    {
        this.balance = balance;
    }
    public String getId()
    {
        return id;
    }
    public double getBalance()
    {
        return balance;
    }
    //Withdraw method
    public void withdraw(double money)
    {
        if (balance-money>=300)
        {
            balance -= money;
            System.out.println(money + " Rs. successfully withdrawn.");
            System.out.println("Remaining Balance is : " + balance);
        }
        else
        {
            System.out.println("Insufficient balance to withdraw the Amount.");
        }
    }

    //deposit method
    public void deposit(double amount)
    {
        balance += amount;
        System.out.println(amount + "Rs. deposited to your account.");
        System.out.println("Account's Current Balance is : " + balance);
    }
    //method to transfer money.
    public void MoneyTransfer(ATM obj, double amount)
    {
        if (balance-amount>=300)
        {
            balance -= amount;
            obj.balance += amount;
            System.out.println(amount + " Rs successfully Transferred.");
            System.out.println("Remaining Balance is : " + balance);
        }
        else
        {
            System.out.println("Insufficient balance to transfer the amount.");
        }
    }
}
