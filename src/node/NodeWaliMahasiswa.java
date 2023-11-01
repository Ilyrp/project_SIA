package node;

public class NodeWaliMahasiswa {
    String nama;
    String alamat;
    String NoTelp;

    public NodeWaliMahasiswa( String nama, String alamat,String NoTelp) {
        this.nama = nama;
        this.alamat = alamat;
        this.NoTelp = NoTelp;
    }

    public NodeWaliMahasiswa() {
    }

    public void viewWali() {
        System.out.println("Nama Wali : " + this.nama);
        System.out.println("Alamat Wali : " + this.alamat);
        System.out.println("Nomer Telepon Wali :" + this.NoTelp);
    }

    public void setNoTelp(String telp) {
        this.NoTelp = telp;
    }
}
