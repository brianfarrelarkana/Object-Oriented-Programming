/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor2a;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public class Engine {
    private int cc;
    private String merk;
    
    public Engine(int cc, String merk)
    {
        this.cc = cc;
        this.merk = merk;
    }
    
    public void on()
    {
        System.out.println("Ck Ck Ck Grum Grumm....\n");
    }
    
    public void off()
    {
        System.out.println("Tit Tit pssstt....\n");
    }
}