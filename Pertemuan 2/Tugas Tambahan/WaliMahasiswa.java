// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : Kelas yang berisi program class WaliMahasiswa
// Tanggal      : 29 februari 2024 


public class WaliMahasiswa {
    private String nama;
    private String nomorHP;
    private String alamat;

    WaliMahasiswa(String nama, String nomorHP, String alamat) {
        this.nama = nama;
        this.nomorHP = nomorHP;
        this.alamat = alamat;
    }

    public String getNama(){
        return nama;
    }

    public String getNomorHP(){
        return nomorHP;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setNama(String nama){
        this.nama = nama; 
    }

    public void setNomorHP(String nomorHP){
        this.nomorHP = nomorHP;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    } 
}