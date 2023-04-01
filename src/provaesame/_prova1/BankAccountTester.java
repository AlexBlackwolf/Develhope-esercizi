package provaesame._prova1;

public class BankAccountTester {
    public static void main(String[] args){
        BankAccount account = new BankAccount(123456, "John Smith", 1000.00);
        account.deposit(500.00);
        account.withdraw(200.000);
        double balance = account.getBalance();
        System.out.println("Current balance: " + balance);
        String accountDetails = account.toString();
        System.out.println(accountDetails);
    }
}
