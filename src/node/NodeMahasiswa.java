package node;
import node.NodeWaliMahasiswa;
public class NodeMahasiswa extends NodeWaliMahasiswa {
    String npm;
    // String nama;
    // String kewarganegaraan;
    // String NoTelp;
    boolean her;
    NodeWaliMahasiswa waliMahasiswa;

    public NodeMahasiswa(String npm, String nama, String kewarganegaraan,String NoTelp,boolean her) {
        super(nama, kewarganegaraan, NoTelp);
        this.npm = npm;
        // this.nama = nama;
        // this.kewarganegaraan = kewarganegaraan;
        // this.NoTelp = NoTelp;
        this.her = her;
        NodeWaliMahasiswa wm = new NodeWaliMahasiswa(nama,kewarganegaraan,NoTelp);
        this.waliMahasiswa = wm;
    }

    public void waliMahasiswa(String nama,String kewarganegaraan,String NoTelp){
    }

    public void viewMahasiswa() {
        System.out.println("NPM  : " + this.npm);
        System.out.println("Nama : " + this.nama);
        System.out.println("Kewarganegaraan : " + this.kewarganegaraan);
        System.out.println("Nomer Telepon :"+this.NoTelp);
        System.out.println("Her :"+this.her);
    }

    public String getNama_Mahasiswa() {
        return nama;
    }

    public void setNoTelpMahasiswa(String noTelp) {
        this.NoTelp = noTelp;
    }

// public void setNama_Mahasiswa(String nama_Mahasiswa) { 
//     this.nama = nama_fakultas;
}


