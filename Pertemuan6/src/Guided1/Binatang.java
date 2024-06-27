/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public abstract class Binatang {
    Binatang(String jenis)
    {
        this.jenis = jenis;
    }
    protected abstract void suara(); //Deklarasi, tidak didefinisikan
    public String toString()
    {
        return "Seekor " + jenis;
    }
    private String jenis;
}