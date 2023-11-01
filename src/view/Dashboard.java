package view;

import java.util.Scanner;

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
                    System.out.print("Masukkan Jurusan : ");
                    System.out.print("Masukkan Kewarganegaraan : ");
                    String kewarganegaraan = input.nextLine();
                    System.out.print("Masukkan Nomer Telepon : ");
                    String noTelepon = input.nextLine();
                    System.out.println("Wali Mahasiswa : ");
                    System.out.print("Masukkan Nama Wali : ");
                    System.out.print("Masukkan Kewarganegaraan Wali : ");
                    System.out.print("Masukkan Nomer Telepon Wali : ");
                    mahasiswa.insertMahasiswa(namaPendaftar, kewarganegaraan, noTelepon, false);
                    mahasiswa.insertMahasiswa("Ilyasa", "kewarganegaraan", "noTelepon", false);
                    mahasiswa.updateNpm("Ilyasa");
                    mahasiswa.insertMahasiswa("andi", "kewarganegaraan", "noTelepon", false);
                    mahasiswa.updateNpm("andi");
                    mahasiswa.viewAllMahasiswa();
                    break;
                case 2:
                do{
                    System.out.println("MENU MANAGE DOSEN");
                    System.out.println("1. Tambah Dosen");
                    System.out.println("2. Update Data Dosen");
                    System.out.println("3. Hapus Data Dosen");
                    System.out.println("4. Kembali");
                            pilih = input.nextInt();
                            switch (pilih) {
                                case 1:
                                    System.out.println("Masukkan NIP Dosen : ");
                                    System.out.println("Masukkan Nama Dosen : ");
                                    System.out.println("Masukkan Kewarganegaraan Dosen : ");
                                    System.out.println("Masukkan Nomer Telepon Dosen : ");
                                    System.out.println("Masukkan Jurusan Dosen");
                                    break;
                                case 2:
                                System.out.println("Update Data Dosen");
                                
                                case 3:
                                System.out.println("Hapus Data Dosen");
                                    System.out.println("Masukkan NIP dosen");
                                
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
                                    System.out.println("1. Tambah Jurusan");
                                    break;
                                case 2:
                                    System.out.println("2. Update Jurusan");
                                    break;
                                case 3:
                                    System.out.println("3. Hapus Jurusan");
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
