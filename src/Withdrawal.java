public class Withdrawal extends Transaction {

    public Withdrawal(double amount, Account account) {
        super(amount, new Account[]{account});
        account.withdraw(amount);
    }
    
    @Override
    public String toString() {
        String details = super.toString();
        details += ", Withdrawing Account: " + account[0].getAccountNumber();
        return details;
    }
}