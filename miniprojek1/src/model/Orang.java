/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */


// Abstract class Orang sebagai superclass dengan final keyword pada properti id
public abstract class Orang {
    private String nama;
    private final int id;  // ID bersifat final (tidak bisa diubah setelah ditetapkan)

    // Constructor
    public Orang(String nama, int id) {
        this.nama = nama;
        this.id = id;
    }

    // Getter dan Setter untuk nama (Encapsulation)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    // Method abstract yang harus diimplementasikan di subclass
    public abstract void tampilkanInfo();
}

