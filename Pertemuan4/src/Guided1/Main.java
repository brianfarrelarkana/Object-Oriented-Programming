/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */

/**Main Method*/

public class Main {
    public static void main( String args[] ) 
    { 
        // Membuat instans dari kelas anak dan memanggil  method yang dimilikinya 
        Circle circle1=new Circle(6.5f, 8.2f, 1.9f); 
        circle1.cetakPoint(); 
        System.out.println(" "); 
        Circle circle2=new Circle (10, 5, 5); 
        circle2.cetakPoint(); 
    }
}