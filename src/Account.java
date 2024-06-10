public class Account {
    private String password;
    private String accountNumber;
    private double balance;
    private User user;
    private final Bank bank;

    public Account(Bank bank, String password, String accountNumber, double balance, int pin, User user) {
        this.bank = bank;
        this.password = password;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.user = user;
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
    
    @Override
    public String toString() {
        return "Account{" +
                "password='" + password + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", user=" + user +
                ", bank=" + bank +
                '}';
    }
}