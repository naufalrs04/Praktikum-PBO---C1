// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : Kelas yang berisi program untuk mengatur data product
// Tanggal      : 8 Maret 2024 

public class Product {
    private String name;
    private int stock;
    private int price;

    public Product() {
        this.name = "";
        this.stock = 0;
        this.price = 0;
    }

    public Product(String name, int stock, int price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        assert (name != "") : "Nama tidak boleh kosong";
        this.name = name;
    }
    
    public void setStock(int stock) {
        assert (stock >= 0) : "Stock produk harus lebih dari 0";
        this.stock = stock;
    }

    public void setPrice(int price) {
        assert (price >= 0) : "Harga produk harus lebih dari 0";
        this.price = price;
    }

    public void purchaseProduct(int quantity) {
        assert (quantity > 0 && quantity <= stock) : "Insufficient stock";
        this.stock -= quantity;
    }

    public void addStock(int quantity) {
        assert (quantity > 0) : "Jumlah stock harus lebih dari 0";
        this.stock += quantity;
    }
}