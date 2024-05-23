public class Transaction {
    private String transactionId;
    private double amount;
    private String datetime;
    private String description;
    
    private final Account[] accounts = new Account[2];
    public Transaction(String transactionId, double amount, String datetime, String description, Account account) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.datetime = datetime;
        this.description = description;
        accounts[0] = account;
    }

    




}
