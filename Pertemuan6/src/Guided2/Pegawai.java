/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided2;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public abstract class Pegawai {
    private String namaPeg;
    //konstruktor
    public Pegawai(String nama)
    {
        namaPeg = nama;
    }
    //method (get) untuk mengembalikan nama pegawai
    public String namaPegawai()
    {
        return namaPeg;
    }
    //method abstrak ini diwariskan ke semua kelas yang diturunkan dari kelas abstrak ini
    public abstract double income();
}