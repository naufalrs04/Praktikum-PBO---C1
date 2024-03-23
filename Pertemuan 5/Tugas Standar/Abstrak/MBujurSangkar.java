// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : kelas yang mengimmplementasikan cara menghitung luas bujur sangkar
// Tanggal      : 23 Maret 2024 

import java.util.Scanner;

class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();

        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));

        scan.close();
    }
}