import java.util.*;
import javax.swing.*;

public class App{
    public static void main(String[] args) {
        //arraylist of banks
        ArrayList<Bank> banks = new ArrayList<Bank>();
        //arraylist of users
        ArrayList<User> users = new ArrayList<User>();
        //ArrayList of accounts
        ArrayList<Account> accounts = new ArrayList<Account>();
        //create transactionLog
        TransactionLog transactionLog = new TransactionLog();

        //add banks
        banks.add(new Bank("Maybank", "www.Maybank.com.my", 123456));
        banks.add(new Bank("Public Bank", "www.PublicBank.com.my", 654321));
        banks.add(new Bank("CIMB", "www.CIMB.com.my", 987654));

        //add user
        users.add(new User("Ail", "ali@gmail.conm", "123456", "AliAli", "Jalan UTM,Skudai,Johor", "011-5887890"));
        users.add(new User("Loo", "loo@gmail.conm", "abcde", "LOOLOO", "Jalan UTHM,Batu Pahat,Johor", "010-7997890"));
        users.add(new User("Tan", "tan@gmail.conm", "123abc", "TanTan", "Jalan Abb,Skudai,Johor", "012-5896890"));

        //add accounts
        accounts.add(new Account(banks.get(0), 100.00, users.get(0)));
        accounts.add(new Account(banks.get(1), 200.00, users.get(0)));
        accounts.add(new Account(banks.get(2), 300.00, users.get(1)));
        accounts.add(new Account(banks.get(0), 400.00, users.get(2)));
       
        //add accounts to users
        users.get(0).addAccount(accounts.get(0));
        users.get(0).addAccount(accounts.get(1));
        users.get(1).addAccount(accounts.get(2));
        users.get(2).addAccount(accounts.get(3));

        boolean running = true;
        while(running){
            int choice = displayMenu();
            switch(choice){
                case 1:
                    //login
                    String username = JOptionPane.showInputDialog(null, "Enter username");
                    String password = JOptionPane.showInputDialog(null, "Enter password");
                    User user = null;
                    for(User u: users){
                        if(u.getUserName().equals(username)){
                            if(u.verifyPassword(password)){
                                user = u;
                                break;
                            }
                            break;
                        }
                    }
                    if(user != null){
                        boolean running1 = true;
                        while(running1){
                            int choice1 = displayMenu1();
                            switch(choice1){
                                case 1:
                                    //create account
                                    //display banks
                                    Bank userBank = null;
                                    while(true){
                                        String bankList = "";
                                        for(Bank b: banks){
                                            bankList += b.getName() + "\n";
                                        }
                                        String bankName = JOptionPane.showInputDialog(null, bankList + "Enter bank name");
                                        for(Bank b: banks){
                                            if(b.getName().equals(bankName)){
                                                userBank = b;
                                                break;
                                            }
                                        }
                                        if(userBank != null){
                                            break;
                                        }
                                        else {
                                            JOptionPane.showMessageDialog(null, "Invalid bank name");
                                        }
                                    }
                                    Account account = new Account(userBank, 0, user);
                                    accounts.add(account);
                                    user.addAccount(account);
                                    //display account info
                                    JOptionPane.showMessageDialog(null, account);
                                    break;
                                case 2:
                                    //deposit
                                    int accountNumber1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter account number"));
                                    double amount = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter amount"));
                                    for(Account a: accounts){
                                        if(a.getAccountNumber() == accountNumber1){
                                            a.deposit(amount);
                                            transactionLog.addTransaction(1, amount, a);
                                            break;
                                        }
                                    }
                                    break;
                                case 3:
                                    //withdraw
                                    int accountNumber2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter account number"));
                                    double amount1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter amount"));
                                    for(Account a: accounts){
                                        if(a.getAccountNumber() == accountNumber2){
                                            if(a.getBalance() < amount1){
                                                JOptionPane.showMessageDialog(null, "Insufficient funds");
                                                break;
                                            }
                                            else{
                                                a.withdraw(amount1);
                                                transactionLog.addTransaction(2, amount1, a);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 4:
                                    //transfer
                                    int accountNumber3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter account number (Tranfer from)"));
                                    int accountNumber4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter account number (Transfer to)"));
                                    double amount2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter amount"));
                                    Account account1 = null;
                                    Account account2 = null;
                                    for(Account a: accounts){
                                        if(a.getAccountNumber() == accountNumber3){
                                            account1 = a;
                                        }
                                        if(a.getAccountNumber() == accountNumber4){
                                            account2 = a;
                                            //display account info
                                            JOptionPane.showMessageDialog(null, account2);
                                        }
                                    }
                                    if(account1 != null && account2 != null){
                                        if(account1.getBalance() < amount2){
                                            JOptionPane.showMessageDialog(null, "Insufficient funds");
                                        }
                                        else{
                                            transactionLog.addTransaction(3, amount2, account1, account2);
                                        }
                                    }
                                    else if(account1 == null){
                                        JOptionPane.showMessageDialog(null, "Account number " + accountNumber3 + " not found");
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "Account number " + accountNumber4 + " not found");
                                    }
                                    break;
                                case 5:
                                    //show all accounts belonging to user
                                    String accountList = "";
                                    for(Account a: user.getAccounts()){
                                        accountList += a + "\n";
                                    }
                                    JOptionPane.showMessageDialog(null, accountList);
                                    break;
                                case 6:
                                    //show transaction log
                                    JOptionPane.showMessageDialog(null, transactionLog);
                                    running1 = false;
                                    break;
                            }
                        }
                    }
                    break;
                case 2:
                    //create user
                    String name = JOptionPane.showInputDialog(null, "Enter name");
                    String email = JOptionPane.showInputDialog(null, "Enter email");
                    String password1 = JOptionPane.showInputDialog(null, "Enter password");
                    String username1 = JOptionPane.showInputDialog(null, "Enter username");
                    String address = JOptionPane.showInputDialog(null, "Enter address");
                    String phone = JOptionPane.showInputDialog(null, "Enter phone");
                    User user1 = new User(name, email, password1, username1, address, phone);
                    users.add(user1);
                    break;
                case 3:
                    //deposit
                    int accountNumber6 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter account number"));
                    Account accounttemp = null;
                    for(Account a: accounts){
                        if(a.getAccountNumber() == accountNumber6){
                            accounttemp = a;
                            break;
                        }
                    }
                    JOptionPane.showMessageDialog(null, accounttemp);
                    double amount3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter amount"));
                    for(Account a: accounts){
                        if(a.getAccountNumber() == accountNumber6){
                            a.deposit(amount3);
                            transactionLog.addTransaction(1, amount3, a);
                            break;
                        }
                    }
                    break;
                case 4:
                    running = false;
                    break;
            }
        }    
    }

    public static int displayMenu(){
        String menu = "1. Login\n2. Create User\n3. Deposit\n4. Exit";
        while (true){
            String input = JOptionPane.showInputDialog(null, menu);
            if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4")){
                int choice = Integer.parseInt(input);
                return choice;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid choice");
            }
        }
    }

    public static int displayMenu1(){
        String menu = "1. Create Account\n2. Deposit\n3. Withdraw\n4. Transfer\n5. Show Accounts\n6. Exit";
        while(true){
            String input = JOptionPane.showInputDialog(null, menu);
            if(input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5") || input.equals("6")){
                int choice = Integer.parseInt(input);
                return choice;
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid choice");
            }
        }
    }

    public Account getAccount(ArrayList<Account> accounts){
        int accountNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter account number"));
        for(Account a: accounts){
            if(a.getAccountNumber() == accountNumber){
                return a;
            }
        }
        return null;
    }
}