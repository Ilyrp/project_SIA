package view;

import java.util.Scanner;

public class Login {
    String Username;
    String Password;

    public Login(){
        Username = "123456";
        Password = "Sandi";
    }

    public void Login(){
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan Username : ");
    Username = input.nextLine();
    System.out.println("Masukkan Password : ");
    Password = input.nextLine();
    }
    
    public void ValidateLogin(){
        if (Admin)
            System.out.println("Menu ADMIN");
            System.out.println("1. Pendaftaran Mahasiswa ");
            System.out.println("2. Manage Dosen Wali ");
            System.out.println("3. Manage Jurusan");
            System.out.println("4. Manage Pembayaran");
            System.out.println("5. Log Out");
    
    
        }else if(sekertasis){
            System.out.println("Menu Sekertaris Jurusan");
            System.out.println("1. Random DosWal");
            System.out.println("2. Log Out");
        }else if(Mahasiswa){
            System.out.println("1. Pembayaran");

            // Input ulang
        }else{
            
        }
        
    
}
