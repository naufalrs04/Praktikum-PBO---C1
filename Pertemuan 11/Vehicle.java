// Nama     : Naufal Rizki Saputra
// NIM      : 24060122120011

public abstract class Vehicle {

    public abstract  double calcFuelEfficency();

    public abstract double calcTripDistance();

    public String toString(){
        return this.getClass().getSimpleName();
    }
}