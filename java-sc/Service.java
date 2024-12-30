/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEV_PROJECT;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
// Implementasi Pre-order service car
class KilometerBasedService extends LayananMobil {
    private int kilometer;
    private int biayaJasaService;
    private int hargaFilterUdara;
    private int hargaFilterAC;
    private int hargaOliMesin;
    private int hargaOliTransmisi;
    private int hargaFilterOli;
    private int hargaBusi;
    private int hargaKampasRem;

    public KilometerBasedService(int kilometer) {
        this.kilometer = kilometer;
        // Set harga-harga layanan
        this.biayaJasaService = 50000;
        this.hargaFilterUdara = 80000;
        this.hargaFilterAC = 180000;
        this.hargaOliMesin = 450000;
        this.hargaOliTransmisi = 260000;
        this.hargaFilterOli = 25000;
        this.hargaBusi = 280000;
        this.hargaKampasRem = 450000;
    }

    @Override
    public void layananMobil() {
        if (kilometer < 1000) {
            System.out.println("Layanan Mobil: Membersihkan Filter Udara dan melakukan Torsi pada semua ban (Biaya Layanan: Rp. 20000)");
        } else if (kilometer >= 1000 && kilometer < 5000) {
            // Lakukan layanan sesuai kebutuhan dan tambahkan biaya ke total harga
            System.out.println("Layanan Mobil: Membersihkan Filter Udara dan Filter AC, Penggantian oli mesin, penggantian filter oli, Membersihkan Kampas Rem depan dan melakukan Torsi pada semua Ban (Biaya Layanan: Rp. " + biayaJasaService + ", Harga Oli Mesin: Rp. " + hargaOliMesin + ", Harga Filter Oli: Rp. " + hargaFilterOli + ")");
        } else if (kilometer >= 5000 && kilometer < 20000) {
            // Lakukan layanan sesuai kebutuhan dan tambahkan biaya ke total harga
            System.out.println("Layanan Mobil: Mengganti Filter Udara dan Filter AC, Penggantian oli mesin dan transmisi, penggantian Filter oli, Membersihkan Kampas Rem depan dan belakang dan melakukan Torsi pada semua Ban (Biaya Layanan: Rp. " + biayaJasaService + ", Harga Filter Udara: Rp. " + hargaFilterUdara + ", Harga Filter udara: Rp. " + hargaFilterAC + " Harga Oli Mesin: Rp. " + hargaOliMesin + ", Harga Oli Transmisi: Rp. " + hargaOliTransmisi + ", Harga Filter Oli: Rp. " + hargaFilterOli + ")");
        } else if (kilometer >= 20000 && kilometer < 40000) {
            // Lakukan layanan sesuai kebutuhan dan tambahkan biaya ke total harga
            System.out.println("Layanan Mobil: Mengganti Busi pada mobil, Mengganti Filter Udara dan Filter AC, Penggantian oli mesin dan transmisi, penggantian Filter oli, Mengganti Kampas Rem depan dan belakang dan melakukan Torsi pada semua Ban (Biaya Layanan: Rp. " + biayaJasaService + ", Harga Busi: Rp. " + hargaBusi + ", Harga Filter Udara: Rp. " + hargaFilterUdara + ", Harga Filter udara: Rp. " + hargaFilterAC + " Harga Oli Mesin: Rp. " + hargaOliMesin + ", Harga Oli Transmisi: Rp. " + hargaOliTransmisi + ", Harga Filter Oli: Rp. " + hargaFilterOli + ", Harga Kampas Rem Depan dan belakang: Rp. " + hargaKampasRem + ")");
        } else {
            System.out.println("Layanan Mobil: Tidak ada layanan tersedia untuk kilometer mobil ini.");
        }
    }

    @Override
    public int getHargaLayanan() {
        // Menghitung total harga layanan berdasarkan kilometer
        int totalHarga = 0;
        if (kilometer < 1000) {
            totalHarga += 20000;
        } else if (kilometer >= 1000 && kilometer < 5000) {
            totalHarga += biayaJasaService + hargaOliMesin + hargaFilterOli;
        } else if (kilometer >= 5000 && kilometer < 20000) {
            totalHarga += biayaJasaService + hargaFilterUdara + hargaFilterAC + hargaOliMesin + hargaOliTransmisi + hargaFilterOli;
        } else if (kilometer >= 20000 && kilometer < 40000) {
            totalHarga += biayaJasaService + hargaBusi + hargaFilterUdara + hargaFilterAC + hargaOliMesin + hargaOliTransmisi + hargaFilterOli + hargaKampasRem;
        }
        return totalHarga;
    }
}

// Implementasi history service mobil
class RiwayatLayanan {
    private ArrayList<String> daftarRiwayat;

    public RiwayatLayanan() {
        daftarRiwayat = new ArrayList<>();
    }

    public void tambahRiwayat(String riwayat) {
        daftarRiwayat.add(riwayat);
    }

    public void tampilkanRiwayat() {
        System.out.println("Riwayat Layanan:");
        for (String riwayat : daftarRiwayat) {
            System.out.println(riwayat);
        }
    }
}

public class Service {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalHarga = 0;

        // Riwayat layanan
        RiwayatLayanan riwayatLayanan = new RiwayatLayanan();

        // Menu loop
        while (true) {
            // Menampilkan menu layanan
            System.out.println("\nMenu Layanan Mobil:");
            System.out.println("1. Service ");
            System.out.println("2. Pembayaran ");
            System.out.println("3. Riwayat ");
            System.out.println("4. Keluar ");
            System.out.print("Pilih layanan (1-4): ");
            int pilihan = scanner.nextInt();

            // Membuat objek layanan
            LayananMobil layananMobil = null;

            switch (pilihan) {
                case 1:
                    // Layanan berdasarkan kilometer mobil
                    System.out.print("Masukkan kilometer mobil: ");
                    int kilometer = scanner.nextInt();
                    layananMobil = new KilometerBasedService(kilometer);
                    layananMobil.layananMobil();
                    totalHarga += layananMobil.getHargaLayanan();
                    riwayatLayanan.tambahRiwayat("Service, Kilometer: " + kilometer + ", Total Harga: Rp. " + totalHarga);
                    break;
                case 2:
                    // Pembayaran layanan mobil
                    System.out.print("Masukkan jumlah pembayaran: Rp. ");
                    int jumlahPembayaran = scanner.nextInt();
                    totalHarga -= jumlahPembayaran; // Mengurangi total harga dengan pembayaran
                    System.out.println("Pembayaran berhasil!");
                    break;
                case 3:
                    // Menampilkan riwayat layanan
                    riwayatLayanan.tampilkanRiwayat();
                    break;
                case 4:
                    // Keluar dari program
                    System.out.println("Terima kasih!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }

            System.out.println("Total Harga Layanan: Rp. " + totalHarga);
        }
    }

    void signUp(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
