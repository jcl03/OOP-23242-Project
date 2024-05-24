public class Withdrawal extends Transaction {
    private final Account account;
    
    public Withdrawal(double amount, Account account) {
        super(amount);
        this.account = account;
    }

    public void process() {
        if (account.getBalance() < amount) {
            System.out.println("Insufficient funds");
            return;
        }
        account.withdraw(amount);
        System.out.println("Withdrawal successful");
    }
    
    @Override
    public String getTransactionDetails() {
        String details = super.getTransactionDetails();
        details += ", Withdrawing From: " + account.getAccountNumber();
        return details;
    }
}