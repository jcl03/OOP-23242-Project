import java.util.ArrayList;

public class Bank {
    private String name;
    private String website;
    private int hotline;
    private ArrayList<Account> accounts;


    public Bank(String name, String website, int hotline) {
        this.name = name;
        this.website = website;
        this.hotline = hotline;
    }

    //getter
    public String getName() {
        return name;
    }
    
    public String getWebsite() {
        return website;
    }

    public int getHotline() {
        return hotline;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }
}