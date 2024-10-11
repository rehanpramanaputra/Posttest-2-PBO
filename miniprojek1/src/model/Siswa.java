/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */


// Kelas Siswa yang mewarisi dari Orang (Inheritance)
public class Siswa extends Orang {
    private String kelas;

    // Constructor
    public Siswa(String nama, String kelas, int id) {
        super(nama, id);  // Mewarisi konstruktor dari superclass Orang
        this.kelas = kelas;
    }

    // Getter dan Setter untuk kelas (Encapsulation)
    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    // Implementasi method abstract dari Orang
    @Override
    public void tampilkanInfo() {
        System.out.println("ID Siswa: " + getId() + ", Nama: " + getNama() + ", Kelas: " + kelas);
    }
}
