import java.time.LocalDateTime;

public class Transaction {
    protected double amount;
    private final String transactionId;
    private static int nextTransactionId = 0;
    protected final Account[] account;
    private LocalDateTime dateTime;

    public Transaction(double amount, Account[] account) {
        this.amount = amount;
        this.transactionId = "T" + nextTransactionId;
        this.dateTime = LocalDateTime.now();
        nextTransactionId++;
        this.account = account;
    }

    public String getTransactionDetails() {
        return "Transaction ID: " + transactionId + ", Amount: " + amount;
    }
}