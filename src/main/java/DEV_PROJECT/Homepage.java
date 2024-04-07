/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEV_PROJECT;

import java.util.Scanner;

public class Homepage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Login userLogin = new Login(); // Membuat objek LoginUser

        System.out.println("Selamat datang di Aplikasi XYZ!");

        // Loop until the user decides to exit
        while (true) {
            if (userLogin.isLoggedIn()) {
                System.out.println("Selamat datang kembali, " + userLogin.getEmail() + "!");
                displayMainMenu();
            } else {
                System.out.println("Silakan pilih tindakan:");
                System.out.println("1. Login");
                System.out.println("2. Sign Up");
                System.out.println("3. Keluar");

                int option = input.nextInt();
                input.nextLine(); // Consume newline

                switch (option) {
                    case 1:
                        // Perform login
                        System.out.print("Masukkan email: ");
                        String email = input.nextLine();
                        System.out.print("Masukkan password: ");
                        String password = input.nextLine();
                        userLogin.login(email, password);
                        break;
                    case 2:
                        // Perform sign-up
                        System.out.print("Masukkan email: ");
                        String newEmail = input.nextLine();
                        System.out.print("Masukkan password: ");
                        String newPassword = input.nextLine();
                        userLogin.signUp(newEmail, newPassword);
                        break;
                    case 3:
                        System.out.println("Terima kasih! Sampai jumpa lagi.");
                        input.close(); // Close the Scanner before exiting
                        return; // Exit the program
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                }
            }
        }
    }

    public static void displayMainMenu() {
        Scanner input = new Scanner(System.in);

        System.out.println("Silahkan pilih menu dengan kebutuhan anda");
        System.out.println("1. Pengisian Bahan Bakar");
        System.out.println("2. Service Order");
        System.out.println("3. User Profile");
        System.out.println("4. Voucher Exchange");

        int optionUser = input.nextInt();
        input.nextLine(); // Consume newline

        switch (optionUser) {
            case 1:
                System.out.println("Anda memilih Pengisian Bahan Bakar");
                // Panggil metode untuk pengisian bahan bakar di sini
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        input.close(); // Menutup Scanner setelah penggunaan
    }
}
