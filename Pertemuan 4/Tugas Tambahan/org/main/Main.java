// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : driver class untuk Mahasiswa dan Wali Mahasiswa
// Tanggal      : 17 Maret 2024 

package org.main;

import org.mahasiswa.Mahasiswa;
import org.walimahasiswa.WaliMahasiswa;

public class Main{
    public static void main(String[] args) {
        WaliMahasiswa wali1 = new WaliMahasiswa("Bapak Budi", "3374060801231114", "081119034096", "Jl. Bapak Budi No 1");
        WaliMahasiswa wali2 = new WaliMahasiswa("Bapak Ahmad", "3374020802040085", "082137331782", "Jl. Bapak Ahmad No 2");
        WaliMahasiswa wali3 = new WaliMahasiswa("Bapak Joko", "3374010802640080", "082137361782", "Jl. Bapak Joko No 3");

        Mahasiswa mhs1 = new Mahasiswa("Buddy Budi", "3374060801231111", "24060122140999", "Informatika", wali1);
        Mahasiswa mhs2 = new Mahasiswa("Achmad Ahmad", "3374020802140084", "24060122140998", "Teknik Mesin", wali2);
        Mahasiswa mhs3 = new Mahasiswa("Djoko Joko", "3374010802640181", "24060122140997", "Teknik Geologi", wali3);

        mhs1.cetak();
        mhs2.cetak();
        mhs3.cetak();
    }
}