public class Withdrawal extends Transaction {

    public Withdrawal(double amount, Account account) {
        super(amount, new Account[]{account});
        account.withdraw(amount);
    }
    
    @Override
    public String getTransactionDetails() {
        String details = super.getTransactionDetails();
        details += ", Withdrawing From: " + account[0].getAccountNumber();
        return details;
    }
}