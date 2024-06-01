// Nama     : Naufal Rizki Saputra
// NIM      : 24060122120011

public class Superman extends Kyrptonian {
    
    private String name;

    public Superman(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void takeOff(){
        System.out.println(this.name + "sedang lepas landas");
    }
    
    public void land(){
        System.out.println(this.name + "sedang mendarat");
    }

    public void fly(){
        System.out.println(this.name + "sedang terbang");
    }

    public void leapBuilding(){
        System.out.println(this.name + "sedang lompat dari gedung yang tinggi");
    }

    public void stopBullet() {
        System.out.println(this.name + "dapat menghentikan peluru");
    }

    public void eat(){
        System.out.println("Nasi Goreng");
    }

}