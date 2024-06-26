import java.util.ArrayList;

public class User{
    private String name;
    private String email;
    private String password;
    private String username;
    private String address;
    private String phone;
    
    private ArrayList<Account> accounts;    

    public User(String name, String email, String password, String username, String address, String phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.username = username;
        this.address = address;
        this.phone = phone;
        this.accounts = new ArrayList<Account>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }
    
    //get username
    public String getUserName(){
        return username;
    }

    //verify password
    public boolean verifyPassword(String password){
        return this.password.equals(password);
    }

    //get account
    public Account getAccount(int accountNumber){
        for(Account account : accounts){
            if(account.getAccountNumber() == accountNumber){
                return account;
            }
        }
        return null;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString(){
        return name + " " + email + " " + username + " " + address + " " + phone;
    }
}
