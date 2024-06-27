/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided2;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
class Perusahaan {
    private String namaPer;
    private Pegawai peg[]; //Agregasi antara pegawai dan perusahaan
    private int counter;
    
    public Perusahaan(String namaPer)
    {
        this.namaPer = namaPer;
        counter = 0;
        peg = new Pegawai[3];
        System.out.println("Konstruktor perusahaan dijalankan...");
    }
    //Relasi agregasi antara pegawai dan perusahaan
    public void insertPegawai(Pegawai p)
    {
        peg[counter] = p;
        counter++;
    }
    public void tampilPer()
    {
        System.out.println("Perusahaan " + namaPer + " memiliki pegawai : ");
        for(int i = 0; i < counter; i++)
        {
            peg[i].tampilPeg();
        }
    }
}