public class Transfer extends Transaction {
  public Transfer(double amount, Account fromAccount, Account toAccount) {
      super(amount, new Account[] { fromAccount, toAccount });
      toAccount.deposit(amount);
      fromAccount.withdraw(amount);
  }

  @Override
  public String getTransactionDetails() {
      String details = super.getTransactionDetails();
      details += ", From: " + account[0].getAccountNumber() + ", To: " + account[1].getAccountNumber();
      return details;
  }
}
