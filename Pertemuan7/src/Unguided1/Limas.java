/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public class Limas {
    private SgtSamaSisi sgt;
    private Persegi psg;

    public Limas(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
    {
        this.sgt = new SgtSamaSisi(x1, y1, x2, y2);
        this.psg = new Persegi(x3, y3, x4, y4);
    }

    public double hitungLuas()
    {
        return ((4 * sgt.hitungLuas()) + psg.hitungLuas());
    }

    public void tampil()
    {
        sgt.tampil();
        psg.tampil();
        System.out.println("\n================ Data Limas =================");
        System.out.println("Luas Permukaan Limas     : " + hitungLuas());
        System.out.println("---------------------------------------------\n");
    }
}