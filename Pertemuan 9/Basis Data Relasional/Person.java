// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : Person database model
// Tanggal      : 15 Mei 2024 

public class Person {
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(int i, String n) {
        id = i;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}