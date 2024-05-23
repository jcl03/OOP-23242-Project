public class Account {
    private String password;
    private String accountNumber;
    private int balance;

    private final Bank bank;

    public Account(Bank bank){
        this.bank = bank;
    }

}
