/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
abstract class Dosen {
    protected String nidn;
    protected String nama;
    protected String prodi;
    protected double gaji;
    
    public Dosen(String nidn, String nama, String prodi, double gaji)
    {
        this.nidn = nidn;
        this.nama = nama;
        this.prodi = prodi;
        this.gaji = gaji;
    }
    
    void tampilData()
    {
        System.out.println("NIDN           : " + nidn);
        System.out.println("Nama           : " + nama);
        System.out.println("Prodi          : " + prodi);
        System.out.println("Gaji           : " + gaji);
    }
    
    abstract double hitungPajak();
    
    abstract double hitungTotalGaji();
}