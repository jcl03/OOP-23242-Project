class Deposit extends Transaction {
  
    private final Account depositingAccount;
  
    public Deposit(double amount, Account depositingAccount) {
      super(amount);
      this.depositingAccount = depositingAccount;
    }
  
    @Override
    public String getTransactionDetails() {
      String details = super.getTransactionDetails();
      details += ", Depositing Account: " + depositingAccount.getAccountNumber();
      return details;
    }
  }