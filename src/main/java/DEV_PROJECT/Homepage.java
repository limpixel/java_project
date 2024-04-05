/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEV_PROJECT;

import java.util.Scanner;



public class Homepage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Aplikasi XYZ!");

        // Loop until the user decides to exit
        while (true) {
            if (LoginUser.isLoggedIn()) {
                System.out.println("Selamat datang kembali, " + LoginUser.getEmail() + "!");
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
                        LoginUser.login();
                        break;
                    case 2:
                        // Perform sign-up
                        LoginUser.signUp();
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
                TransactionGasStation.main(new String[0]);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
