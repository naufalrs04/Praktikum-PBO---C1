// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : Kelas yang berisi program eksepsi buatan sendiri untuk buku tidak tersedia
// Tanggal      : 8 Maret 2024 

public class BukuTidakTersediaException extends Exception {
    public BukuTidakTersediaException(String message) {
        super(message);
    }
}