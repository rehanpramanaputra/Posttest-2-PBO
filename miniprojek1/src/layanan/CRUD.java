/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layanan;

/**
 *
 * @author ACER
 */

// Interface CRUD untuk operasi create, read, update, dan delete
public interface CRUD {
    void tambah(Object obj); 
    void hapus(String nama); 
    void tampilkanSemua();   
}
