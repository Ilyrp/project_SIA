package view;

import java.util.Scanner;

import controller.User;

public class Login {
    static String Username;
    static String Password;

    static Scanner input = new Scanner(System.in);
    
    public static void login(){
    // while (pilih != 3) {
        // System.out.println("Pilih Menu Login");
        // System.out.println("1. Menu Admin");
        // System.out.println("2. Menu SekJur");
        // System.out.print("Masukkan Pilihan : ");
        // int pilih = input.nextInt();
        // input.nextLine();
        // System.out.println("Masukkan Username : ");
        // Username = input.nextLine();
        // System.out.println("Masukkan Password : ");
        // Password = input.nextLine();

        int pilih;
        do {
            System.out.println("Pilih Menu Login");
            System.out.println("1. Menu Admin");
            System.out.println("2. Menu SekJur");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    input.nextLine();
                    System.out.println("Masukkan Username : ");
                    Username = input.nextLine();
                    System.out.println("Masukkan Password : ");
                    Password = input.nextLine();
                    if (User.admin.validateAdmin(Username, Password)) {
                        System.out.println("Login admin berhasil.");
                        Dashboard2.menuAdmin();
                    }
                    else{
                        System.out.println("Login admin gagal.");
                    }
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("Masukkan Username : ");
                    Username = input.nextLine();
                    System.out.println("Masukkan Password : ");
                    Password = input.nextLine();
                    if (User.sekjur.validateSekjur(Username, Password)) {
                        System.out.println("Login Sekjur berhasil.");
                    Dashboard2.menuSekJur();
                    }
                    else{
                        System.out.println("Login Sekjur gagal.");
                    }
                    break;
                case 3:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Ulangi.");
                    break;
            }
        } while (pilih!=3);
        // while (true) {
        //     if (pilih == 1) {
        //         if (User.admin.validateAdmin(Username, Password)) {
        //             System.out.println("Login admin berhasil.");
        //             Dashboard2.menuAdmin();
        //         } else {
        //             System.out.println("Login admin gagal.");
        //             break; // Keluar dari loop jika login gagal
        //         }
        //     } else if (pilih == 2) {
        //         // Tambahkan validasi untuk login sebagai user biasa
        //         // if (user.validate(Username, Password)) {
        //         //     System.out.println("Login user berhasil.");
        //         //     Dashboard.menuSekJur();
        //         // } else {
        //         //     System.out.println("Login user gagal.");
        //         //     return false; // Keluar dari loop jika login gagal
        //         // }
        //     }else if(pilih==0){
        //         System.out.println("Keluar");
        //         return false;
                
        //     } else {
        //         System.out.println("Pilihan tidak valid. Ulangi.");
        //         break; // Keluar dari loop jika pilihan tidak valid
        //     }
        // }
        // Tes
    }
}
