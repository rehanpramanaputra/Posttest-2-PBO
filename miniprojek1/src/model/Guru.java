/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */




// Kelas Guru yang mewarisi dari Orang (Inheritance)
public class Guru extends Orang {
    private String mataPelajaran;

    // Constructor
    public Guru(String nama, String mataPelajaran, int id) {
        super(nama, id);  // Mewarisi konstruktor dari superclass Orang
        this.mataPelajaran = mataPelajaran;
    }

    // Getter dan Setter untuk mataPelajaran (Encapsulation)
    public String getMataPelajaran() {
        return mataPelajaran;
    }

    public void setMataPelajaran(String mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }

    // Implementasi method abstract dari Orang
    @Override
    public void tampilkanInfo() {
        System.out.println("ID Guru: " + getId() + ", Nama: " + getNama() + ", Mata Pelajaran: " + mataPelajaran);
    }
}
