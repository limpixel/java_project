/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEV_PROJECT;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TransactionGasStation {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-> Silahkan Pilih Sesuai dengan Kendaraan Anda");
        System.out.println("  1. Standard - 92 Oktan");
        System.out.println("  2. Diesel - CN 48");
        System.out.println("  3. Ultimate - 95 Oktan");
        System.out.print("Pilih jenis bahan bakar (1/2/3): ");
        int jenisBahanBakar = input.nextInt();

        double hargaPerLiter = 0;
        String jenisBahanBakarStr = "";

        switch (jenisBahanBakar) {
            case 1:
                hargaPerLiter = 14300;
                jenisBahanBakarStr = "Standard - 92 Oktan";
                break;
            case 2:
                hargaPerLiter = 15230;
                jenisBahanBakarStr = "Diesel - CN 48";
                break;
            case 3:
                hargaPerLiter = 15230;
                jenisBahanBakarStr = "Ultimate - 95 Oktan";
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }

        System.out.print("Masukkan jumlah liter yang dibutuhkan: ");
        double literYangDiInput = input.nextDouble();

        double hargaTotal = hargaPerLiter * literYangDiInput;

        System.out.println("--> Harga Total : Rp. " + hargaTotal);

        System.out.println("--> Pilih Jenis Pembayaran :");
        System.out.println("  1. Cashier");
        System.out.println("  2. Gopay");
        System.out.println("  3. OvO");
        System.out.println("  4. Dana");
        System.out.println("  5. Bank");

        System.out.print("Pilih jenis pembayaran (1/2/3/4/5): ");
        int jenisPembayaran = input.nextInt();

        String jenisPembayaranStr = "";
        switch (jenisPembayaran) {
            case 1:
                jenisPembayaranStr = "Cashier";
                break;
            case 2:
                jenisPembayaranStr = "Gopay";
                break;
            case 3:
                jenisPembayaranStr = "OvO";
                break;
            case 4:
                jenisPembayaranStr = "Dana";
                break;
            case 5:
                jenisPembayaranStr = "Bank";
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }

        System.out.println("Proses pengisian...");

        // Simulasi proses pengisian
        for (int i = 1; i <= literYangDiInput; i++) {
            System.out.println("Pengisian " + i + " / " + literYangDiInput);
            try {
                Thread.sleep(500); // Menunggu 0.5 detik
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Cetak struk
        System.out.println("----- Cetak Struk -----");
        System.out.println("- Jenis Bahan Bakar : " + jenisBahanBakarStr);
        System.out.println("- Liter Bahan Bakar : " + literYangDiInput);
        System.out.println("- Jenis Pembayaran : " + jenisPembayaranStr);
        System.out.println("- Harga Total : Rp. " + hargaTotal);

        input.close();
    }
}
