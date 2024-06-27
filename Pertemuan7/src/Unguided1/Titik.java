/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public class Titik {
    private double x;
    private double y;

    public Titik(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public void tampil()
    {
        System.out.println("Koordinat Titik Pertama  : [" + x + ", " + y + "]");
    }

    public double hitungJarak(Titik t2)
    {
        return (Math.sqrt(Math.pow((t2.x - this.x), 2) + Math.pow((t2.y - this.y), 2)));
    }
}