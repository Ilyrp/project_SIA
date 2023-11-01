package node;

public class NodeDosen extends NodeWaliMahasiswa {
    int nip;
    NodeWaliMahasiswa nodeDosen;

    public NodeDosen(int nip, String nama, String alamat,String NoTelp) {
        super(nama, alamat, NoTelp);
        this.nip = nip;
        // this.nama = nama;
        // this.alamat = alamat;
        // this.NoTelp = NoTelp;

        NodeWaliMahasiswa dosen = new NodeDosen(nip,nama,alamat,NoTelp);
        this.nodeDosen = dosen ;
    }

    public void waliMahasiswa(String nama,String alamat,String NoTelp){
    }

    public void viewDosen() {
        System.out.println("NIM  : " + this.nip);
        System.out.println("Nama : " + this.nama);
        System.out.println("Alamat : " + this.alamat);
        System.out.println("Nomer Telepon :"+this.NoTelp);
    }

    public String getNama_Dosen() {
        return nama;
    }


    public void setNoTelpDosen(String noTelp) {
        this.NoTelp = noTelp;
    }

    public int getNip_Dosen(){
        return nip;
    }
// public void setNama_Mahasiswa(String nama_Mahasiswa) { 
//     this.nama = nama_fakultas;
}

