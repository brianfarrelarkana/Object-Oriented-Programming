/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */

/*Kelas Anak*/

public class Manajer extends Pegawai {
    
    public Manajer()
    {
        this.nama352 = "Data Kosong";
        this.nip352 = "Data Kosong";
        this.alamat352 = "Data Kosong";
        this.tahunMasuk352 = 0;
        this.gajiPokok352 = 0;
        this.divisi352 = "Data Kosong";
    }
    
    public void setManajer(String Nama352, String NIP352, String Alamat352, int TahunMasuk352, int GajiPokok352, String Divisi352)
    {
        nama352 = Nama352;
        nip352 = NIP352;
        alamat352 = Alamat352;
        tahunMasuk352 = TahunMasuk352;
        gajiPokok352 = GajiPokok352;
        divisi352 = Divisi352;
        HitungGajiAkhir(GajiPokok352, TahunMasuk352, tunjanganJabatan352);
    }
    
    public void cetakManajer()
    {
        System.out.println("\n----------DATA MANAJER----------");
        System.out.println("Nama       : " + nama352);
        System.out.println("Alamat     : " + alamat352);
        System.out.println("Gaji Pokok : " + gajiPokok352);
        System.out.println("Divisi     : " + divisi352);
        System.out.println("Gaji Akhir : " + getGajiAkhir());
        System.out.println("--------------------------------\n");
    }
}