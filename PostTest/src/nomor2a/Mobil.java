/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor2a;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public class Mobil {
    private int status;
    private Engine engine;
    
    public Mobil(int status)
    {
        this.status = status;
    }
    
    public void setEngine(Engine engine)
    {
        this.engine = engine;
    }
    
    public void Start()
    {
        if (engine != null)
        {
            engine.on();
        } else {
            System.out.println("Tidak ada mesin\n");
        }
    }
    
    public void Run()
    {
        if (engine != null)
        {
            System.out.println("Brum Brum Nguenggg\n");
        } else {
            System.out.println("Tidak ada mesin\n");
        }
    }
    
    public void Stop()
    {
        if (engine != null)
        {
            engine.off();
        } else {
            System.out.println("Tidak ada mesin\n");
        }
    }
}