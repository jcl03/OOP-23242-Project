public class Transaction {
    private double amount;
    private String transactionId;
    private static int nextTransactionId = 0;

    public Transaction(double amount) {
        this.amount = amount;
        this.transactionId = "T" + nextTransactionId;
        nextTransactionId++;
    }

    public String getTransactionDetails() {
        return "Transaction ID: " + transactionId + ", Amount: " + amount;
    }
}