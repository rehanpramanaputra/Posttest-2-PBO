/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layanan;

/**
 *
 * @author ACER
 */



import model.Siswa;
import model.Guru;
import java.util.ArrayList;

public class SekolahService implements CRUD {
    private static int totalSiswa = 0;
    private static int totalGuru = 0;

    // ArrayList untuk menyimpan daftar siswa dan guru
    private final ArrayList<Siswa> daftarSiswa = new ArrayList<>();
    private final ArrayList<Guru> daftarGuru = new ArrayList<>();

    // Implementasi metode tambah dari interface CRUD
    @Override
    public void tambah(Object obj) {
        if (obj instanceof Siswa) {
            daftarSiswa.add((Siswa) obj);
            totalSiswa++;
            System.out.println("Siswa berhasil ditambahkan.");
        } else if (obj instanceof Guru) {
            daftarGuru.add((Guru) obj);
            totalGuru++;
            System.out.println("Guru berhasil ditambahkan.");
        }
    }

    // Implementasi metode hapus dari interface CRUD (berdasarkan nama)
    @Override
    public void hapus(String nama) {
        boolean ditemukan = false;
        
        // Coba hapus dari daftar siswa
        for (Siswa siswa : daftarSiswa) {
            if (siswa.getNama().equalsIgnoreCase(nama)) {
                daftarSiswa.remove(siswa);
                totalSiswa--;
                System.out.println("Siswa " + nama + " berhasil dihapus.");
                ditemukan = true;
                break;
            }
        }

        // Jika tidak ditemukan di daftar siswa, coba hapus dari daftar guru
        if (!ditemukan) {
            for (Guru guru : daftarGuru) {
                if (guru.getNama().equalsIgnoreCase(nama)) {
                    daftarGuru.remove(guru);
                    totalGuru--;
                    System.out.println("Guru " + nama + " berhasil dihapus.");
                    ditemukan = true;
                    break;
                }
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ditemukan siswa atau guru dengan nama " + nama);
        }
    }

    // Implementasi metode tampilkanSemua dari interface CRUD
    @Override
    public void tampilkanSemua() {
        System.out.println("\n--- Daftar Siswa ---");
        if (daftarSiswa.isEmpty()) {
            System.out.println("Tidak ada siswa.");
        } else {
            for (Siswa siswa : daftarSiswa) {
                siswa.tampilkanInfo();
            }
        }

        System.out.println("\n--- Daftar Guru ---");
        if (daftarGuru.isEmpty()) {
            System.out.println("Tidak ada guru.");
        } else {
            for (Guru guru : daftarGuru) {
                guru.tampilkanInfo();
            }
        }
    }

    // Menampilkan jumlah total siswa dan guru
    public static void tampilkanTotal() {
        System.out.println("Total Siswa: " + totalSiswa + ", Total Guru: " + totalGuru);
    }
}

