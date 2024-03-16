// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : driver class untuk poligon, persegi panjang, dan segitiga
// Tanggal      : 16 Maret 2024 

package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang(10, 10, 4);
        persegiPanjang.printInfo();
        System.out.println("Luas Persegi Panjang : " + persegiPanjang.hitungLuas());

        System.out.println("-----------------------------------");   

        Segitiga segitiga = new Segitiga (2,3,3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga : " + segitiga.hitungLuas());
    }
}