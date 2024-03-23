// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : implementasi cara menghitung luas lingkaran
// Tanggal      : 23 Maret 2024 

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran : ");
        double jejari = inputan.nextDouble();
        Lingkaran l = new Lingkaran(jejari);

        System.out.println("Luas lingkaran dengan jari-jari " + jejari + " adalah " + l.hitungLuas());

        inputan.close();
    }
}