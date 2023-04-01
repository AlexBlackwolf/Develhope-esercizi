package provaesame._prova1;

//Create a class called BankAccount with the following properties:
public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private Double balance;

    //Create a constructor that takes in the accountNumber, accountHolderName, and balance, and sets the corresponding properties.
    public BankAccount(int newAccountnumber, String newAccountHolder, Double newBalance) {


        accountNumber = newAccountnumber;
        accountHolder = newAccountHolder;
        balance = newBalance;
    }

    public String BankAccount() {
        return "Account Number: " + accountNumber + "Account Holder: " + accountHolder + "Balance: " + balance;
    }

    //Create a method called deposit
    public void deposit(double amount) {
        balance += amount;
    }
    //Create a method called withdraw
    public void withdraw(double amount) {
        balance -= amount;
    }
    //Create a method called getBalance
    public double getBalance() {
        return balance;
    }
    public String toString() {
        return "Bank Account Details: Account Number: " + accountNumber + ", Account Holder Name: " + accountHolder + ", Balance: " + balance;
    }
}

