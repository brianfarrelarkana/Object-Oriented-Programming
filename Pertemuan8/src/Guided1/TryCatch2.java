/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public class TryCatch2 { 
    public static void main (String [] args){ 
        try{ 
            int x = args.length; //banyak argumen 
            int y = 100/x; 
            int[] arr = {10,11}; 
            y = arr[x]; 
            System.out.println("Tidak terjadi exception"); 
        }catch (ArithmeticException e){ 
            System.out.println("Terjadi exeption karena pembagian dengan nol"); 
        }catch (ArrayIndexOutOfBoundsException e){ 
            System.out.println("Terjadi exeption karena indeks di luar kapasitas array"); 
        } 
        System.out.println("Setelah blok try catch"); 
    } 
} 