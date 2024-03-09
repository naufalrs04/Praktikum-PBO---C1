// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : Kelas yang berisi program untuk mengatur data anggota
// Tanggal      : 8 Maret 2024 

public class Anggota {
    private String nama;
    private Buku[] bukuPinjaman;
    private int jumlahBukuPinjaman;

    public Anggota(String nama){
        this.nama = nama;
        bukuPinjaman = new Buku[3];
        jumlahBukuPinjaman = 0;
    }

    public String getNama(){
        return nama;
    }

    public Buku[] getBukuPinjaman(){
        return bukuPinjaman;
    }

    public int getJumlahBukuPinjaman(){
        return jumlahBukuPinjaman;
    }

    public void pinjamBuku(Buku buku) throws MaksimumBukuTerpinjamException, BukuTidakTersediaException{
        if(jumlahBukuPinjaman >= 3){
            throw new MaksimumBukuTerpinjamException("Maaf, jumlah buku yang dipinjam sudah maksimum");
        }
        else if(buku.isTersedia() == false){
            throw new BukuTidakTersediaException("Buku yang ingin dipinjam tidak tersedia");
        }
        else{
            bukuPinjaman[jumlahBukuPinjaman] = buku;
            jumlahBukuPinjaman++;
            buku.setTersedia(false);
        }
    }
}