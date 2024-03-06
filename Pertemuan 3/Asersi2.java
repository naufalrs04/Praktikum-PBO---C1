// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : Kelas yang berisi program untuk menunjukkan asersi 2
// Tanggal      : 3 Maret 2024 

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    } 
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0):"Jari-jari tidak boleh <= 0"; // perbaikan kode
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = "+kelilingLingkaran);
    }
}

// Pertanyaan
// Secara Konsep, ada yang kurang tepat pada program Asersi2 di atas ?

// Jawaban
// Seharusnya yang benar pada keterangan assert nya adalah "Jari - jari tidak boleh <= 0", karena jika jari-jari nya <= 0, maka akan terdapat perhitungan yang bernilai negatif, sehingga terasa mustahil jika jari-jari lingkaran bernilai negatif.
// Untuk perbaikan kode pada keterangan assert nya, bisa diganti dengan "Jari-jari tidak boleh <= 0"

