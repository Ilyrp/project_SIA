package node;

public class NodeDoswal {
    String nip;
    String namaDoswal;
    String kewarganegaraan;
    String NoTelp;
    NodeJurusan jurusan;

    public NodeDoswal (String nip, String namaDoswal, String kewarganegaraan,String NoTelp) {
        this.nip = nip;
        this.NoTelp = NoTelp;
        this.namaDoswal = namaDoswal;
        this.kewarganegaraan = kewarganegaraan;
    }

    public void viewDosen() {
        System.out.println("NIP  : " + this.nip);
        System.out.println("Nama : " + this.namaDoswal);
        System.out.println("Kewarganegaraan : " + this.kewarganegaraan);
        System.out.println("Nomer Telepon :"+this.NoTelp);
    }

    public String getNama_Doswal() {
        return namaDoswal;
    }

    public void setNoTelpDoswal(String noTelp) {
        this.NoTelp = noTelp;
    }

// public void setNama_Mahasiswa(String nama_Mahasiswa) { 
//     this.namaDoswal = nama_fakultas;
}