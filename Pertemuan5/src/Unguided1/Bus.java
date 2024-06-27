/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public class Bus extends Mobil {
    int kapasitasPenumpang, kapasitasBagasi;
    
    public Bus() //konstruktor default
    {
        super();
        this.kapasitasPenumpang = 0;
        this.kapasitasBagasi = 0;
    }
    
    public void setBus(int kapasitasPenumpang352, int kapasitasBagasi352) //konstruktor buatan dengan parameter
    {
        super.setMobil(noPlat, merk, pajak);
        kapasitasPenumpang = kapasitasPenumpang352;
        kapasitasBagasi = kapasitasBagasi352;
    }
    
    //method
    public void infoBus()
    {
        System.out.println("Kapasitas Penumpang : " + kapasitasPenumpang + " orang");
        System.out.println("Kapasitas Bagasi    : " + kapasitasBagasi + " liter");
    }
    
    public float hitungPajak()
    {
    float pajakBus = pajak + (pajak * kapasitasPenumpang * kapasitasBagasi * 0.00005f);
    System.out.println("Pajak Bus: Rp " + pajakBus);
    return pajakBus;
    }
    
    public void tampilInfo()
    {
        super.tampilInfo();
        infoBus();
        hitungPajak();
    }
}