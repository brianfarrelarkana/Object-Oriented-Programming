/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided2;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public class CobaThrow{ 
    public static void methodLain() { 
        try{ 
            throw new ArrayIndexOutOfBoundsException(1); 
        }catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println("Penanganan exception dalam method methodLain()"); 
            throw e; 
        } 
}
public static void main (String [] args){ 
    try{ 
        methodLain(); 
        }catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("Penanganan exception dalam method main()"); 
        }  
    } 
}