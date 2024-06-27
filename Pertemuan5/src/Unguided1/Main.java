/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("\n==========Info Kendaraan==========");
        System.out.println("\n---------------Mobil---------------");
        Mobil mobil = new Mobil();
        mobil.setMobil("B 1214 N", "Camaro", 2000000);
        mobil.tampilInfo();
        System.out.println("-----------------------------------\n");

        System.out.println("\n----------------Bus----------------");
        Bus bus = new Bus();
        bus.setMobil("F 4123 L", "Mercedes", 3000000);
        bus.setBus(50, 200);
        bus.tampilInfo();
        System.out.println("-----------------------------------\n");

        System.out.println("\n---------------Sedan---------------");
        Sedan sedan = new Sedan();
        sedan.setMobil("R 8121 AN", "BMW M3", 5000000);
        sedan.setSedan("Alarm", "AC", 5000);
        sedan.tampilInfo();
        System.out.println("-----------------------------------\n");

        System.out.println("\n--------------MiniBus--------------");
        MiniBus miniBusP = new MiniBus();
        miniBusP.setMobil("R 1234 BC", "Elf", 2000000);
        miniBusP.setBus(10, 100);
        miniBusP.setMiniBus("Pribadi");
        miniBusP.tampilInfo();
        System.out.println("\n-----------------------------------\n");
        
        MiniBus miniBusW = new MiniBus();
        miniBusW.setMobil("R 4321 CB", "Suzuki", 1000000);
        miniBusW.setBus(5, 200);
        miniBusW.setMiniBus("Wagon");
        miniBusW.tampilInfo();
        System.out.println("==================================\n");
    }
}