package node;

public class NodeAdmin {
    String Username;
    String Password;

    public  NodeAdmin( String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

    // public void viewMahasiswa() {
    //     System.out.println("NPM  : " + this.npm);
    //     System.out.println("Nama : " + this.namaMahasiswa);
    //     System.out.println("Kewarganegaraan : " + this.kewarganegaraan);
    //     System.out.println("Nomer Telepon :"+this.NoTelp);
    // }

    public String getUsername() {
        return Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}
