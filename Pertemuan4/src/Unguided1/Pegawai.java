/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */

/*Kelas Induk*/

public class Pegawai {
    protected String nip352;
    protected String nama352;
    protected String alamat352;
    protected int tahunMasuk352;
    protected int gajiPokok352;
    protected int jamLembur352;
    protected String divisi352;
    protected int pelangganDirekrut352;
    protected int tunjanganJabatan352;
    protected int gajiAkhir352;
    
    public void HitungGajiAkhir(int GajiPokok352, int JamLembur352)
    {
        gajiPokok352 = GajiPokok352;
        gajiAkhir352 = (int) (gajiPokok352 + (10000 * jamLembur352));
    }
    public void HitungGajiAkhir(int GajiPokok352)
    {
        gajiPokok352 = GajiPokok352;
        gajiAkhir352 = (int) (gajiPokok352 + (50000 * pelangganDirekrut352));
    }
    public void HitungGajiAkhir(int GajiPokok352, int TahunMasuk352, int TunjanganJabatan352)
    {
        gajiPokok352 = GajiPokok352;
        tahunMasuk352 = TahunMasuk352;
        if (TahunMasuk352 == 2012){
            tunjanganJabatan352 = GajiPokok352 * 5 / 100;
            gajiAkhir352 = (int) (gajiPokok352 + tunjanganJabatan352);
        } else {
            if (TahunMasuk352 < 2010){
                tunjanganJabatan352 = GajiPokok352 * 10 / 100;
                gajiAkhir352 = (int) (gajiPokok352 + tunjanganJabatan352);
            } else {
                System.out.println("Belum ada tunjangan jabatan");
            }
        }
    }
    
    public int getGajiAkhir()
    {
        return gajiAkhir352;
    }
}