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

    
}
