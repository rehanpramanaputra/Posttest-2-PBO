/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author ACER
 */

import layanan.SekolahService;
import model.Siswa;
import model.Guru;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SekolahService sekolahService = new SekolahService();
        int pilihan;

        do {
            System.out.println("\n--- Menu Manajemen Sekolah ---");
            System.out.println("1. Tambah Siswa");
            System.out.println("2. Hapus Siswa/Guru (berdasarkan nama)");
            System.out.println("3. Tampilkan Semua");
            System.out.println("4. Tambah Guru");
            System.out.println("5. Tampilkan Total Siswa dan Guru");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama siswa: ");
                    String namaSiswa = scanner.nextLine();
                    System.out.print("Masukkan kelas siswa: ");
                    String kelasSiswa = scanner.nextLine();
                    System.out.print("Masukkan ID siswa: ");
                    int idSiswa = scanner.nextInt();
                    sekolahService.tambah(new Siswa(namaSiswa, kelasSiswa, idSiswa));
                    break;

                case 2:
                    System.out.print("Masukkan nama siswa/guru yang akan dihapus: ");
                    String namaHapus = scanner.nextLine();
                    sekolahService.hapus(namaHapus);
                    break;

                case 3:
                    sekolahService.tampilkanSemua();
                    break;

                case 4:
                    System.out.print("Masukkan nama guru: ");
                    String namaGuru = scanner.nextLine();
                    System.out.print("Masukkan mata pelajaran guru: ");
                    String pelajaranGuru = scanner.nextLine();
                    System.out.print("Masukkan ID guru: ");
                    int idGuru = scanner.nextInt();
                    sekolahService.tambah(new Guru(namaGuru, pelajaranGuru, idGuru));
                    break;

                case 5:
                    SekolahService.tampilkanTotal();
                    break;

                case 6:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Opsi tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 6);

        scanner.close();
    }
}
