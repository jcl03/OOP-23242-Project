class Transfer extends Transaction {
  
    private Account fromAccount;
    private Account toAccount;
  
    public Transfer(double amount, Account fromAccount, Account toAccount) {
      super(amount);
      this.fromAccount = fromAccount;
      this.toAccount = toAccount;
    }
  
    @Override
    public String getTransactionDetails() {
      String details = super.getTransactionDetails();
      details += ", Transferring From: " + fromAccount.getAccountNumber();
      details += ", Transferring To: " + toAccount.getAccountNumber();
      return details;
    }
  }
  