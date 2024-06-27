/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public class Persegi extends Titik {
    private double sisiPSG;

    public Persegi(double x3, double y3, double x4, double y4)
    {
        super(x3, y3);
        this.sisiPSG = super.hitungJarak(new Titik(x4, y4));
    }

    public double hitungLuas()
    {
        return (this.sisiPSG * this.sisiPSG);
    }

    public void tampil()
    {
        System.out.println("\n=============== Data Persegi ================");
        super.tampil();
        System.out.println("Panjang Sisi Persegi     : " + this.sisiPSG);
        System.out.println("Luas Persegi             : " + hitungLuas());
        System.out.println("---------------------------------------------\n");
    }
}