/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author imro
 */
// Kelas Induk (Superclass)
class Vehicle {
    // Metode umum yang akan di-override oleh subclass
    void move() {
        System.out.println("Kendaraan sedang bergerak...");
    }
}

// Subclass Car (Mobil) yang mewarisi Vehicle
class Car extends Vehicle {
    // Override method move() dengan perilaku spesifik untuk mobil
    @Override
    void move() {
        System.out.println("Mobil melaju di jalan raya...");
    }
}

// Subclass Motorcycle (Motor) yang mewarisi Vehicle
class Motorcycle extends Vehicle {
    // Override method move() dengan perilaku spesifik untuk motor
    @Override
    void move() {
        System.out.println("Motor melaju dengan cepat...");
    }
}

// Subclass Bicycle (Sepeda) yang mewarisi Vehicle
class Bicycle extends Vehicle {
    // Override method move() dengan perilaku spesifik untuk sepeda
    @Override
    void move() {
        System.out.println("Sepeda dikayuh di jalur sepeda...");
    }
}

// Kelas utama untuk menjalankan program
public class MainKendaraan {
     public static void main(String[] args) {
        // Membuat array dari tipe Vehicle untuk menyimpan berbagai kendaraan
        Vehicle[] vehicles = {
            new Car(),         // Objek Mobil
            new Motorcycle(),  // Objek Motor
            new Bicycle()      // Objek Sepeda
        };

        // Loop untuk menjalankan method move() secara polimorfik
        for (Vehicle v : vehicles) {
            v.move();  // Polimorfisme: Method yang dipanggil tergantung pada objek aslinya
        }
    }
}
