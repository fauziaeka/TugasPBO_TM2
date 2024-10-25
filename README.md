

# Pertemuan Kedua - Konsep Constructor, Casting, Super, This, Interface

# 📜 Topik Utama 
- Constructor
- Casting 
- Super
- This
- Interface

# 📚 Daftar Isi 
- [Constructor](https://github.com/fauziaeka/TugasPBO_TM2/blob/main/PermainanTradisional.java)
- [Interface](https://github.com/fauziaeka/TugasPBO_TM2/blob/main/GobakSodor.java)
- [This](https://github.com/fauziaeka/TugasPBO_TM2/blob/main/PermainanTradisional.java)
- [Super](https://github.com/fauziaeka/TugasPBO_TM2/blob/main/JenisPermainan.java)
- [Casting](https://github.com/fauziaeka/TugasPBO_TM2/blob/main/Utama.java)
- Kesimpulan

# 🏗️ Constructor
Constructor merupakan methode yang digunakan untuk menginisialisasi object saat object tersebut dibuat. 
Karakteristik :
1. Nama Constructor sama persis dengan nama kelas
2. Tipe memiliki tipe pengembalian (return)
3. Dapat di-overload, dimana sebuah kelas dapat memiliki beberapa constructor dengan parameter yang berbeda
```
public class PermainanTradisional extends JenisPermainan implements GobakSodor, PetakUmpet, LompatTali {
    private String lokasiPermainan;
    private String waktuPermainan;

    // Konstruktor
    public PermainanTradisional() {
        System.out.println("ini constructor jenis permainan");
        this.setlokasiPermainan("Halaman sekolah");
        this.setwaktuPermainan("Empat puluh menit");
        super.lokasiPermainan();
        super.waktuPermainan();
    }
    
    public String getlokasiPermainan() {
        return lokasiPermainan;
    }
    public void setlokasiPermainan(String lokasiPermainan) {
        this.lokasiPermainan = lokasiPermainan;
    }
    
    public String getwaktuPermainan() {
        return waktuPermainan;
    }
    public void setwaktuPermainan(String waktuPermainan) {
        this.waktuPermainan = waktuPermainan;
    }
    
    @Override
    public void menjaga() {
        System.out.println("menjaga lawan");
    }

    @Override
    public void sembunyi() {
        System.out.println("sembunyi dari yg jaga");
    }

    @Override
    public void lompat() {
        System.out.println("melompati tali");
    }
    public void cek(){
        super.sembunyi();
        this.sembunyi();
        super.menjaga();
        this.menjaga();
        super.lompat();
        this.lompat();
    }
}
```
# 📜 Interface
Interface merupakan blueprint yang hanya mendefinisikan method tanpa implementasinya.
Karakteristik :
1. Kelas yang mengimplementasikan interface harus menyediakan implementasi dari semua method yang didefinisikan dalam interface
2. Satu kelas bisa mengimplementasikan lebih dari satu interface, hal ini memungkinkan adanya multiple inheritance secara tidak langsung
3. Tidak memiliki properti non-konstanta
```
public interface GobakSodor {
    public void menjaga();
    
}
```
# 🔍 This
This merupakan keyword dalam bahasa Java yang merujuk ke instance dari kelas tempat this digunakan. keyword ini sering digunakan untuk membedakan antara variabel anggota dan parameter method atau constructor yang memiliki nama yang sama
Karakteristik :
1. Keyword This dapat membantu membedakan antara variabel instance dan parameter lokal
2. This dapat digunakan untuk memanggil constructor lain dalam kelas yang sama 
3. This dapat digunakan dalam metode untuk mengembalikan referensi object saat ini 
```
public class PermainanTradisional extends JenisPermainan implements GobakSodor, PetakUmpet, LompatTali {
    private String lokasiPermainan;
    private String waktuPermainan;

    // Konstruktor
    public PermainanTradisional() {
        System.out.println("ini constructor jenis permainan");
        this.setlokasiPermainan("Halaman sekolah");
        this.setwaktuPermainan("Empat puluh menit");
        super.lokasiPermainan();
        super.waktuPermainan();
    }
    
    public String getlokasiPermainan() {
        return lokasiPermainan;
    }
    public void setlokasiPermainan(String lokasiPermainan) {
        this.lokasiPermainan = lokasiPermainan;
    }
    
    public String getwaktuPermainan() {
        return waktuPermainan;
    }
    public void setwaktuPermainan(String waktuPermainan) {
        this.waktuPermainan = waktuPermainan;
    }
    
    @Override
    public void menjaga() {
        System.out.println("menjaga lawan");
    }

    @Override
    public void sembunyi() {
        System.out.println("sembunyi dari yg jaga");
    }

    @Override
    public void lompat() {
        System.out.println("melompati tali");
    }
    public void cek(){
        super.sembunyi();
        this.sembunyi();
        super.menjaga();
        this.menjaga();
        super.lompat();
        this.lompat();
    }
}
```
# 🛠️ Super
Super merupakan keyword dalam Java yang digunakan untuk merujuk ke anggota dari kelas induk (superclass) dari kelas saat ini 
1. Ditandai dengan kata "Extends" yang merujuk ke kelas induk (superclass)
2. Super digunakan untuk memanggil constructor dari kelas induk 
3. Super dapat digunakan untuk mengakses variabel atau method kelas induk 
```
public class JenisPermainan {
    String namaPermainan;
    private String lokasiPermainan;
    private String waktuPermainan;
    
    public void namaPermainan(){ // method 
        System.out.println("bermain bersama");
    }
    public void lokasiPermainan(){ // method 
        System.out.println("lapangan");
    }
    public void waktuPermainan(){ // method 
        System.out.println("jam 12 siang");
    }
    public String getnamaPermainan(){
        return namaPermainan;
    }
     public void setnamaPermainan(String nama){
        this.namaPermainan = nama;
    }
      public void menjaga() {
        System.out.println("menjaga");
    }

    
    public void sembunyi() {
        System.out.println("sembunyi");
    }

  
    public void lompat() {
        System.out.println("lompat");
    }
}
```
# 🚀 Casting 
Casting merupakan proses mengubah tipe data sebuah variabel menjadi tipe data lain. Casting terdiri dari 2 jenis yakni upcasting yang digunakan untuk mengubah object dari kelas turunan ke kelas induknya dan downcasting yang digunakan untuk mengubah object dari kelas inruk ke kelas turunannya 
1. Dapat mengubah tipe data sebuah variabel menjadi tipe data yang lain 
2. Casting tidak dapat digunakan untuk mengubah objek ke tipe yang tidak memiliki hubungan pewarisan
3. Sebelum melakukan downcasting periksa tipe object dengan menggunakan "instanceof"
```
public class Utama {
    public static void main(String[] args) {
        JenisPermainan permainan = new PermainanModern();
        System.out.println("nama permainan : " + permainan.getnamaPermainan());
        System.out.println("");

        PermainanTradisional main = new PermainanTradisional();
        System.out.println("Bermain di " + main.getlokasiPermainan());
        System.out.println("Lamanya permainan : " + main.getwaktuPermainan());
        System.out.println("super and this");
        main.cek();
        System.out.println("");
        
        JenisPermainan bermain = (JenisPermainan) main; // Casting 
        main.namaPermainan();
        System.out.println("");

        PermainanTradisional Tradisional = new PermainanTradisional(); // Interface 
        Tradisional.menjaga();
        Tradisional.sembunyi();
        Tradisional.lompat();
        System.out.println("");
    }
}
```
# 🎯 Kesimpulan
1. Constructor merupakan metode khusu ynag digunakan untuk menginisialisasikan object saat object tersebut dibuat
2. Interface merupakan blueprint yang hanya mendefinisikan method tanpa implementasinya
3. This merupakan keyword dalam bahasa Java yang merujuk ke instance dari kelas tempat this digunakan
4. Super merupakan keyword dalam Java yang digunakan untuk merujuk ke anggota dari kelas induk (superclass) dari kelas saat ini 
5. Casting merupakan proses mengubah tipe data sebuah variabel menjadi tipe data lain
