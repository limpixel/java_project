/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEV_PROJECT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginUser {
    private static String email;
    private static String password;
    private static boolean isLoggedIn = false;
    private static boolean hasSignedUp = false;
    private List<String> paymentHistory; // Tambahkan daftar riwayat pembayaran

    // Method to handle login
    public static void login() {
        if (hasSignedUp) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan email: ");
            String enteredEmail = input.next();
            System.out.print("Masukkan password: ");
            String enteredPassword = input.next();

            // Check if entered credentials match the stored ones
            if (email != null && password != null && enteredEmail.equals(email) && enteredPassword.equals(password)) {
                isLoggedIn = true;
                System.out.println("Login berhasil!");
            } else {
                System.out.println("Login gagal. Silakan coba lagi.");
            }
        } else {
            System.out.println("Anda belum mendaftar. Silakan daftar terlebih dahulu.");
        }
    }

    // Method to handle sign-up
    public static void signUp() {
        if (!hasSignedUp) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan email baru: ");
            email = input.next();
            System.out.print("Masukkan password baru: ");
            password = input.next();

            isLoggedIn = true;
            hasSignedUp = true;
            System.out.println("Pendaftaran berhasil!");
        } else {
            System.out.println("Anda sudah mendaftar sebelumnya.");
        }
    }

    // Method to check if user is logged in
    public static boolean isLoggedIn() {
        return isLoggedIn;
    }

    // Method to get the email of the logged-in user
    public static String getEmail() {
        return email;
    }
    
    public void addPaymentHistory(String paymentDetails) {
        paymentHistory.add(paymentDetails);
    }

    public void printPaymentHistory() {
        System.out.println("Riwayat Pembayaran:");
        for (String payment : paymentHistory) {
            System.out.println(payment);
        }
    }
}