/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Riza Fitria
 */
public class LatihanTiga {
    public static int hitungKembalian(int uangBayar, int totalHarga) {
        return uangBayar - totalHarga;
    }

    public static void main(String[] args) {
        int totalHarga = 15000;
        int uangBayar = 20000;
        
        int kembalian = hitungKembalian(uangBayar, totalHarga);
        System.out.println("Total Harga : Rp " + totalHarga);
        System.out.println("Uang Bayar  : Rp " + uangBayar);
        System.out.println("Kembalian   : Rp " + kembalian);
    }
}
