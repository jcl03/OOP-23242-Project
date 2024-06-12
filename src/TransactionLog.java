//this class is use to store and track the transaction log of the system
//the transaction can be either deposit, wirthdraw or transfer
import java.util.ArrayList;

public class TransactionLog {
    private ArrayList<Transaction> transactions;

    public TransactionLog() {
        transactions = new ArrayList<>();
    }
    public void addTransaction(int type, double amount, Account account) {
        switch (type) {
            case 1:
                transactions.add(new Deposit(amount, account));
                break;
            case 2:
                transactions.add(new Withdrawal(amount, account));
                break;
        }

    }
    public void addTransaction(int type, double amount, Account account, Account account2) {
        switch (type) {
            case 1:
                transactions.add(new Deposit(amount, account));
                break;
            case 2:
                transactions.add(new Withdrawal(amount, account));
                break;
            case 3:
                transactions.add(new Transfer(amount, account, account2));
                break;
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Transaction transaction : transactions) {
            result += transaction + "\n";
        }
        return result;
    }
}