package question19;

public class User {
    private String username;
    private String address;
    private String mobile;
    private String email;

    public User(String username, String address,
                String mobile, String email) {
        this.username = username;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }
}
