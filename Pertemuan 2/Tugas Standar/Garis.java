// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : Kelas yang berisi program class Garis
// Tanggal      : 28 februari 2024 

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    static double counterGaris;
    
    // Constructor
    public Garis(){
        titikAwal = new Titik();
        titikAkhir = new Titik();
        counterGaris++;
    }
  
    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }
    
    // Method getter dan setter
    public Titik getTitikAwal(){
        return this.titikAwal;
    }
  
    public Titik getTitikAkhir(){
        return this.titikAkhir;
    }
  
    static double getCounterGaris(){
        return counterGaris;
    }
  
    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }
  
    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    public float getPanjang(){
        float x = this.getTitikAkhir().getAbsis() - this.getTitikAwal().getAbsis();
        float y = this.getTitikAkhir().getOrdinat() - this.getTitikAwal().getOrdinat();
        return (float) Math.sqrt(x*x + y*y);
    }

    public float getGradien() {
        float x1 = getTitikAwal().getAbsis();
        float x2 = getTitikAkhir().getAbsis();
        float y1 = getTitikAwal().getOrdinat();
        float y2 = getTitikAkhir().getOrdinat();
        return (y2-y1)/(x2-x1);
    }

    public Garis getRefleksiY(){
        Garis G = new Garis(getTitikAwal().getRefleksiY(),getTitikAkhir().getRefleksiY());
        return G;
    }

    public boolean isTegakLurus(Garis G){
        return this.getGradien()*G.getGradien() == -1;
    }
}