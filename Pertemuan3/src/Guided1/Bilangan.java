/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public class Bilangan {
    private int a; 
    private int b; 
    public Bilangan(int a, int b)  
    { 
        this.a=a; 
        this.b=b; 
    } 
    public void tampil()  
    { 
        System.out.println("Nilai bil.a : "+a); 
        System.out.println("Nilai bil.b : "+b); 
    } 
    //passed by value dengan parameter tipe data primitif 
    public void operasi_pass_by_value(int x, int y)  
    { 
        x = x*10; 
        y = y+15; 
    } 
    //passed by reference dengan parameter tipe data class 
    public void operasi_pass_by_reference(Bilangan bil)  
    { 
        bil.a = bil.a*10; 
        bil.b = bil.b+15; 
    }
    //Main.java
    public static void main(String[] args)  
    { 
        int x,y; 
        Bilangan bil=new Bilangan(10,20); 
        //inisialisasi x dan y 
        x=15; 
        y=30; 
        System.out.println("Nilai x dan y sebelum passed by value"); 
        System.out.println("Nilai x : "+x); 
        System.out.println("Nilai y : "+y); 
        bil.operasi_pass_by_value(x,y); //passed by value 
        System.out.println("Nilai x dan y setelah passed by value"); 
        System.out.println("Nilai x : "+x); 
        System.out.println("Nilai y : "+y); 
        System.out.println("\nNilai bil.a dan bil.b sebelum passed by reference"); 
        bil.tampil(); 
        bil.operasi_pass_by_reference(bil); //passed by reference 
        System.out.println("Nilai bil.a dan bil.b setelah passed by reference"); 
        bil.tampil();
    }
}