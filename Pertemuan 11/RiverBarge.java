// Nama     : Naufal Rizki Saputra
// NIM      : 24060122120011

public class RiverBarge extends Vehicle {
    private double maxLoad;

    public RiverBarge(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficency(){
        return maxLoad * 0.5;
    }

    public double calcTripDistance(){
        return 200.00;
    }
}
