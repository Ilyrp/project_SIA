package node;

public class NodeWaliMahasiswa {
    String namaWali;
    String kewarganegaraan;
    String NoTelp;

    public NodeWaliMahasiswa ( String namaWali, String kewarganegaraan,String NoTelp) {
        this.namaWali = namaWali;
        this.kewarganegaraan = kewarganegaraan;
        this.NoTelp = NoTelp;
    }

    public void viewMahasiswa() {
        System.out.println("Nama : " + this.namaWali);
        System.out.println("Kewarganegaraan : " + this.kewarganegaraan);
        System.out.println("Nomer Telepon :" + this.NoTelp);
    }

    public void setNoTelp(String telp) {
        this.NoTelp = telp;
    }
}
