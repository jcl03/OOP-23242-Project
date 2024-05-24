public class TestRun{
    public static void main(String[] args) {
        Bank bank = new Bank("Bank A", "www.bankA.com", 123456);
        User user = new User("John Doe", "j@email.conm", "password",
                "johndoe", "123 Main St", "123-456-7890");
        Account account = new Account(bank, "password", "123456", 100.0);
        user.addAccount(account);
        

    }
}