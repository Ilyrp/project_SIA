package node;

public class NodeDosen extends NodeWaliMahasiswa {
    int nip;
    boolean her;
    NodeWaliMahasiswa nodeDosen;

    public NodeDosen(int nip, String nama, String kewarganegaraan,String NoTelp) {
        super(nama, kewarganegaraan, NoTelp);
        this.nip = nip;
        // this.nama = nama;
        // this.kewarganegaraan = kewarganegaraan;
        // this.NoTelp = NoTelp;

        NodeWaliMahasiswa dosen = new NodeDosen(nip,nama,kewarganegaraan,NoTelp);
        this.nodeDosen = dosen ;
    }

    public void waliMahasiswa(String nama,String kewarganegaraan,String NoTelp){
    }

    public void viewDosen() {
        System.out.println("NPM  : " + this.nip);
        System.out.println("Nama : " + this.nama);
        System.out.println("Kewarganegaraan : " + this.kewarganegaraan);
        System.out.println("Nomer Telepon :"+this.NoTelp);
    }

    public String getNama_Dosen() {
        return nama;
    }

    public void setNoTelpDosen(String noTelp) {
        this.NoTelp = noTelp;
    }

// public void setNama_Mahasiswa(String nama_Mahasiswa) { 
//     this.nama = nama_fakultas;
}

