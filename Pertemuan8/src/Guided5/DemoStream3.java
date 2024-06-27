/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided5;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
import java.io.*; 
public class DemoStream3 { 
    public static void main(String[] args) throws IOException { 
        char data; 
        String str = ""; 
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.print("Ketik : "); 
        data = (char) buff.read(); 
        while (data!='\r') { 
        str+=data; 
        data = (char) buff.read(); 
    } 
    System.out.println("Yang diketik : "+str); 
    System.out.println("Program Selesai"); 
    } 
}