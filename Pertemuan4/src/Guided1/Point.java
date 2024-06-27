/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */

/**Kelas Induk*/

public class Point {
    protected float x,y; 
    // Konstruktor kelas Induk 
    public Point(float a, float b) 
    { 
        System.out.println("Konstruktor Point dijalankan "); 
        x = a; 
        y = b; 
    } 
    // Method kelas Induk 
    public void cetakPoint() // akan di-redefinisi di kelas anak 
    { 
    System.out.println("Point : ["+x+", "+y+"]"); 
    } 
}