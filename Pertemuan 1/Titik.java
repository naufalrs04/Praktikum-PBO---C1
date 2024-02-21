// Nama    : Naufal Rizki Saputra
// NIM     : 24060122120011

public class Titik {
    private float absis;
    private float ordinat;
    static float counterTitik;

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

    public void Translasi(float xbaru, float ybaru){
        this.absis += xbaru;
        this.ordinat += ybaru;
    }

    public void display(){
        System.out.println("Absis : " + this.absis);
        System.out.println("Ordinat : " + this.ordinat);
    }

}