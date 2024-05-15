// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : main program untuk akses DAO
// Tanggal      : 15 Mei 2024 

public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Naufal Rizki");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}