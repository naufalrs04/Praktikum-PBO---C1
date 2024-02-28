// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : Kelas yang berisi program utama untuk mengaplikasikan kelas Titik
// Tanggal      : 28 februari 2024 

public class MGaris {
    public static void main(String[] args) {
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