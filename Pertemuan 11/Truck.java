// Nama     : Naufal Rizki Saputra
// NIM      : 24060122120011

public class Truck extends Vehicle {

    private double maxLoad;

    public Truck(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficency(){
        return maxLoad * 1.5;
    }

    public double calcTripDistance(){
        return 1500.00;
    }

}