// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : representasi dari objek Wali Mahasiswa, turunan kelas Orang
// Tanggal      : 17 Maret 2024 

package org.walimahasiswa;

import org.orang.Orang;

public class WaliMahasiswa extends Orang{
    private String nomorHP;
    private String alamat;
    
    public WaliMahasiswa(String nama, String nik, String nomorHP, String alamat){
        super(nama, nik);
        this.nomorHP = nomorHP;
        this.alamat = alamat;
    }

    public String getNomorHP(){
        return nomorHP;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setNomorHP(String nomorHP){
        this.nomorHP = nomorHP;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void cetak(){
        super.cetak();
        System.out.println("Nomor HP\t: " + getNomorHP());
        System.out.println("Alamat\t\t: " + getAlamat());
    }   
}