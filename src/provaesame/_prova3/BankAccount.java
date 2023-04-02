package provaesame._prova3;


public class BankAccount {
    //Create a class called BankAccount with the following properties:
    private int accountNumber;
    private String accountHolder;
    private Double balance;

    public BankAccount(int newAccountnumber, String newAccountHolder, Double newBalance) {
    //Create a constructor that takes in the accountNumber, accountHolderName, balance
        accountNumber = newAccountnumber;
        accountHolder = newAccountHolder;
        balance = newBalance;
    }
    public String BankAccount() {
        return "Account Number: " + accountNumber + "Account Holder: " + accountHolder + "Balance: " + balance;
    }
    //Create a method called deposit that takes in a parameter amount (double) and adds it to the balance.
    public void deposit (double amount) {balance=+amount;}
    //Create a method called withdraw that takes in a parameter amount (double) and subtracts it from the balance.
    public void withdraw (double amount) {balance=-amount;}
    //Create a method called getBalance that returns the current balance.
    public double getBalance () {return balance;}
    //Create a method called toString that returns a string representation of the BankAccount object.
    public String toString() {
        return "Bank Account Details: Account Number: " + accountNumber + ", Account Holder Name: " + accountHolder + ", Balance: " + balance;
    }
}


