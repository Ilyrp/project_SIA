package node;
import node.NodeWaliMahasiswa;
import node.NodeJurusan;

public class NodeMahasiswa extends NodeWaliMahasiswa {
    String npm;
    NodeWaliMahasiswa waliMahasiswa;
    NodeJurusan jurusan;

    public NodeMahasiswa(String nama, String kewarganegaraan,String NoTelp,boolean her) {
        super(nama, kewarganegaraan, NoTelp);
        // this.nama = nama;
        // this.kewarganegaraan = kewarganegaraan;
        // this.NoTelp = NoTelp;
        // NodeWaliMahasiswa wm = new NodeWaliMahasiswa(nama,kewarganegaraan,NoTelp);
        // this.waliMahasiswa = wm;
    }

    public void setNpm(String npm){
        this.npm = npm;
    }

    public void waliMahasiswa(String nama,String kewarganegaraan,String NoTelp){
        
    }

    public void setJurusan(NodeJurusan jurusan){
        this.jurusan = jurusan;
    }

    public void viewMahasiswa() {
        System.out.println("NPM  : " + this.npm);
        System.out.println("Nama : " + this.nama);
        System.out.println("Kewarganegaraan : " + this.kewarganegaraan);
        System.out.println("Nomer Telepon :"+this.NoTelp);
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

