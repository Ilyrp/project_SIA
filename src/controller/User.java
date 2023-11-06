package controller;
import model.ModelAdmin;
import model.ModelDosen;
import model.ModelJurusan;
import model.ModelMahasiswa;
import model.ModelPembayaran;
import model.ModelSekjur;
import view.Login;


public class User {
    public static ModelAdmin admin = new ModelAdmin(); 
    public static ModelMahasiswa mahasiswa = new ModelMahasiswa(); 
    public static ModelJurusan jurusan = new ModelJurusan();
    public static ModelDosen dosen = new ModelDosen();
    public static ModelSekjur sekjur = new ModelSekjur();
    public static ModelPembayaran pembayaran = new ModelPembayaran();
    
    public void ya(){
        
        admin.insertAdmin("Ilyasa", "1234");
        admin.insertAdmin("y", "y");

        sekjur.insertSekjur("Franky", "ya");
        sekjur.insertSekjur("n", "n");

        jurusan.insertJurusan("Teknik Informatika", "FTETI");
        jurusan.insertJurusan("Teknik Elektro", "FTETI");
        jurusan.insertJurusan("Sistem Informasi", "FTETI");
        Login.login();
    }

}
