package node;

public class NodeMahasiswa {
    String npm;
    String namaMahasiswa;
    String kewarganegaraan;
    String NoTelp;

    public NodeMahasiswa ( String namaMahasiswa, String kewarganegaraan,String NoTelp) {
        this.NoTelp = NoTelp;
        this.namaMahasiswa = namaMahasiswa;
        this.kewarganegaraan = kewarganegaraan;
    }

    public void viewMahasiswa() {
        System.out.println("NPM  : " + this.npm);
        System.out.println("Nama : " + this.namaMahasiswa);
        System.out.println("Kewarganegaraan : " + this.kewarganegaraan);
        System.out.println("Nomer Telepon :"+this.NoTelp);
    }

    public String getNama_Mahasiswa() {
        return namaMahasiswa;
    }

    public void setNoTelpMahasiswa(String noTelp) {
        this.NoTelp = noTelp;
    }

// public void setNama_Mahasiswa(String nama_Mahasiswa) { 
//     this.namaMahasiswa = nama_fakultas;
}