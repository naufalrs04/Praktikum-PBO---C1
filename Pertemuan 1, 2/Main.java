// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : Kelas yang berisi program utama untuk mengaplikasikan kelas Titik
// Tanggal      : 28 februari 2024 

public class Main {
    public static void main(String[] args) {
        Titik t1 = new Titik();
        Titik t2 = new Titik();
        Titik t3;
        t3 = new Titik(5,6);

        /* TITIK 1 */
        System.out.println("\n[Titik 1]");
        t1.setAbsis(5);
        t1.setOrdinat(7);
        System.out.println("Absis   (T1)  : " + t1.getAbsis());
        System.out.println("Ordinat (T1)  : " + t1.getOrdinat());
        float absis1 = t1.getAbsis();
        float ordinat1 = t1.getOrdinat();
        System.out.println("T1 --> (" + absis1 + " , " + ordinat1 + ")" );
   
        /* TITIK 2 */
        System.out.println("\n[Titik 2]");
        t2.setAbsis(5);
        t2.setOrdinat(7);
        System.out.println("Absis   (T2)  : " + t2.getAbsis());
        System.out.println("Ordinat (T2)  : " + t2.getOrdinat());
        float absis2 = t2.getAbsis();
        float ordinat2 = t2.getOrdinat();
        System.out.println("T2 --> (" + absis2 + " , " + ordinat2 + ")" );

        /* TITIK 3*/
        System.out.println("\n[Titik 3]");
        float absis3 = t3.getAbsis();
        float ordinat3 = t3.getOrdinat();
        System.out.println("T3 --> (" + absis3 + " , " + ordinat3 + ")" );

        System.out.println("\n[CounterTitik]");
        System.out.println("Jumlah objek titik yang telah dibuat = " + Titik.getCounterTitik());

        System.out.println("\n[getJarakPusat()]");
        System.out.println("Jarak Pusat (T2) : " + t2.getJarakPusat());

        t3.refleksiX();
        t3.refleksiY();
        System.out.println("\n[refleksiX() dan refleksiY()]");
        System.out.println("Refleksi X dan Y --> Titik T3 sekarang : (" + t3.getAbsis() + "," + t3.getOrdinat() + ")");

        System.out.println("\n[getRefleksiX() dan getRefleksiY()]");
        Titik t4 = t2.getRefleksiX();
        Titik t5 = t2.getRefleksiY();
        System.out.println("Refleksi X --> Titik T2 sekarang : (" + t4.getAbsis() + ", " + t4.getOrdinat() + ")");
        System.out.println("Refleksi Y --> Titik T2 sekarang : (" + t5.getAbsis() + ", " + t5.getOrdinat() + ")");

        /*Eksperimen yang dilakukan untuk mengubah access modifier dalam bahasa pemrograman Java memberikan pemahaman yang mendalam tentang bagaimana kontrol akses memengaruhi interaksi antar objek dalam sebuah program berbasis objek. Ketika sebuah atribut, konstruktor, atau method didefinisikan sebagai private, hal itu menandakan bahwa hanya kelas tempat mereka dideklarasikan yang memiliki akses ke elemen tersebut untuk mengamankan data dan fungsionalitas dengan tingkat encapsulation yang tinggi, sehingga membatasi akses dari luar kelas tersebut. 
        
        Ketika elemen-elemen tersebut dinyatakan sebagai public, mereka dapat diakses dari mana saja dalam kode program, bahkan dari kelas lain. Private digunakan untuk melindungi detail implementasi internal dari objek, sementara public memberikan akses yang dibutuhkan untuk berinteraksi dengan objek tersebut. */

        /* GARIS  */
        Garis G1 = new Garis (new Titik(9,4), new Titik(1,0));
        Garis G2 = new Garis(new Titik(1,5), new Titik(7,4));
        Garis G3 = new Garis(new Titik(1,1), new Titik(2,2));
        Garis G4 = new Garis(new Titik(3,2), new Titik(2,3));

        System.out.println("\n[G1]");
        System.out.println("Titik Awal G1\t: (" + G1.getTitikAwal().getAbsis() + " , " + G1.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik Akhir G1\t: (" + G1.getTitikAkhir().getAbsis() + " , " + G1.getTitikAkhir().getOrdinat() + ")");

        System.out.println("\n[G2]");
        System.out.println("Titik Awal G2\t: (" + G2.getTitikAwal().getAbsis() + " , " + G2.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik Akhir G2\t: (" + G2.getTitikAkhir().getAbsis() + " , " + G2.getTitikAkhir().getOrdinat() + ")");

        System.out.println("\n[getPanjang()]");
        System.out.println("Panjang G1 : " + G1.getPanjang());

        System.out.println("\n[getGradien()]");
        System.out.println("Gradien G2 : " + G2.getGradien());

        System.out.println("\n[getRefleksiY()]");
        System.out.println("Refleksi Y terhadap garis G2 : ");
        Garis Gx = G2.getRefleksiY();
        System.out.println("\tTitik Awal G2 sebelum refleksi\t: (" + G2.getTitikAwal().getAbsis() + " , " + G2.getTitikAwal().getOrdinat() + ")");

        System.out.println("\tTitik Akhir G2 sebelum refleksi\t: (" + G2.getTitikAkhir().getAbsis() + " , " + G2.getTitikAkhir().getOrdinat() + ")");

        System.out.println("\tTitik Awal G2 setelah refleksi\t: (" + Gx.getTitikAwal().getAbsis() + " , " + Gx.getTitikAwal().getOrdinat() + ")");
        System.out.println("\tTitik Akhir G2 setelah refleksi\t: (" + Gx.getTitikAkhir().getAbsis() + " , " + Gx.getTitikAkhir().getOrdinat() + ")");

        System.out.println("\n[G3]");
        System.out.println("Titik Awal G3\t: (" + G3.getTitikAwal().getAbsis() + " , " + G3.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik Akhir G3\t: (" + G3.getTitikAkhir().getAbsis() + " , " + G3.getTitikAkhir().getOrdinat() + ")");

        System.out.println("\n[G4]");
        System.out.println("Titik Awal G4\t: (" + G4.getTitikAwal().getAbsis() + " , " + G4.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik Akhir G4\t: (" + G4.getTitikAkhir().getAbsis() + " , " + G4.getTitikAkhir().getOrdinat() + ")");

        System.out.println("\n[isTegakLurus(G:Garis)]");
        System.out.println("Gradien G3\t\t: " + G3.getGradien());
        System.out.println("Gradien G4\t\t: " + G4.getGradien());
        System.out.println("(Is Tegak Lurus ?)\t: " + G3.isTegakLurus(G4));
    }
}