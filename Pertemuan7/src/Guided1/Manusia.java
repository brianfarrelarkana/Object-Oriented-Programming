/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public class Manusia {

    private String nama;
    private int umur;
    private Manusia ibu;
    private Manusia anak;
    //Letak asosiasi, kelas anak jadi variabel  
    public Manusia() { }
    public Manusia(String nm, int umr)
    {
        nama = nm;
        umur = umr;
        ibu = new Manusia();
        anak = new Manusia();
        ibu = null;
        anak = null;
    }
    public Manusia(String nm, int umr, Manusia ibu_angkat)
    {
        nama = nm;
        umur = umr;
        ibu = new Manusia();
        anak = new Manusia();
        ibu = ibu_angkat;
        ibu_angkat.anak = this;
    }
    //Relasi yang menunjukkan asosiasi 
    public void adopsi(Manusia anak_angkat)
    {
        anak = anak_angkat;
        anak_angkat.ibu = this;
    }
    public void cetak()
    {
        System.out.println("\n- Data Pribadi -");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        if (ibu != null) {
            System.out.println("Nama ibu : " + ibu.nama);
        } else if (anak != null) {
            System.out.println("Nama anak : " + anak.nama);
        }
    }
}