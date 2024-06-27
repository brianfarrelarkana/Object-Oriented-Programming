/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public class Sedan extends Mobil{
    String fasilitasKeamanan, fasilitasKenyamanan;
    int kapasitasCC;
    
    public Sedan() //konstruktor default
    {
        super();
        this.fasilitasKeamanan = "Data Kosong";
        this.fasilitasKenyamanan = "Data Kosong";
        this.kapasitasCC = 0;
    }
    
    public void setSedan(String fasilitasKeamanan352, String fasilitasKenyamanan352, int kapasitasCC352) //konstruktor buatan dengan parameter
    {
        super.setMobil(noPlat, merk, pajak);
        fasilitasKeamanan = fasilitasKeamanan352;
        fasilitasKenyamanan = fasilitasKenyamanan352;
        kapasitasCC = kapasitasCC352;
    }
    
    //method
    public void infoSedan()
    {
        System.out.println("Fasilitas Keamanan   : " + fasilitasKeamanan);
        System.out.println("Fasilitas Kenyamanan : " + fasilitasKenyamanan);
        System.out.println("Kapasitas CC         : " + kapasitasCC + " CC");
    }
    
    public float hitungPajak()
    {
    float pajakSedan = pajak + (pajak * kapasitasCC * 0.00005f);
    System.out.println("Pajak Sedan: Rp " + pajakSedan);
    return pajakSedan;
    }
    
    public void tampilInfo()
    {
        super.tampilInfo();
        infoSedan();
        hitungPajak();
    }
}