package view;

import java.util.Scanner;

public class Login {
    String Username;
    String Password;

    Scanner input = new Scanner(System.in);

    public void login(){
    System.out.println("Masukkan Username : ");
    Username = input.nextLine();
    System.out.println("Masukkan Password : ");
    Password = input.nextLine();
    }

    
    public String getUserInput(String text) {
        System.out.print(text);
        return input.nextLine();
    }
    // taro di controller
    
    public void menuAdmin(){
            System.out.println("Menu ADMIN");
            System.out.println("1. Pendaftaran Mahasiswa ");
            System.out.println("2. Manage Dosen Wali ");
            System.out.println("3. Manage Jurusan");
            System.out.println("4. Manage Pembayaran");
            System.out.println("5. Log Out");
    }

    public void menuSekJur(){
            System.out.println("Menu Sekertaris Jurusan");
            System.out.println("1. Random DosWal");
            System.out.println("2. Log Out");
    }
    //if elsenya nanti di controller juga

    public void menuMahasiswa(){
        System.out.println("Menu Mahasiswa");
        System.out.println("1. Pembayaran");
        System.out.println("2. Manage Bio");
    }


}