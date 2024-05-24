public class Account {
    private String password;
    private String accountNumber;
    private double balance;

    private final Bank bank;

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

    public boolean withdraw(double amount) {
        if (balance < amount) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public boolean deposit(double amount) {
        balance += amount;
        return true;
    }

    public boolean verifyPassword(String password) {
        return this.password.equals(password);
    }
}
