/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor2a;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public class Main {
    public static void main(String[] args){
        Engine engine = new Engine(5000, "V12");
        Mobil mobilbermesin = new Mobil(0);
        mobilbermesin.setEngine(engine);
        
        mobilbermesin.Start();
        mobilbermesin.Run();
        mobilbermesin.Stop();
        
        System.out.println("\n");
        
        Mobil mobiltakbermesin = new Mobil(0);
        
        mobiltakbermesin.Start();
        mobiltakbermesin.Run();
        mobiltakbermesin.Stop();
    }
}