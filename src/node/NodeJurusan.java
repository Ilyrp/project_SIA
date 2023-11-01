package node;

public class NodeJurusan {
    String kode_jurusan;
    String nama_jurusan;
    String nama_fakultas;

    public NodeJurusan (String kode_jurusan, String nama_jurusan, String nama_fakultas) {
        this.kode_jurusan = kode_jurusan;
        this.nama_jurusan = nama_jurusan;
        this.nama_fakultas = nama_fakultas;
    }

    public void viewJurusan() {
        System.out.println("kode jurusan : " + this.kode_jurusan);
        System.out.println("nama jurusan : " + this.nama_jurusan);
        System.out.println("nama fakultas : " + this.nama_fakultas);
    }

    public void setNama_fakultas(String nama_fakultas) { 
        this.nama_fakultas = nama_fakultas;
    }

    public String getNama_jurusan() {
        return nama_jurusan;
    }

    public String getKode_jurusan() {
        return kode_jurusan;
    }
}
