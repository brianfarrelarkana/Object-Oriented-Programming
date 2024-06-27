/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided2;

/**
 *
 * @author Brian Farrel Arkana (2211102352)
 */

import java.util.Scanner;

public class Titik {
    private int x;
    private int y;
    Scanner input352 = new Scanner(System.in);
    
    public Titik()
    {
        x = 0;
        y = 0;
    }
    
    public Titik(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    void inisialisasiTitik()
    {
        System.out.print("\nNilai titik (x) : ");
        x = input352.nextInt();
        System.out.print("Nilai titik (y) : ");
        y = input352.nextInt();
        System.out.println("Nilai titik (x,y) telah terisi");
    }
    
    void tampilTitik()
    {
        if(x==0 && y==0)
        {
            System.out.println("\nMasukkan nilai x dan y terlebih dahulu");
            return;
        }
        System.out.println("\nNilai titik (x,y) : (" + x + "," + y + ")");
    }
    
    void perkalianSkalar()
    {
        if(x==0 && y==0)
        {
            System.out.println("\nMasukkan nilai x dan y terlebih dahulu");
            return;
        }
        System.out.print("\nMasukkan nilai skalar : ");
        int skalar = input352.nextInt();
        this.x = skalar*x;
        this.y = skalar*y;
        System.out.println("Hasil perkalian skalar : " + "(" + x + "," + y + ")");
    }
    
    void pencerminanSumbuX()
    {
        if(x==0 && y==0)
        {
            System.out.println("\nMasukkan nilai x dan y terlebih dahulu");
            return;
        }
        this.y = -this.y;
        System.out.println("\nHasil pencerminan terhadap sumbu x : (" + x + "," + y + ")");
    }
    
    void pencerminanSumbuY()
    {
        if(x==0 && y==0)
        {
            System.out.println("\nMasukkan nilai x dan y terlebih dahulu");
            return;
        }
        this.x = -this.x;
        System.out.println("\nHasil pencerminan terhadap sumbu y : (" + x + "," + y + ")");
    }
    
    void jarak_2titik()
    {
        if(x==0 && y==0)
        {
            System.out.println("\nMasukkan nilai x dan y terlebih dahulu");
            return;
        }
        System.out.print("\nNilai titik kedua (x) : ");
        int a = input352.nextInt();
        System.out.print("Nilai titik kedua (y) : ");
        int b = input352.nextInt();
        double c352 = Math.sqrt(Math.pow(a-x, 2) + Math.pow(b-y, 2));
        System.out.print("Jarak antara dua titik : " + c352);
    }
    
    public static void main(String[] args)
        {
            Titik z = new Titik();
            int menu352 = 7;
            Scanner pilih352 = new Scanner(System.in);
            while (menu352 != 0)
            {
                System.out.println("\nMENU OPERASI TITIK");
                System.out.println("1. INISIALISASI TITIK");
                System.out.println("2. TAMPIL TITIK");
                System.out.println("3. PERKALIAN SKALAR TITIK");
                System.out.println("4. PENCERMINAN TERHADAP SUMBU X");
                System.out.println("5. PENCERMINAN TERHADAP SUMBU Y");
                System.out.println("6. JARAK ANTARA DUA TITIK");
                System.out.println("0. KELUAR");
                System.out.print("MASUKAN PILIHAN: ");
                menu352 = pilih352.nextInt();

                switch (menu352) {
                    case 1:
                        z.inisialisasiTitik();
                        break;

                    case 2:
                        z.tampilTitik();
                        break;

                    case 3:
                        z.perkalianSkalar();
                        break;
                        
                    case 4:
                        z.pencerminanSumbuX();
                        break;

                    case 5:
                        z.pencerminanSumbuY();
                        break;

                    case 6:
                        z.jarak_2titik();
                        break;
                }
            }
            System.out.println("\nANDA TELAH KELUAR");
        }
}