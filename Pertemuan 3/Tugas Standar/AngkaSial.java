// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : Kelas yang berisi program untuk Angka Sial yang meng-inherit dari super class AngkaSialException.java
// Tanggal      : 3 Maret 2024 

public class AngkaSial extends Exception{
    public void cobaAngka (int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch (AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukan angka");
        }
    }
}

// PERTANYAAN
// Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi ?
// Apakah baris 21 pada AngkaSial.java di atas dieksekusi ?

// Jawaban
// Ketika eksepsi terjadi, maka baris 12 tidak akan dieksekusi, karena tertangkap pada kondisi if, dan akan lgsg masuk ke kondisi throw and catch
// Baris 21 pada AngkaSial.java akan dieksekusi apabila terdapat angka = 13, karena telah diinialisasikan oleh kondisi throw pada baris ke 9 dan 10, sehingga kondisi tersebut akan di catch oleh baris 21