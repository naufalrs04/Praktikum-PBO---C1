// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : representasi dari objek segitiga, turunan kelas poligon
// Tanggal      : 16 Maret 2024 

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon {
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public void printInfo() {
        System.out.println("Bangun Segitiga bersisi " + this.getJumlahSisi());
    } 
}