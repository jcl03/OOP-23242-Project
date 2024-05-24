public class Bank {
    private String name;
    private String website;
    private int hotline;

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
}