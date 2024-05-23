public class Account {
    private String password;
    private String accountNumber;
    private int balance;

    private Bank bank;

    public Account(Bank bank, String password, String accountNumber, int balance) {
        this.bank = bank;
        this.password = password;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

}
