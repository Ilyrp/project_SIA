package node;

public class NodeDoswal extends NodeWaliMahasiswa {
    String nip;
    // String nama;
    // String kewarganegaraan;
    // String NoTelp;
    NodeJurusan jurusan;

    // bikin class baaru isinya nama,no telp,kewarganegaraan

  

    public NodeDoswal (String nip, String nama, String kewarganegaraan,String NoTelp) {
        super(nama, kewarganegaraan, NoTelp);
        this.nip = nip;
        // this.NoTelp = NoTelp;
        // this.nama = nama;
        // this.kewarganegaraan = kewarganegaraan;
    }

    public void viewDosen() {
        System.out.println("NIP  : " + this.nip);
        System.out.println("Nama : " + this.nama);
        System.out.println("Kewarganegaraan : " + this.kewarganegaraan);
        System.out.println("Nomer Telepon :"+this.NoTelp);
    }

    public String getNama_Doswal() {
        return nama;
        
    }

    public void setNoTelpDoswal(String noTelp) {
        this.NoTelp = noTelp;
    }

// public void setNama_Mahasiswa(String nama_Mahasiswa) { 
//     this.nama = nama_fakultas;
}