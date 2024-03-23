// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : kelas yang membuat implementasi metode abstrak pada bangun datar
// Tanggal      : 23 Maret 2024 

public class BujurSangkar extends BangunDatar{
    public double hitungLuas(double sisi){
        luas = sisi*sisi;
        return luas;
    }
}

// Jika kelas BujurSangkar tidak membuat implementasi metode dari abstrak maka akan terjadi error
// Karena file BujurSangkar tidak dapat dicompile dan tidak dianggap sebagai sub-class yang meng-inherit abstract dari BangunDatar