package node;

public class NodeDosen extends NodeWaliMahasiswa {
    int nip;
    NodeJurusan jurusan;

    public NodeDosen(int nip, String nama, String alamat,String NoTelp, NodeJurusan jurusan) {
        super(nama, alamat, NoTelp);
        this.nip = nip;
        this.jurusan = jurusan;
    }

    public void viewDosen() {
        System.out.println("NIM  : " + this.nip);
        System.out.println("Nama : " + this.nama);
        System.out.println("Alamat : " + this.alamat);
        System.out.println("Nomer Telepon :"+this.NoTelp);
        System.out.println("Jurusan : " + this.jurusan.nama_jurusan);
    }
    
    public void setJurusan(NodeJurusan jurusan){
        this.jurusan = jurusan;
    }

    // Buat ViewBy
    public int getNip_Dosen(){
        return nip;
    }

}

