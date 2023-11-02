 package node;

import java.time.LocalDate;

public class NodePembayaran {
    LocalDate time;
    String kasir;
    NodeMahasiswa mahasiswa;

    public NodePembayaran(NodeMahasiswa mahasiswa, String kasir, LocalDate time){
        this.time = time;
        this.mahasiswa = mahasiswa;
        this.kasir = kasir;
    }

    public void view(){
        System.out.println("Tanggal Pembayaran : "+this.time);
        System.out.println("Nama pembayar : "+this.mahasiswa.nama);
        System.out.println("Kasir : "+this.kasir);
    }
}