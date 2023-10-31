package node;

public class NodeAdmin {
    String Username;
    String Password;

    public  NodeAdmin( String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

    public void viewAdmin() {
        System.out.println("Username :"+this.Username);
        System.out.println("Password :"+this.Password);
    }
    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}
