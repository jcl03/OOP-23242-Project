import javax.swing.*;
import java.util.*;

public class TestRun{
    public static void main(String[] args) {
        //arraylist of banks
        ArrayList<Bank> banks = new ArrayList<Bank>();
        //arraylist of users
        ArrayList<User> users = new ArrayList<User>();
        //ArrayList of accounts
        ArrayList<Account> accounts = new ArrayList<Account>();

        //create transactionLog

        TransactionLog transactionLog = new TransactionLog();

        //add bank
        banks.add(new Bank("Bank A", "www.bankA.com", 123456));
        banks.add(new Bank("Bank B", "www.bankB.com", 654321));

        //add user
        users.add(new User("John Doe", "j@email.conm", "password",
                "johndoe", "123 Main St", "123-456-7890"));

        accounts.add(new Account(banks.get(0), "123456", "1234567890", 100.00, 1234));
        accounts.add(new Account(banks.get(1), "654321", "0987654321", 200.00, 4321));
       
        users.get(0).addAccount(accounts.get(0));
        users.get(0).addAccount(accounts.get(1));
        

        //login by user
        /*
        String username = JOptionPane.showInputDialog("Enter username");
        String password = JOptionPane.showInputDialog("Enter password");

        User currentUser = null;
        for (User user : users) {
            if (user.getUserName().equals(username) && user.verifyPassword(password)) {
                currentUser = user;
                break;
            }
        }
        */

        //login acc
        /*
        String accountNumber = JOptionPane.showInputDialog("Enter account number");
        String password = JOptionPane.showInputDialog("Enter password");
        Account account = null;
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber) && acc.verifyPassword(password)) {
                account = acc;
                break;
            }
        }
        if (account == null) {
            System.out.println("Invalid account number or password");
            return;
        }
        */

        //withdraw




        //withdraw
        double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount to withdraw"));
        Withdrawal withdrawal = new Withdrawal(amount, accounts.get(0));
        withdrawal.process();

        


    }
}