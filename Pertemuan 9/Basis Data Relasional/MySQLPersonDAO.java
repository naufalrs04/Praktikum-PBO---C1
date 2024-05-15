// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : implementasi PersonDAO untuk MySQL
// Tanggal      : 15 Mei 2024 

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();

        // Membuat koneksi, nama db, user, password
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/test_pbo", "root", "root");

        // Query
        String query = "INSERT INTO person(name) VALUES ('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        
        // Tutup koneksi database
        con.close();
    }
}
