// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : Kelas yang berisi program class Titik
// Tanggal      : 28 februari 2024 

public class Titik {
    private float absis;
    private float ordinat;
    static float counterTitik;

    // Constructor
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(float absis, float ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Method getter dan setter
    public void setAbsis(float newAbsis){
        this.absis = newAbsis;
    }

    public void setOrdinat(float newOrdinat){
        this.ordinat = newOrdinat;
    }

    public float getAbsis(){
        return absis;
    }

    public float getOrdinat(){
        return ordinat;
    }

    public static float getCounterTitik(){
        return counterTitik;
    }

    public float getJarakPusat(){
        return (float) Math.sqrt(getAbsis()*getAbsis() + getOrdinat()*getOrdinat());
    }

    public void refleksiX() {
        this.ordinat = -(this.ordinat);
    }
    
    public void refleksiY(){
        this.absis = this.absis*(-1);
    }

    public Titik getRefleksiX(){
        Titik t = new Titik (this.absis , -(this.ordinat));
        return t;
    }

    public Titik getRefleksiY(){
        Titik t = new Titik (-(this.absis) , this.ordinat);
        return t;
    }

    public void display(){
        System.out.println("Absis : " + this.absis);
        System.out.println("Ordinat : " + this.ordinat);
    }

}