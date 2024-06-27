/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public class SgtSamaSisi extends Titik {
    private double sisiSGT;

    public SgtSamaSisi(double x1, double y1, double x2, double y2)
    {
        super(x1, y1);
        this.sisiSGT = super.hitungJarak(new Titik(x2, y2));
    }

    public double hitungLuas()
    {
        return (0.5 * this.sisiSGT * Math.sqrt(3));
    }

    public void tampil()
    {
        System.out.println("\n=============== Data Segitiga ===============");
        super.tampil();
        System.out.println("Panjang Sisi Segitiga    : " + this.sisiSGT);
        System.out.println("Luas Segitiga            : " + hitungLuas());
        System.out.println("---------------------------------------------\n");
    }
}