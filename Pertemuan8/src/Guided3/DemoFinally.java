/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided3;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public class DemoFinally{ 
    public static void main (String [] args){ 
        int x = 3; 
        int [] arr = {10,11,12};
        try{
            System.out.println(arr[x]); 
            System.out.println("Tidak terjadi exception"); 
        }catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println("Terjadi exception"); 
            System.out.println(arr[x-4]); 
        } 
        finally { 
        System.out.println("Program Selesai"); 
        } 
    } 
}