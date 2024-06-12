public class Transfer extends Transaction {
  public Transfer(double amount, Account fromAccount, Account toAccount) {
      super(amount, new Account[] { fromAccount, toAccount });
      toAccount.deposit(amount);
      fromAccount.withdraw(amount);
  }

  @Override
  public String toString() {
      String details = super.toString();
      details += ", From Account: " + account[0].getAccountNumber() + ", To Account: " + account[1].getAccountNumber();
      return details;
  }
}
