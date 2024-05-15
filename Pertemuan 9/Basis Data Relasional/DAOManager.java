// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : pengelola DAO dalam program
// Tanggal      : 15 Mei 2024 

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}