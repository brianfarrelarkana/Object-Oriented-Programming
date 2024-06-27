/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public class Anjing extends Binatang {
    Anjing(String nama)
    {
        super("Anjing");
        this.nama = nama;
    }
    public void suara()
    {
        System.out.println("menggonggong");
    }
    public String toString()
    {
        return super.toString() + " " + nama;
    }
    private String nama;
}