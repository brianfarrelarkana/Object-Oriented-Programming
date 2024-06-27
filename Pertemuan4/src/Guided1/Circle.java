/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */

/**Kelas Anak*/

public class Circle extends Point {
    private float radius; 
    // Konstruktor kelas Anak memanggil konstruktor kelas Induk 
    public Circle(float r, float a, float b) 
    { 
        super(a, b); 
        radius = r; 
        System.out.println("Konstruktor Circle dijalankan "); 
    } 
    // Method yang memanggil method Induk dari kelas induknya dengan menggunakan keyword super 
    public void cetakPoint() // redefinisi fungsi kelas induk 
    { 
        super.cetakPoint(); 
        System.out.println("Radius: "+radius); 
    }
}