/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEV_PROJECT;

import java.util.Scanner;


public class GettingStartedPage {

    static private String username;
    static private String password;
    static private String email;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        GettingStartedPage.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        GettingStartedPage.password = password;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        GettingStartedPage.email = email;
    }

    public static void main(String[] args) {
         // Input Email 
        Scanner input = new Scanner(System.in);
        String pembatas = "-----------------------";
        int InUser;
        
        System.out.println("Silakan login atau daftar untuk melanjutkan.");
        System.out.println("1. Login\n"
                + "2. Daftar\n"
                + "3. Keluar");
        
        InUser = input.nextInt();
        input.nextLine(); // Membuang newline

        switch (InUser) {
            case 1:
                System.out.println("Harap Memasukkan Username, Email, Password");
                System.out.println(pembatas);
                
                System.out.print("1. Massukan Username anda : ");
                String settingUsername = input.nextLine();
                setUsername(settingUsername);
                
                System.out.print("2. Masukkan Password: ");
                String settingPassword;
                do {
                    settingPassword = input.nextLine();
                    
                    // Contoh: keluar dari loop jika panjang password mencapai minimal 8 karakter
                    if (settingPassword.length() >= 8) {
                        break;
                    } else {
                        System.out.println("Password harus memiliki minimal 8 karakter. Silakan coba lagi.");
                        System.out.print("Masukkan Password: ");
                    }
                } while (true);
                
                // Setelah login berhasil, kembali ke halaman HomePage
                Homepage.main(args);
                break;
            case 2:
                // Implementasi pendaftaran pengguna baru
                break;
            case 3:
                System.out.println("Terima kasih telah menggunakan aplikasi kami.");
                System.exit(0);
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
        
        input.close();

    }
}
