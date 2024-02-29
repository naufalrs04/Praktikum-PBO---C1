// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : Kelas yang berisi program class Mahasiswa
// Tanggal      : 29 februari 2024 

public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;
    
    Mahasiswa(String nama, String nim, String jurusan, WaliMahasiswa wali){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNim(){
        return nim;
    }
    
    public String getJurusan(){
        return jurusan;
    }
    
    public WaliMahasiswa getWali(){
        return wali;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    
    public void setWali(WaliMahasiswa wali){
        this.wali = wali;
    }

    public void cetak(){
        System.out.println("Nama Mahasiswa\t: " + getNama());
        System.out.println("NIM\t\t: " + getNim());
        System.out.println("Jurusan\t\t: " + getJurusan());
        System.out.println("Wali\t\t: " + getWali().getNama());
        System.out.println("Nomor HP Wali\t: " + getWali().getNomorHP());
        System.out.println("Alamat Wali\t: " + getWali().getAlamat());
    }
}