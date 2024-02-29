// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : Kelas yang berisi program utama untuk mengaplikasikan kelas Mahasiswa dan WaliMahasiswa
// Tanggal      : 29 februari 2024 

public class Main {
    public static void main(String[] args) {

        /* MAHASISWA 1 */
        Mahasiswa mahasiswa1 = new Mahasiswa("ZerGione", "24060123140015", "Teknik Komputer", new WaliMahasiswa("Bapak ZerGione", "081318034097", "Jl. Bapak ZerGione 123, Kabupaten Semarang"));

        /* MAHASISWA 2 */
        WaliMahasiswa Wali2 = new WaliMahasiswa("Udin", "081234567890", "Jl. Pak Udin 010203, Kota Bekasi");
        Mahasiswa mahasiswa2 = new Mahasiswa("Amarudin", "24060122130091", "Pertanian", Wali2);

        /* Get Nama Mahasiswa 1 */
        System.out.println("[getNama()]");
        System.out.println("Nama Mahasiswa 1: " + mahasiswa1.getNama());

        /* Get NIM Mahasiswa 1 */
        System.out.println("\n[getNim()]");
        System.out.println("NIM Mahasiswa 1: " + mahasiswa1.getNim());

        /* Get Jurusan Mahasiswa 1 */
        System.out.println("\n[getJurusan()]");
        System.out.println("Jurusan Mahasiswa 1: " + mahasiswa1.getJurusan());

        /* Get Wali Mahasiswa 1 */
        System.out.println("\n[getWali()]");
        System.out.println("Wali Mahasiswa 1\t\t: " + mahasiswa1.getWali().getNama());
        System.out.println("Nomor HP Wali Mahasiswa 1\t: " + mahasiswa1.getWali().getNomorHP());
        System.out.println("Alamat Wali Mahasiswa 1\t\t: " + mahasiswa1.getWali().getAlamat());

        /* Set Nama Mahasiswa 1 */
        System.out.println("\n- setNama() baru Mahasiswa 1");
        mahasiswa1.setNama("Naufal Rizki Saputra");

        /* Set NIM Mahasiswa 1 */
        System.out.println("- setNim() baru Mahasiswa 1");
        mahasiswa1.setNim("24060122120011");

        /* Set Jurusan Mahasiswa 1 */
        System.out.println("- setJurusan() baru Mahasiswa 1");
        mahasiswa1.setJurusan("Informatika");

        /* Set Wali Mahasiswa 1 */
        System.out.println("- setWali() baru Mahasiswa 1");
        mahasiswa1.setWali(new WaliMahasiswa("Bapak Nopal", "081225717674", "Jl. Bapak Nopal 123, Kota Semarang"));

        /* Cetak Mahasiswa 1 */
        System.out.println("[Cetak Mahasiswa 1]");
        mahasiswa1.cetak();

        /* Cetak Mahasiswa 2 */
        System.out.println("\n[Cetak Mahasiswa 2]");
        mahasiswa2.cetak();
    }  
}