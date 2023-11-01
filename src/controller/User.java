package controller;
// import controller.Menu;
import model.ModelAdmin;
import model.ModelJurusan;
import model.ModelMahasiswa;
// import model.ModelDoswal;
// import model.ModelJurusan;
// import model.ModelMahasiswa;
// import node.NodeJurusan;
// import view.Menu;
import view.Login;


public class User {
    public static ModelAdmin admin = new ModelAdmin(); 
    public static ModelMahasiswa mahasiswa = new ModelMahasiswa(); 
    public static ModelJurusan jurusan = new ModelJurusan();
    public void ya(){
        
        admin.insertAdmin("Calosa", "1234");
        admin.insertAdmin("y", "y");

        mahasiswa.insertMahasiswa("Budi","indon", "23", false);

        jurusan.insertJurusan("Teknik Informatika", "FTETI");
        jurusan.insertJurusan("Teknik Elektro", "FTETI");
        jurusan.insertJurusan("Sistem Informasi", "FTETI");
// her tidak guna, kita ganti generate npm saat bayar her( ini nanti fungsi)
        Login.login();
    }

     

    //     ModelMahasiswa mahasiswa1 = new ModelMahasiswa();
    //     mahasiswa1.insertMahasiswa( "Franky", "Indonesia", "08123456789",true);
    //     mahasiswa1.viewAllMahasiswa();
    //     mahasiswa1.insertMahasiswa( "Fika", "Indonesia", "23456789",true);
    //     mahasiswa1.viewAllMahasiswa();

    //    ModelJurusan jurusan = new ModelJurusan();
    //    jurusan.insertJurusan("Informatika", "FTEI");
    //    jurusan.insertJurusan("Informasi", "FTEI");
    //    jurusan.viewAllJurusan();

    //    ModelDoswal doswal = new ModelDoswal();
    //    doswal.insertDoswal("9876", "Didik", "Jepun", "0876543234");
    //    doswal.viewAllDosen();

    // //    Menu menu = new Menu();
    //     // System.out.println(admin1.validateAdmin("Calosa","1234"));
    //     mahasiswa1.updateNpm("Franky");
    //     mahasiswa1.updateNpm("Fika");
    //     mahasiswa1.viewAllMahasiswa();
    // }

}

/*
 * agregation mahasiswa, dosen dan jurusan
 * composition mahasiswa, waliMahasiswa
 * inheritance done
 * validate jika her false dont generate npm
 * setter npm
 * generate jurusan static
 * login
 * menu each role
 * sekJur meng agregasi dosen ke mahasiswa
 * mahasiswa - pembayaran her
 * admin - pendaftaran
 */