// Nama     : Naufal Rizki Saputra
// NIM      : 24060122120011

public class SeaPlane extends Airplane {

    private double maxLoad;

    public SeaPlane(double maxLoad){
        this.maxLoad = maxLoad;
    }
    
    public double calcFuelEfficency(){
        return maxLoad * 2;
    }

    public double calcTripDistance(){
        return 5000.0;
    }

    public void takeOff(){
        System.out.println("Pesawat laut sedang lepas landas dari atas laut");
    }

    public void land(){
        System.out.println("Pesawat laut sedang mendarat di atas laut");
    }

    public void fly(){
        System.out.println("Pesawat laut sedang terbang di atas laut");
    }

}
