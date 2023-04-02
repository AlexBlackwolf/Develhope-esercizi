package provaesame._prova3;


public class BankAccount {
    //Create a class called BankAccount with the following properties:
    private int accountNumber;
    private String accountHolder;
    private Double balance;

    private static int currentAccounts; //static method viewable outside of class

    public BankAccount(int accountNumber, String accountHolder, Double balance) { //sign of constructor//the entire thing inside the scope is the constructor
    //Create a constructor that takes in the accountNumber, accountHolderName, balance
        this.accountNumber = accountNumber; //metto il new o this perchè senza sovrascrivo la variabile invece di richiamarla/inizializare il campo
        this.accountHolder = accountHolder;
        this.balance = balance;
        currentAccounts= currentAccounts + 1; //increase amount of variable everytime a bankaccount is created //it is increased everytime the constructor is called
        //since being outside of class due to the method being static it doesnt reset like other values
        //staitc method can be called without having an instance of the class
    }
    public static int activeAccountNumber() {
        return currentAccounts;
    }
    public String bankAccount() {
        return "Account Number: " + accountNumber + "Account Holder: " + accountHolder + "Balance: " + balance;
    }
    //Create a method called deposit that takes in a parameter amount (double) and adds it to the balance.
    public void deposit (double amount) {balance=+amount;}
    //Create a method called withdraw that takes in a parameter amount (double) and subtracts it from the balance.
    public void withdraw (double amount) {balance=-amount;}
    //Create a method called getBalance that returns the current balance.
    public double getBalance () {return balance;}
    //Create a method called toString that returns a string representation of the BankAccount object.
    @Override //overriding the object method to string
    public String toString() {
        return "Bank Account Details: Account Number: " + accountNumber + ", Account Holder Name: " + accountHolder + ", Balance: " + balance;
    }
}


