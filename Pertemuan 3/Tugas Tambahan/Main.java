// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : Kelas yang berisi program utama untuk mengaplikasikan kelas buku, anggota, dan dua kelas exception
// Tanggal      : 8 Maret 2024

public class Main {
    public static void main(String[] args) throws MaksimumBukuTerpinjamException, BukuTidakTersediaException {
        try {
            Buku buku1 = new Buku("Mastering Bircoin");
            Buku buku2 = new Buku("The Age of Cryptocurrency");
            Buku buku3 = new Buku("The Basics of Bitcoins and Blockchains");
            Buku buku4 = new Buku("Bitcoin: The Future of Money?");

            Anggota anggota1 = new Anggota("Ardi");
            // Anggota anggota2 = new Anggota("Rudi");

            anggota1.pinjamBuku(buku1);
            anggota1.pinjamBuku(buku2);
            anggota1.pinjamBuku(buku3);
            anggota1.pinjamBuku(buku4);

            System.out.println("Nama Anggota: " + anggota1.getNama());
            System.out.println("Jumlah Buku Pinjaman: " + anggota1.getJumlahBukuPinjaman());
            System.out.println("Buku Pinjaman pertama: " + anggota1.getBukuPinjaman()[0].getJudul());
            System.out.println("Buku Pinjaman kedua: " + anggota1.getBukuPinjaman()[1].getJudul());
            System.out.println("Buku Pinjaman ketiga: " + anggota1.getBukuPinjaman()[2].getJudul());
            System.out.println("Buku Pinjaman keempat: " + anggota1.getBukuPinjaman()[3].getJudul());

            System.out.println("=====================================");

            // anggota2.pinjamBuku(buku2);      --untuk case ketika buku yang ingin dipinjam tidak tersedia
            
            // System.out.println("Nama Anggota: " + anggota2.getNama());
            // System.out.println("Jumlah Buku Pinjaman: " + anggota2.getJumlahBukuPinjaman());
            // System.out.println("Buku Pinjaman pertama: " + anggota2.getBukuPinjaman()[0].getJudul());
        }
        catch (MaksimumBukuTerpinjamException e) {
            System.out.println(e.getMessage());
        }
        catch (BukuTidakTersediaException e) {
            System.out.println(e.getMessage());
        }
    }
}