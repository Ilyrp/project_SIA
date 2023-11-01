package view;

import java.util.Scanner;
import java.time.LocalDate;
import controller.User;
import model.ModelAdmin;
import model.ModelDosen;
import model.ModelMahasiswa;

public class Dashboard {
    public static void menuAdmin(){
          ModelMahasiswa mahasiswa = new ModelMahasiswa();
          LocalDate time = LocalDate.now();
            Scanner input = new Scanner(System.in);
            int pilih;
            do{
            System.out.println("Menu ADMIN");
            System.out.println("1. Pendaftaran Mahasiswa ");
            System.out.println("2. Manage Dosen");
            System.out.println("3. Manage Mahasiswa ");
            System.out.println("4. Manage Jurusan");
            System.out.println("5. Manage Pembayaran");
            System.out.println("6. Log Out");
            System.out.print("Masukkan Pilihan : ");
            pilih = input.nextInt();
            input.nextLine();
            switch (pilih) {
                case 1:
                
                    System.out.println("Form Pendaftara");
                    System.out.print("Tanggal Pendaftaran"+time);
                    System.out.print("Masukkan Nama Pendaftar : ");
                    String namaPendaftar = input.nextLine();
                    // System.out.print("Masukkan Jurusan : ");
                    // selector
                    System.out.print("Masukkan alamat : ");
                    String alamat = input.nextLine();
                    System.out.print("Masukkan Nomer Telepon : ");
                    String noTelepon = input.nextLine();
                    input.nextLine();
                    System.out.print("Wali Mahasiswa : ");
                    System.out.print("Masukkan Nama Wali : ");
                    String namaWali = input.nextLine();
                    System.out.print("Masukkan alamat Wali : ");
                    String alamatWali = input.nextLine();
                    System.out.print("Masukkan Nomer Telepon Wali : ");
                    String noTelponWali = input.nextLine();
                    mahasiswa.insertMahasiswa(namaPendaftar, alamat, noTelepon);
                    mahasiswa.viewAllMahasiswa();
                    break;
                case 2:
                do{
                    System.out.println("MENU MANAGE DOSEN");
                    System.out.println("1. Tambah Dosen");
                    System.out.println("2. Update Data Dosen");
                    System.out.println("3. Hapus Data Dosen");
                    System.out.println("4. View All Dosen");
                    System.out.println("5. View By NIP");
                    System.out.println("6. Kembali");
                            pilih = input.nextInt();
                            switch (pilih) {
                                case 1:
                                    System.out.print("Masukkan NIP Dosen : ");
                                    int nip = input.nextInt();
                                    input.nextLine();
                                    System.out.print("Masukkan Nama Dosen : ");
                                    String namaDosen = input.nextLine();
                                    System.out.print("Masukkan Kewarganegaraan Dosen : ");
                                    String kewarganegaraanDosen = input.nextLine();
                                    System.out.print("Masukkan Nomer Telepon Dosen : ");
                                    String noTelpDosen = input.nextLine();
                                    System.out.print("Masukkan Jurusan Dosen");
                                    User.dosen.insertDosen(nip, namaDosen, kewarganegaraanDosen, noTelpDosen);
                                    break;
                                case 2:
                                System.out.println("Update Data Dosen");
                                    
                                case 3:
                                System.out.print("Hapus Data Dosen");
                                    System.out.println("Masukkan NIP dosen");
                                    String namadosen = input.nextLine();
                                    User.dosen.deleteDosen(namadosen);
                                    break;
                                case 4:
                                    System.out.print("Daftar Dosen");
                                    User.dosen.viewAllDosen();
                                case 5:
                                    System.out.print("Masukkan Nip Dosen Yang Ingin Dihilat");
                                    nip = input.nextInt();
                                    User.dosen.viewDosenBy(nip);  
                                case 6:
                                    System.out.println("Kembali");
                                    break;
                                default:
                                    break;
                            }
                    }while(pilih != 6);
                    break;
                        
                case 3:
                    do{
                        System.out.println("MENU MANAGE MAHASISWA");
                    System.out.println("1. Update Data Mahasiswa");
                    System.out.println("2. Hapus Data Mahasiswa");
                    System.out.println("3. View All Mahasiswa");
                    System.out.println("4. View By NPM");
                    System.out.println("5. Kembali");
                            pilih = input.nextInt();
                            switch (pilih) {
                                case 1:
                                    System.out.print("Masukkan NPM Mahasiswa : ");
                                    String npm = input.nextLine();
                                    System.out.print("Masukkan Nama Mahasiswa : ");
                                    String namaMahasiswa = input.nextLine();
                                    System.out.print("Masukkan alamat Mahasiswa : ");
                                    String alamatMahasiswa = input.nextLine();
                                    System.out.print("Masukkan Nomer Telepon Mahasiswa : ");
                                    String noTelpMahasiswa = input.nextLine();
                                    System.out.print("Masukkan Jurusan Mahasiswa");
                                    String jurusanMahasiswa = input.nextLine();
                                    User.mahasiswa.updateMahasiswa(npm, namaMahasiswa, alamatMahasiswa, noTelpMahasiswa, jurusanMahasiswa);
                                    break;
                                case 2:
                                System.out.print("Hapus Data Mahasiswa");
                                    System.out.println("Masukkan NPM Mahasiswa");
                                    String nama = input.nextLine();
                                    User.dosen.deleteDosen(nama);
                                case 3:
                                    System.out.print("Daftar Mahasiswa");
                                    User.dosen.viewAllDosen();
                                    break;
                                case 4:
                                    System.out.print("Masukkan NPM Yang Ingin Dilihat");
                                    npm = input.nextLine();
                                    User.mahasiswa.viewMahasiswaBy(npm);
                                    break;
                                case 5:
                                    System.out.println("Kembali");
                                    break;
                                default:
                                    break;
                            }
                    }while(pilih != 5);
                   break;

                case 4:
                    do{
                                System.out.println("MENU MANAGE JURUSAN");
                                System.out.println("1. Tambah Jurusan");
                                System.out.println("2. Update Jurusan");
                                System.out.println("3. Hapus Jurusan");
                                System.out.println("4. Kembali");
                                pilih =input.nextInt();
                            switch (pilih) {
                                case 1:
                                    System.out.print("Masukkan Nama Jurusan : ");
                                    String namaJurusan = input.nextLine();
                                    System.out.print("Masukkan Fakultas Jurusan : ");
                                    String fakultasJurusan = input.nextLine();
                                    User.jurusan.insertJurusan(namaJurusan, fakultasJurusan);
                                    break;
                                case 2:
                                    System.out.print("Update Jurusan");
                                    System.out.print("Masukkan Nama Jurusan : ");
                                    namaJurusan = input.nextLine();
                                    System.out.print("Masukkan Fakultas Jurusan : ");
                                    fakultasJurusan = input.nextLine();
                                    User.jurusan.updateJurusan(namaJurusan, fakultasJurusan);
                                    break;
                                case 3:
                                    System.out.print("Masukkan Jurusan yang ingin dihapus : ");
                                    String jurusan = input.nextLine();
                                    User.jurusan.deleteJurusan(jurusan);
                                case 4:
                                    System.out.print("Kembali");
                                default:
                                    break;
                            }
                        }while(pilih !=4);
                    break;
                case 5:
                        System.out.println("Menu Pembayaran : ");
                        System.out.println("Masukkan nama Mahasiswa : ");
                        String nama = input.nextLine();
                        System.out.println("Masukkan Kasir : ");
                        String kasir = input.nextLine();
                        System.out.println("Tanggal Bayar : "+time);
                        User.mahasiswa.updateNpm(nama);
                    break;
                default:
                    break;
            }
            }while(pilih != 6);
    }

    
    public static void menuSekJur(){
        Scanner input = new Scanner(System.in);
            System.out.println("Menu Sekertaris Jurusan");
            System.out.println("1. Random DosWal");
            System.out.println("2. Log Out");
            int pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;
            }
    }
}
