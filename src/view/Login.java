package view;

import java.util.Scanner;

import controller.User;

public class Login {
    static String Username;
    static String Password;

    static Scanner input = new Scanner(System.in);
    
    public static void login(){
        int pilih;
        do {
            System.out.println("Pilih Menu Login");
            System.out.println("1. Menu Admin");
            System.out.println("2. Menu SekJur");
            System.out.println("3. Manage User");
            System.out.println("4. Keluar");
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
                        Dashboard.menuAdmin();
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
                        Dashboard.menuSekJur();
                    }
                    else{
                        System.out.println("Login Sekjur gagal.");
                    }
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("Masukkan Username : ");
                    Username = input.nextLine();
                    System.out.println("Masukkan Password : ");
                    Password = input.nextLine();
                    if (User.admin.validateAdmin(Username, Password)) {
                        System.out.println("Login berhasil.");
                        Dashboard.manageUser();
                    }
                    else{
                        System.out.println("Login admin gagal.");
                    }
                    break;
                    
                case 4:
                    System.out.println("Keluar!!!!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Ulangi.");
                    break;
            }
        } while (pilih!=4);
    }
}
