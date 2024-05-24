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
       
        users.get(0).addAccount(accounts.get(0));
        users.get(0).addAccount(accounts.get(1));
        

        //login
        String username = JOptionPane.showInputDialog("Enter username");
        String password = JOptionPane.showInputDialog("Enter password");


        //tranfer 1.00 from account 1 to account 2
        
        /*
                
        
        User currentUser = null;
        for (User user : users) {
            if (user.getUserName().equals(username) && user.verifyPassword(password)) {
                currentUser = user;
                break;
            }
        }
        """ */

    }
}