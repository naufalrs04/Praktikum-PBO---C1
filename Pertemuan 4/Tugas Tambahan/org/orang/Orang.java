// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : representasi dasar dari objek Orang
// Tanggal      : 17 Maret 2024 

package org.orang;

public class Orang {
    protected String nama;
    protected String nik;

    public Orang (String nama, String nik){
        this.nama = nama;
        this.nik = nik;
    }

    public String getNama(){
        return nama;
    }

    public String getNik(){
        return nik;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNik(String nik){
        this.nik = nik;
    }

    public void cetak(){
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("NIK\t\t: " + getNik());
    }
}