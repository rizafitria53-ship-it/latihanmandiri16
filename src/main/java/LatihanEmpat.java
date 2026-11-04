/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Riza Fitria
 */
public class LatihanEmpat {
    public static void tampilkanDaftarBarang(String namaBarang, int jumlahBeli) {
        System.out.println("--- Detail Daftar Barang ---");
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Jumlah Beli : " + jumlahBeli);
    }

    public static void main(String[] args) {
        String namaBarang = "Buku Tulis";
        int jumlahBeli = 3;
        
        tampilkanDaftarBarang(namaBarang, jumlahBeli);
    }
}
