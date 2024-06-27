/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided2;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public final class Direktur extends Pegawai {
    private double gajiDirektur;
    private double dividenSaham;
    //Konstruktor Kelas Direktur
    public Direktur(String nama, double gaji, double dividen)
    {
        super(nama);
        setGajiDirektur(gaji);
        setDividen(dividen);
    }
    //mengeset gaji direktur
    public void setGajiDirektur(double gaji)
    {
        if(gaji > 0)
            gajiDirektur = gaji;
        else
            gajiDirektur = 0;
    }
    //mengeset hasil pembagian dividen keuntungan saham
    public void setDividen (double dividen)
    {
        if(dividen > 0)
            dividenSaham = dividen;
        else
            dividenSaham = 0;
    }
    //method yang mengembalikan nama
    public String nama()
    {
        return super.namaPegawai();
    }
    //Method yang mengembalikan jabatan
    public String jabatan()
    {
        return "Direktur";
    }
    //Method yang mengembalikan besar gaji direktur
    public double gajiPerBulan()
    {
        return gajiDirektur;
    }
    //Method yang mengembalikan besar dividen saham
    public double labaDividen()
    {
        return dividenSaham;
    }
    //Pengimplementasian / Pendefinisian method abstract dari kelas Pegawai
    //Method ini mengembalikan besar gaji direktur
    public double income()
    {
        return(gajiDirektur + dividenSaham);
    }
}