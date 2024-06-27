/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
interface SedanInterface
{
    void tampilInfo();
}

public class MiniBus extends Bus implements SedanInterface {
    String tipe;

    public MiniBus() //konstruktor default
    {
        super();
        this.tipe = "Data Kosong";
    }

    public void setMiniBus(String tipe352) //konstruktor buatan dengan parameter
    {
        tipe = tipe352;
    }

    //method
    public void infoMiniBus()
    {
        System.out.println("Tipe MiniBus : " + tipe);
        
        if (tipe.equals("Pribadi")) {
            System.out.println("Digunakan sebagai kendaraan pribadi");
        } else if (tipe.equals("Wagon")) {
            System.out.println("Digunakan sebagai kendaraan angkut/travel");
        } else {
            System.out.println("Tipe MiniBus tidak valid");
        }
    }

        public float hitungPajak()
    {
        float pajakSedan = super.hitungPajak();
        float pajakBus = super.hitungPajak();

        if (tipe.equals("Pribadi")) {
            float pajakMiniBus = (pajakSedan * 0.05f) + (pajakBus * 0.03f);
            System.out.println("Pajak MiniBus: Rp " + pajakMiniBus);
            return pajakMiniBus;
        } else if (tipe.equals("Wagon")) {
            float pajakMiniBus = (pajakSedan * 0.03f) + (pajakBus * 0.05f);
            System.out.println("Pajak MiniBus: Rp " + pajakMiniBus);
            return pajakMiniBus;
        } else {
            System.out.println("Tipe MiniBus tidak valid, penghitungan pajak tidak dapat dilakukan");
            return 0;
        }
    }
        
    public void tampilInfo()
    {
        super.tampilInfo();
        infoBus();
        infoMiniBus();
    }
}