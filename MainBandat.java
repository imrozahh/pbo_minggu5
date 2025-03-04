/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author imro
 */
// Kelas Induk (Superclass) yang bersifat abstrak
abstract class BangunDatar {
    // Method abstrak yang akan diimplementasikan oleh subclass
    abstract double luas();
    abstract double keliling();
}

// Kelas Persegi, turunan dari BangunDatar
class Persegi extends BangunDatar {
    double sisi; // Variabel untuk menyimpan panjang sisi persegi

    // Constructor untuk menginisialisasi sisi
    Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Implementasi method luas untuk menghitung luas persegi
    @Override
    double luas() {
        return sisi * sisi;
    }

    // Implementasi method keliling untuk menghitung keliling persegi
    @Override
    double keliling() {
        return 4 * sisi;
    }
}

// Kelas Lingkaran, turunan dari BangunDatar
class Lingkaran extends BangunDatar {
    double radius; // Variabel untuk menyimpan jari-jari lingkaran

    // Constructor untuk menginisialisasi radius
    Lingkaran(double radius) {
        this.radius = radius;
    }

    // Implementasi method luas untuk menghitung luas lingkaran
    @Override
    double luas() {
        return Math.PI * radius * radius;
    }

    // Implementasi method keliling untuk menghitung keliling lingkaran
    @Override
    double keliling() {
        return 2 * Math.PI * radius;
    }
}

// Kelas Segitiga, turunan dari BangunDatar
class Segitiga extends BangunDatar {
    double alas, tinggi, sisi1, sisi2, sisi3; // Variabel untuk menyimpan panjang sisi dan tinggi segitiga

    // Constructor untuk menginisialisasi nilai alas, tinggi, dan ketiga sisi segitiga
    Segitiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    // Implementasi method luas untuk menghitung luas segitiga
    @Override
    double luas() {
        return 0.5 * alas * tinggi;
    }

    // Implementasi method keliling untuk menghitung keliling segitiga
    @Override
    double keliling() {
        return sisi1 + sisi2 + sisi3;
    }
}

// Kelas utama untuk menjalankan program
public class MainBandat {

    public static void main(String[] args) {
        // Membuat objek dari masing-masing bangun datar dan mengisi nilai
        BangunDatar persegi = new Persegi(4); // Persegi dengan sisi 4
        BangunDatar lingkaran = new Lingkaran(7); // Lingkaran dengan radius 7
        BangunDatar segitiga = new Segitiga(6, 8, 5, 6, 7); // Segitiga dengan alas 6, tinggi 8, dan sisi 5,6,7

        // Menampilkan hasil perhitungan luas dan keliling masing-masing bangun datar
        System.out.println("Luas Persegi: " + persegi.luas());
        System.out.println("Keliling Persegi: " + persegi.keliling());

        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());

        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga: " + segitiga.keliling());
    }
    
}
