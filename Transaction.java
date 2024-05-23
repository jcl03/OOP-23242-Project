public class Transaction {

    protected double amount;
    protected long timestamp;
    protected Account fromAccount; // Can be null for deposits
    protected Account toAccount;   // Can be null for withdrawals
  
    public Transaction(double amount) {
      this.amount = amount;
      this.timestamp = System.currentTimeMillis();
    }
  
    public String getTransactionDetails() {
      StringBuilder details = new StringBuilder();
      details.append("Amount: $" + amount);
      details.append(", Timestamp: " + new java.util.Date(timestamp));
      if (fromAccount != null) {
        details.append(", From: " + fromAccount.getAccountNumber());
      }
      if (toAccount != null) {
        details.append(", To: " + toAccount.getAccountNumber());
      }
      return details.toString();
    }
  }
  

  
  class Withdrawal extends Transaction {
  
    public Withdrawal(double amount, Account fromAccount) throws InsufficientFundsException {
      super(amount);
      this.fromAccount = fromAccount;
      // Validate sufficient balance before completing transaction
      if (fromAccount.getBalance() < amount) {
        throw new InsufficientFundsException("Insufficient balance for withdrawal");
      }
    }
  
    @Override
    public String getTransactionDetails() {
      String details = super.getTransactionDetails();
      details += ", Withdrawing From: " + fromAccount.getAccountNumber();
      return details;
    }
  }
  
  class Transfer extends Transaction {
  
    public Transfer(double amount, Account fromAccount, Account toAccount) throws InsufficientFundsException {
      super(amount);
      this.fromAccount = fromAccount;
      this.toAccount = toAccount;
      // Validate sufficient balance before completing transaction
      if (fromAccount.getBalance() < amount) {
        throw new InsufficientFundsException("Insufficient balance for transfer");
      }
    }
  
    @Override
    public String getTransactionDetails() {
      String details = super.getTransactionDetails();
      details += ", Transferring From: " + fromAccount.getAccountNumber();
      details += ", Transferring To: " + toAccount.getAccountNumber();
      return details;
    }
  }
  class InsufficientFundsException extends Exception {
  
    public InsufficientFundsException(String message) {
      super(message);
    }
  }

  