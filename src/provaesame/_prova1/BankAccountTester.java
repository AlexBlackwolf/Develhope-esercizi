package provaesame._prova1;

public class BankAccountTester {
    public static void main(String[] args){
        //reates a BankAccount object with account number 123456,
        BankAccount account = new BankAccount(123456, "John Smith", 1000.00);
        //calls the deposit method on the BankAccount object to deposit 500.00
        account.deposit(500.00);
        //calls the withdraw method on the BankAccount object to withdraw 200.00
        account.withdraw(200.000);
        //calls the getBalance method on the BankAccount object to get the current balance and print it to the console
        double balance = account.getBalance();
        System.out.println("Current balance: " + balance);
        //calls the toString method on the BankAccount object and print the string representation to the console
        String accountDetails = account.toString();
        System.out.println(accountDetails);
    }
}
