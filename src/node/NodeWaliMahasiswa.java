package node;

public class NodeWaliMahasiswa {
    String nama;
    String kewarganegaraan;
    String NoTelp;

    public NodeWaliMahasiswa( String nama, String kewarganegaraan,String NoTelp) {
        this.nama = nama;
        this.kewarganegaraan = kewarganegaraan;
        this.NoTelp = NoTelp;
    }

    public NodeWaliMahasiswa() {
    }

    public void view() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Kewarganegaraan : " + this.kewarganegaraan);
        System.out.println("Nomer Telepon :" + this.NoTelp);
    }

    public void setNoTelp(String telp) {
        this.NoTelp = telp;
    }
}
