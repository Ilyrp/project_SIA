package view;

import java.util.Scanner;

import controller.User;
import model.ModelAdmin;
import model.ModelDosen;
import model.ModelMahasiswa;

public class Dashboard {
    public static void menuAdmin(){
          ModelMahasiswa mahasiswa = new ModelMahasiswa();
            Scanner input = new Scanner(System.in);
            int pilih;
            do{
            System.out.println("Menu ADMIN");
            System.out.println("1. Pendaftaran Mahasiswa ");
            System.out.println("2. Manage Mahasiswa");
            System.out.println("3. Manage Dosen Wali ");
            System.out.println("4. Manage Jurusan");
            System.out.println("5. Manage Pembayaran");
            System.out.println("6. Log Out");
            System.out.print("Masukkan Pilihan : ");
            pilih = input.nextInt();
            input.nextLine();
            switch (pilih) {
                case 1:
                
                    System.out.println("Form Pendaftara");
                    System.out.print("Masukkan Tanggal Pendaftaran");
                    
                    System.out.print("Masukkan Nama Pendaftar : ");
                    String namaPendaftar = input.nextLine();
                    // System.out.print("Masukkan Jurusan : ");
                    // selector
                    System.out.print("Masukkan alamat : ");
                    String alamat = input.nextLine();
                    System.out.print("Masukkan Nomer Telepon : ");
                    String noTelepon = input.nextLine();
                    input.nextLine();
                    System.out.println("Wali Mahasiswa : ");
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
                    System.out.println("4. Kembali");
                            pilih = input.nextInt();
                            switch (pilih) {
                                case 1:
                                    System.out.println("Masukkan NIP Dosen : ");
                                    int nip = input.nextInt();
                                    System.out.println("Masukkan Nama Dosen : ");
                                    String namaDosen = input.nextLine();
                                    System.out.println("Masukkan Kewarganegaraan Dosen : ");
                                    String kewarganegaraanDosen = input.nextLine();
                                    System.out.println("Masukkan Nomer Telepon Dosen : ");
                                    String noTelpDosen = input.nextLine();
                                    System.out.println("Masukkan Jurusan Dosen");
                                    User.dosen.insertDosen(nip, namaDosen, kewarganegaraanDosen, noTelpDosen);
                                    break;
                                case 2:
                                System.out.println("Update Data Dosen");
                                
                                case 3:
                                System.out.println("Hapus Data Dosen");
                                    System.out.println("Masukkan NIP dosen");
                                    String namadosen = input.nextLine();
                                    User.dosen.deleteDosen(namadosen);
                                    break;
                                case 4:
                                    System.out.println("Masukkan Nip Dosen Yang Ingin Dihilat");
                                    nip = input.nextInt();
                                    User.dosen.viewDosenBy(nip); 
                                
                                default:
                                    break;
                            }
                    }while(pilih != 4);
                    break;
                        
                case 3:
                            pilih =input.nextInt();
                            do{
                                System.out.println("MENU MANAGE DOSEN");
                                System.out.println("1. Tambah Jurusan");
                                System.out.println("2. Update Jurusan");
                                System.out.println("3. Hapus Jurusan");
                                System.out.println("4. Kembali");
                            switch (pilih) {
                                case 1:
                                    System.out.println("Masukkan Nama Jurusan : ");
                                    String namaJurusan = input.nextLine();
                                    System.out.println("Masukkan Fakultas Jurusan : ");
                                    String fakultasJurusan = input.nextLine();
                                    User.jurusan.insertJurusan(namaJurusan, fakultasJurusan);
                                    break;
                                case 2:
                                    System.out.println("2. Update Jurusan");
                                    break;
                                case 3:
                                    System.out.println("Masukkan Jurusan yang ingin dihapus : ");
                                    String jurusan = input.nextLine();
                                    User.jurusan.deleteJurusan(jurusan);

                                case 4:
                                    System.out.println("4. Kemabali");
                                default:
                                    break;
                            }
                        }while(pilih !=4);
                   break;
                case 4:
                    break;
                case 5:
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
