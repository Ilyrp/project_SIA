package node;
// import node.NodeWaliMahasiswa;
// import node.NodeJurusan;

public class NodeMahasiswa extends NodeWaliMahasiswa {
    String npm;
    NodeWaliMahasiswa waliMahasiswa;
    NodeJurusan jurusan;
    NodeDosen doswal;

    public NodeMahasiswa(String nama, String alamat,String NoTelp,String namaWali,String alamatWali,String NoTelpWali, NodeJurusan jurusan) {
        super(nama, alamat, NoTelp);
        waliMahasiswa = new NodeWaliMahasiswa(namaWali, alamatWali, NoTelpWali);
        this.jurusan = jurusan;
        // this.nama = nama;
        // this.alamat = alamat;
        // this.NoTelp = NoTelp;
        // NodeWaliMahasiswa wm = new NodeWaliMahasiswa(nama,alamat,NoTelp);
        // this.waliMahasiswa = wm;
    }

    public void viewMahasiswa() {
        if (this.npm != null){   
            System.out.println("NPM  : " + this.npm);
        }
        System.out.println("Nama : " + this.nama);
        System.out.println("Alamat : " + this.alamat);
        System.out.println("Nomer Telepon :"+this.NoTelp);
        waliMahasiswa.viewWali();
        System.out.println("Jurusan : " + this.jurusan.nama_jurusan);
        if(this.doswal != null){
            System.out.println("Dosen Wali : " + this.doswal.nama);
        }
    }

    public void viewWali(){
        System.out.println("Nama Wali Mahasiswa : " + this.waliMahasiswa.nama);
        System.out.println("Alamat Wali Mahasiswa : " + this.waliMahasiswa.alamat);
        System.out.println("Nomer Telepon Wali Mahasiswa :"+this.waliMahasiswa.NoTelp);
    }



    public void setNpm(String npm){
        this.npm = npm;
    }

    public void setJurusan(NodeJurusan jurusan){
        this.jurusan = jurusan;
    }
    
    public void setDoswal(NodeDosen doswal){
        this.doswal = doswal;
    }

    public void waliMahasiswa(String nama,String alamat,String NoTelp){
        this.waliMahasiswa = new NodeWaliMahasiswa(nama, alamat, NoTelp);    
    }

   public void setNoTelp_Mahasiswa(String NoTelp){
       this.NoTelp = NoTelp;
   }

    public String getNpm_Mahasiswa(){
        return npm;
    }

    public String getNama_Mahasiswa(){
        return nama;
    }


}

