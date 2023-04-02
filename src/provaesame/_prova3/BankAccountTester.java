package provaesame._prova3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankAccountTester {

    public static void main(String[] args) {
        //creates a BankAccount object with account number 123456, account holder name "John Smith", and balance 1000.00
        BankAccount account = new BankAccount(123456, "John Smith", 1000.00);
        //calls the deposit method on the BankAccount object to deposit 500.00
        account.deposit(500.000);
        //calls the withdraw method on the BankAccount object to withdraw 200.00
        account.withdraw(200.000);
        //calls getBalance method
        double balance = account.getBalance();
        System.out.println("Current balance: " + balance);
        String accountDetails = account.toString();
        System.out.println(accountDetails);
        //creates an array of BankAccount objects with 3 elements
        //initializes the first element of the array with account number 111111, account holder name "Jane Doe", and balance 500.00
        //initializes the second element of the array with account number 222222, account holder name "Bob Smith", and balance 1000.00
        //initializes the third element of the array with account number 333333, account holder name "Alice Johnson", and balance 1500.00
        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = new BankAccount(111111, "Jane Doe", 500.00);
        accounts[1] = new BankAccount(222222, "Bob Smith", 1000.00);
        accounts[2] = new BankAccount(333333, "Alice Johnson", 1500.00);

        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].toString());
        }
        //creates a list of BankAccount objects
        //adds a new BankAccount object to the list with account number 444444, account holder name "Tom Brown", and balance 2000.00
        //adds the array of BankAccount objects to the list
        //iterates through the list of BankAccount objects and prints the string representation of each object to the console.
        List<BankAccount> accountList = new ArrayList<>();
        accountList.add(new BankAccount(444444, "Tom Brown", 2000.00));
        accountList.addAll(Arrays.asList(accounts));

        for (BankAccount acc1 : accountList) {
            System.out.println(acc1.toString());
        }
    }

}

