class Deposit extends Transaction {
    public Deposit(double amount, Account depositingAccount) {
      super(amount, new Account[] { depositingAccount });
      depositingAccount.deposit(amount);
    }
  
    @Override
    public String getTransactionDetails() {
      String details = super.getTransactionDetails();
      details += ", Depositing Account: " + account[0].getAccountNumber();
      return details;
    }
  }