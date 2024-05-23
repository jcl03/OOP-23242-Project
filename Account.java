public class Account {
    private String password;
    private String accountNumber;
    private double balance;

    private Bank bank;

    public Account(Bank bank, String password, String accountNumber, double balance) {
        this.bank = bank;
        this.password = password;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    
}
