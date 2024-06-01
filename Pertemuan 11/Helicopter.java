// Nama     : Naufal Rizki Saputra
// NIM      : 24060122120011

public class Helicopter extends Airplane {
    private double maxLoad;

    public Helicopter(double maxLoad){
        this.maxLoad = maxLoad;
    }
    
    public double calcFuelEfficency(){
        return maxLoad * 2;
    }

    public double calcTripDistance(){
        return 500.0;
    }

    public void takeOff(){
        System.out.println("Helikopter sedang lepas landas");
    }

    public void land(){
        System.out.println("Helikopter sedang mendarat");
    }

    public void fly(){
        System.out.println("Helikopter sedang terbang");
    }

}