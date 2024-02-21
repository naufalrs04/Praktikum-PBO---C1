// Nama    : Naufal Rizki Saputra
// NIM     : 24060122120011

public class MTitik {
    public static void main(String[] args) {
        Titik titik1 = new Titik();
        Titik titik2 = new Titik();
        Titik t3;
        t3 = new Titik(5,6);

        System.out.println("\nTitik 1");
        titik1.setAbsis(5);
        titik1.setOrdinat(7);
        titik1.display();
        
        System.out.println("\nTitik 2");
        titik2.setAbsis(5);
        titik2.setOrdinat(7);
        titik2.display();

        float absis2 = titik2.getAbsis();
        float ordinat2 = titik2.getOrdinat();
        System.out.println("T2 --> (" + absis2 + " , " + ordinat2 + ")" );

        System.out.println("\nJumlah objek titik dibuat = " + Titik.getCounterTitik());
        
        System.out.println("\nTitik 2 setelah translasi (2,-8)");
        titik2.Translasi(2, -8);
        titik2.display();

        float absis1 = titik1.getAbsis();
        float ordinat1 = titik1.getOrdinat();
        System.out.println("\nT1 --> (" + absis1 + " , " + ordinat1 + ")" );

        float Absis2 = titik2.getAbsis();
        float Ordinat2 = titik2.getOrdinat();
        System.out.println("T2 --> (" + Absis2 + " , " + Ordinat2 + ")" );

        System.out.println("T3 --> (" + t3.getAbsis() + " , " + t3.getOrdinat() + ")" );

    }
}