// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : Program untuk serialisasi objek Person
// Tanggal      : 15 Mei 2024 

import java.io.*;

//class Person
class Person implements Serializable {
    private String name;
    public Person(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}

//class SerializePerson
public class SerializePerson {
    public static void main(String[] args) {
        Person p = new Person("Naufal");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(p);
            System.out.println("Selesai menulis objek person");
            s.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
