// Nama         : Naufal Rizki Saputra
// NIM          : 24060122120011
// Deskripsi    : Kelas yang berisi program utama untuk mengaplikasikan kelas product
// Tanggal      : 8 Maret 2024

public class MProduct {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 4, 500);
        System.out.println("Nama Produk: " + product1.getName());
        System.out.println("Stock Produk: " + product1.getStock());
        System.out.println("Harga Produk: " + product1.getPrice());

        product1.purchaseProduct(5);
        System.out.println("Product stock : " + product1.getStock());

        System.out.println("=====================================");

        Product product2 = new Product("Mouse", 10, 100);
        System.out.println("Nama Produk: " + product2.getName());
        System.out.println("Stock Produk: " + product2.getStock());
        System.out.println("Harga Produk: " + product2.getPrice());

        product2.addStock(2);
        System.out.println("Stock Produk setelah ditambah: " + product2.getStock());
        product2.addStock(0); // untuk case addStock harus > 0
        System.out.println("Stock Produk setelah ditambah: " + product2.getStock());
    } 
}