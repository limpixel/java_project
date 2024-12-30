/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEV_PROJECT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
class Login {
    private String username;
    private String email;
    private String password;
    private boolean loggedIn;
    private List<String> loginHistory;

    public Login() {
        loginHistory = new ArrayList<>();
    }

    public void signUp(String email, String password) {
        if (this.email != null && this.password != null) {
            System.out.println("Anda tidak perlu Sign Up, harap Login");
        } else {
            this.email = email;
            this.password = password;
            loggedIn = true;
            System.out.println("Sign Up berhasil! Anda akan diarahkan ke halaman utama.");
            // Arahkan pengguna ke halaman utama untuk mendaftarkan mobil
            registerCar();
        }
    }

    public void login(String email, String password) {
        if (this.email != null && this.password != null && this.email.equals(email) && this.password.equals(password)) {
            loggedIn = true;
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal! Periksa kembali email dan password Anda.");
        }
    }

    public void registerCar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Silakan daftarkan mobil Anda:");

        System.out.print("Plat Nomor: ");
        String platNomor = sc.nextLine(); // Menggunakan nextLine() agar bisa membaca spasi

        System.out.print("Merek Mobil: ");
        String merekMobil = sc.nextLine();

        System.out.print("Nama Pemilik: ");
        String namaPemilik = sc.nextLine();

        System.out.print("CC Mobil: ");
        String ccMobil = sc.nextLine();

        // Lakukan sesuatu dengan data mobil yang didaftarkan, misalnya menyimpan ke database
        System.out.println("Mobil berhasil didaftarkan!");

        // Tambahkan riwayat login
        loginHistory.add("Pendaftaran mobil dengan plat nomor " + platNomor);
    }

    public void printLoginHistory() {
        System.out.println("Riwayat Login:");
        for (String log : loginHistory) {
            System.out.println(log);
        }
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public String getEmail() {
        return email;
    }
}

class PremiumUser extends Login {
    // Override method untuk menambahkan fitur premium
    @Override
    public void registerCar() {
        super.registerCar(); // Panggil method registerCar dari kelas induk
        System.out.println("Fitur premium: pengguna premium dapat mengatur preferensi mobil.");
    }
}
