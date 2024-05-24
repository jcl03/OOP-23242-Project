//this class is use to store and track the transaction log of the system
//the transaction can be either deposit, wirthdraw or transfer
import java.util.ArrayList;

public class TransactionLog {
    private ArrayList<Transaction> transactions;

    public TransactionLog() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void printAllTransactions() {
        for (Transaction transaction : transactions) {
            System.out.println(transaction.getTransactionDetails());
        }
    }
}