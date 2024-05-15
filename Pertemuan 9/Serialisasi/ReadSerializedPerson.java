// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : Program untuk serialisasi objek Person
// Tanggal      : 15 Mei 2024 

import java.io.*;
public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person p = null;
        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            p = (Person) s.readObject();
            s.close();
            System.out.println("Serialized person name = "+p.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
