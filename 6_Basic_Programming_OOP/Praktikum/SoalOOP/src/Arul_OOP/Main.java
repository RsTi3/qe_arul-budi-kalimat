package Arul_OOP;

 class Product {

     private String nama;
     private String deskripsi;
     private double harga;
     private int stock;

     public Product(String nama, String deskripsi, double harga, int stock) {
         this.nama = nama;
         this.deskripsi = deskripsi;
         this.harga = harga;
         this.stock = stock;
     }

     public void setNama(String nama) {
         this.nama = nama;
     }

     public String getNama() {
         return this.nama;
     }

     public void setDeskripsi(String deskripsi) {
         this.deskripsi = deskripsi;
     }

     public String getDeskripsi() {
         return this.deskripsi;
     }

     public void setHarga(double harga) {
         this.harga = harga;
     }

     public void setStock(int stock) {
         this.stock = stock;
     }

     public int getStock() {
         return this.stock;
     }

     public void getInfo() {
         System.out.println("===");
         System.out.println("INFO PRODUK");
         System.out.println("Nama : " + this.nama);
         System.out.println("Deskripsi : " + this.deskripsi);
         System.out.println("Harga : " + this.harga);
         System.out.println("Jumlah Stok : " + this.stock);
         System.out.println("===");
     }
}

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("HyperX Cloud Alpha", "Headphone Gaming dari merek HyperX dengan kualitas Suara Premium!!!", 1400000, 69);
        Product product2 = new Product("Zowie EC-2B CSGO Edition - Mouse By BenQ", "Mouse Gaming dengan Sensor PMW 3360 dari Benq : Zowie dengan 1000 Reoport Rate", 1200000, 420);
        Product product3 = new Product("HP 24MH", "Monitor 75Hz Panel IPS dari HP dengan penggunaan Office", 1800000, 19);

        // menampilkan informasi produk
        product1.getInfo();
        product2.getInfo();
        product3.getInfo();

    }
}
