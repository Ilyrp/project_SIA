package view;

import java.util.Scanner;
import java.time.LocalDate;
import controller.User;
import node.NodeDosen;
import node.NodeJurusan;
import node.NodeMahasiswa;

public class Dashboard {
    public static void menuAdmin() {
        Scanner input = new Scanner(System.in);
        LocalDate time = LocalDate.now();
        int pilih;

        do {
            System.out.println("Menu ADMIN");
            System.out.println("1. Pendaftaran Mahasiswa");
            System.out.println("2. Manage Dosen");
            System.out.println("3. Manage Mahasiswa");
            System.out.println("4. Manage Jurusan");
            System.out.println("5. Manage Pembayaran");
            System.out.println("6. Log Out");
            System.out.print("Masukkan Pilihan: ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    input.nextLine();
                    System.out.println("FORM PENDAFTARAN");
                    System.out.println("Tanggal Pendaftaran : "+time);
                    System.out.print("Masukkan Nama Pendaftar : ");
                    String namaPendaftar = input.nextLine();
                    // input.nextLine();
                    User.jurusan.viewAllJurusan();
                    System.out.print("Masukkan Jurusan : ");
                    int jur= input.nextInt();
                    NodeJurusan j = User.jurusan.searchJurusan(jur);
                    
                    // selector
                    input.nextLine();
                    System.out.print("Masukkan alamat : ");
                    String alamat = input.nextLine();
                    System.out.print("Masukkan Nomer Telepon : ");
                    String noTelepon = input.nextLine();
                    // input.nextLine();
                    System.out.println("WALI MAHASISWA");
                    System.out.print("Masukkan Nama Wali : ");
                    String namaWali = input.nextLine();
                    System.out.print("Masukkan alamat Wali : ");
                    String alamatWali = input.nextLine();
                    System.out.print("Masukkan Nomer Telepon Wali : ");
                    String noTelponWali = input.nextLine();
                    User.mahasiswa.insertMahasiswa(namaPendaftar, alamat, noTelepon,namaWali,alamatWali,noTelponWali,j);
                    break;
                case 2:
                    manageDosen(input);
                    break;
                case 3:
                    manageMahasiswa(input);
                    break;
                case 4:
                    manageJurusan(input);
                    break;
                case 5:
                    System.out.println("Menu Pembayaran:");
                    input.nextLine();
                    System.out.println("Masukkan nama Mahasiswa : ");
                    String nama = input.nextLine();
                    System.out.println("Masukkan Kasir : ");
                    String kasir = input.nextLine();
                    System.out.println("Tanggal Bayar : "+time);
                    NodeMahasiswa mhs = User.mahasiswa.searchMahasiswa(nama);
                    User.mahasiswa.updateNpm(nama);
                    User.pembayaran.insertPembayaran(time,mhs, kasir);
                    break;
                case 6:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (pilih != 6);
    }

    public static void menuSekJur() {
        Scanner input = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("Menu Sekertaris Jurusan");
            System.out.println("1. Set DosWal");
            System.out.println("2. Log Out");
            System.out.print("Masukkan Pilihan: ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    input.nextLine();
                    System.out.println("Masukkan Nama Mahasiswa : ");
                    String nama = input.nextLine();
                    User.dosen.viewAllDosen();
                    System.out.println("Pilih dosen wali(NIP) : ");
                    int nip = input.nextInt();
                    NodeDosen d = User.dosen.searchDosen(nip);
                    User.mahasiswa.setDoswal(nama, d);
                    User.mahasiswa.viewMahasiswaByNama(nama);
                    break;
                case 2:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (pilih != 2);
    }






    public static void manageDosen(Scanner input) {
        int pilih;
        do {
            input.nextLine();
            System.out.println("MENU MANAGE DOSEN");
            System.out.println("1. Tambah Dosen");
            System.out.println("2. Update Data Dosen");
            System.out.println("3. Hapus Data Dosen");
            System.out.println("4. View All Dosen");
            System.out.println("5. View By NIP");
            System.out.println("6. Kembali");
            System.out.print("Masukkan Pilihan: ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIP Dosen : ");
                    int nip = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan Nama Dosen : ");
                    String namaDosen = input.nextLine();
                    System.out.print("Masukkan alamat Dosen : ");
                    String alamatDosen = input.nextLine();
                    System.out.print("Masukkan Nomer Telepon Dosen : ");
                    String noTelpDosen = input.nextLine();
                    User.jurusan.viewAllJurusan();
                    System.out.print("Masukkan Jurusan Dosen : ");
                    int newJurusan = input.nextInt();
                    NodeJurusan jur = User.jurusan.searchJurusan(newJurusan);
                    User.dosen.insertDosen(nip, namaDosen, alamatDosen, noTelpDosen, jur);
                    break;
                case 2:
                    System.out.println("Update Data Dosen");
                    System.out.print("Masukkan NIP Dosen : ");
                    nip = input.nextInt();
                    System.out.print("Masukkan Jurusan Dosen : ");
                    newJurusan = input.nextInt();
                    jur = User.jurusan.searchJurusan(newJurusan);
                    User.dosen.updateDosen(nip, jur);

                                    
                    break;
                case 3:
                    System.out.print("Masukkan NIP dosen Yang Ingin Dihapus :");
                    int nipdosen = input.nextInt();
                    User.dosen.deleteDosen(nipdosen);
                    break;
                case 4:
                    System.out.print("Daftar Dosen");
                    User.dosen.viewAllDosen();
                    break;
                case 5:
                    System.out.print("Masukkan Nip Dosen Yang Ingin Dihilat");
                    nip = input.nextInt();
                    User.dosen.viewDosenByNip(nip);
                    break;
                case 6:
                    System.out.println("Kembali");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (pilih != 6);
    }

    public static void manageMahasiswa(Scanner input) {
        int pilih;
        do {
            input.nextLine();
            System.out.println("MENU MANAGE MAHASISWA");
            System.out.println("1. Update Data Mahasiswa");
            System.out.println("2. Hapus Data Mahasiswa");
            System.out.println("3. View All Mahasiswa");
            System.out.println("4. View By NPM");
            System.out.println("5. Kembali");
            System.out.print("Masukkan Pilihan: ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    input.nextLine();
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
                    System.out.println("Hapus Data Mahasiswa");
                    System.out.print("Masukkan nama Mahasiswa : ");
                    String nama = input.nextLine();
                    User.mahasiswa.deleteMahasiswa(nama);
                    break;
                case 3:
                    System.out.println("Daftar Mahasiswa");
                    User.mahasiswa.viewAllMahasiswa();
                    break;
                case 4:
                    System.out.print("Masukkan NPM Yang Ingin Dilihat : ");
                    npm = input.nextLine();
                    User.mahasiswa.viewMahasiswaByNpm(npm);
                    break;
                case 5:
                    System.out.println("Kembali");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (pilih != 5);
    }

    public static void manageJurusan(Scanner input) {
        int pilih;
        do {
            input.nextLine();
            System.out.println("MENU MANAGE JURUSAN");
            System.out.println("1. Tambah Jurusan");
            System.out.println("2. Update Jurusan");
            System.out.println("3. Hapus Jurusan");
            System.out.println("4. View All Jurusan");
            System.out.println("5. Kembali");
            System.out.print("Masukkan Pilihan: ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    input.nextLine();
                    System.out.print("Masukkan Nama Jurusan : ");
                    String namaJurusan = input.nextLine();
                    System.out.print("Masukkan Fakultas Jurusan : ");
                    String fakultasJurusan = input.nextLine();
                    User.jurusan.insertJurusan(namaJurusan, fakultasJurusan);
                    break;
                case 2:
                    input.nextLine();
                    System.out.print("Update Jurusan");
                    System.out.print("Masukkan Nama Jurusan : ");
                    namaJurusan = input.nextLine();
                    System.out.print("Masukkan Fakultas Jurusan : ");
                    fakultasJurusan = input.nextLine();
                    User.jurusan.updateJurusan(namaJurusan, fakultasJurusan);
                    break;
                case 3:
                    User.jurusan.viewAllJurusan();
                    System.out.print("Masukkan Jurusan yang ingin dihapus : ");
                    String jurusan = input.nextLine();
                    User.jurusan.deleteJurusan(jurusan);
                    break;
                case 4:
                    User.jurusan.viewAllJurusan();
                    break;
                case 5:
                    System.out.println("Kembali");
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (pilih != 5);
    }

    

    
    public static void manageUser(){
        Scanner input = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("Menu Manage User");
            System.out.println("1. Tambah User");
            System.out.println("2. Update Password User");
            System.out.println("3. Delete User");
            System.out.println("4. View All User");
            System.out.println("5. Log Out");
            System.out.print("Masukkan Pilihan: ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("1. Tambah Admin");
                    System.out.println("2. Tambah SekJur");
                    System.out.println("3. Kembali");
                    System.out.print("Pilih Menu: ");
                    pilih = input.nextInt();
                    switch (pilih) {
                        case 1:
                            input.nextLine();
                            System.out.println("Masukkan Username Admin : ");
                            String username = input.nextLine();
                            System.out.println("Masukkan Password Admin");
                            String password = input.nextLine();
                            User.admin.insertAdmin(username,password);
                            
                            break;
                        case 2:
                        input.nextLine();
                            System.out.println("Masukkan Username Admin : ");
                            username = input.nextLine();
                            System.out.println("Masukkan Password Admin");
                            password = input.nextLine();
                            User.sekjur.insertSekjur(username, password);
                            break;
                        default:
                    }
                    break;

                case 2:
                    System.out.println("1. Update Admin");
                    System.out.println("2. Update SekJur");
                    System.out.println("3. Kembali");
                    System.out.print("Pilih Menu: ");
                    pilih = input.nextInt();
                    switch (pilih) {
                        case 1:
                            input.nextLine();
                            System.out.println("Masukkan Username : ");
                            String username = input.nextLine();
                            System.out.println("Masukkan Password : ");
                            String password = input.nextLine();
                            User.admin.updatePassword(username, password);
                            
                            break;
                        case 2:
                        input.nextLine();
                            System.out.println("Masukkan Username : ");
                            username = input.nextLine();
                            System.out.println("Masukkan Password : ");
                            password = input.nextLine();
                            User.sekjur.updatePassword(username, password);
                            break;
                        default:
                            break;
                        }
                    break;
                
                case 3:
                        System.out.println("Hapus User");
                        System.out.println("1. Hapus Admin");
                        System.out.println("2. Hapus  SekJur");
                        System.out.println("3. Kembali");
                        System.out.print("Pilih Menu: ");
                        pilih = input.nextInt();
                        switch (pilih) {
                            case 1:
                                input.nextLine();
                                System.out.println("Masukkan Username Admin : ");
                                String username = input.nextLine();
                                User.admin.deleteAdmin(username);                               
                                break;
                            case 2:
                            input.nextLine();
                                System.out.println("Masukkan Username Admin : ");
                                username = input.nextLine();
                                User.sekjur.deleteSekjur(username);
                        }
                    break;
                    
                case 4:
                    System.out.println("1. View All Admin");
                    System.out.println("2. View All SekJur");
                    System.out.println("3. Kembali");
                    System.out.print("Pilih Menu: ");
                    pilih = input.nextInt();
                    switch (pilih) {
                        case 1:
                            input.nextLine();
                            System.out.println("DATA USER ADMIN");
                            User.admin.viewAllAdmin();
                            
                            break;
                        case 2:
                        input.nextLine();
                            input.nextLine();
                            System.out.println("DATA USER SEKJUR");
                            User.sekjur.view();
                            
                            break;
                        default:
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (pilih != 5);
    }
}

