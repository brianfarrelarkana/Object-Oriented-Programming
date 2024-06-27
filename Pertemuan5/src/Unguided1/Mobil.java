/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public class Mobil {
    String noPlat, merk;
    float pajak;
    
    public Mobil() //konstruktor default
    {
        this.noPlat = "Data Kosong";
        this.merk = "Data Kosong";
        this.pajak = 0;
    }
    
    public void setMobil(String noPlat352,String merk352, float pajak352) //konstruktor buatan dengan parameter
    {
        noPlat = noPlat352;
        merk = merk352;
        pajak = pajak352;
    }
    
    public void tampilInfo() //method
    {
        System.out.println("Nomor Plat : " + noPlat);
        System.out.println("Merk       : " + merk);
        System.out.println("Pajak      : Rp " + pajak);
    }
}