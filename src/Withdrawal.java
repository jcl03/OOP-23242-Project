public class Withdrawal extends Transaction {
    private final Account account;
    
    public Withdrawal(double amount, Account account) {
        super(amount);
        this.account = account;
    }
    
    @Override
    public String getTransactionDetails() {
        String details = super.getTransactionDetails();
        details += ", Withdrawing From: " + account.getAccountNumber();
        return details;
    }
}