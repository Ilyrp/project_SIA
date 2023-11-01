import controller.Menu;
import model.ModelAdmin;
import model.ModelDoswal;
import model.ModelJurusan;
import model.ModelMahasiswa;
import node.NodeJurusan;
// import view.Menu;


public class Ya {
    public static void main(String[] args){
        ModelAdmin admin1 = new ModelAdmin();
        admin1.insertAdmin("Calosa","1234");
        admin1.insertAdmin("Ilyasa","56789");
        admin1.viewAllAdmin();

        ModelMahasiswa mahasiswa1 = new ModelMahasiswa();
        mahasiswa1.insertMahasiswa( "Franky", "Indonesia", "08123456789",true);
        mahasiswa1.viewAllMahasiswa();
        mahasiswa1.insertMahasiswa( "Fika", "Indonesia", "23456789",true);
        mahasiswa1.viewAllMahasiswa();

       ModelJurusan jurusan = new ModelJurusan();
       jurusan.insertJurusan("Informatika", "FTEI");
       jurusan.insertJurusan("Informasi", "FTEI");
       jurusan.viewAllJurusan();

       ModelDoswal doswal = new ModelDoswal();
       doswal.insertDoswal("9876", "Didik", "Jepun", "0876543234");
       doswal.viewAllDosen();

    //    Menu menu = new Menu();
        System.out.println(admin1.validateAdmin("Calosa","1234"));
        mahasiswa1.updateNpm("Franky");
        mahasiswa1.updateNpm("Fika");
        mahasiswa1.viewAllMahasiswa();
    }

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