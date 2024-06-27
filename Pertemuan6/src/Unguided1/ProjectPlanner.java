/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
import java.text.DecimalFormat;
public class ProjectPlanner extends Employees {
    private double gajiPokok352;
    private double komisi352;
    private int totalHasilProyek352;
    
    public ProjectPlanner(String nama352, int nip352, double gajiPokok352, double komisi352, int totalHasilProyek352)
    {
        super(nama352, nip352);
        this.gajiPokok352 = gajiPokok352;
        this.komisi352 = komisi352;
        this.totalHasilProyek352 = totalHasilProyek352;
    }
    
    public double hitungGaji()
    {
        return(gajiPokok352 + (komisi352 * totalHasilProyek352) - (gajiPokok352 * 5/100));
    }
    
    public void cetakInfo()
    {
        DecimalFormat df352 = new DecimalFormat("0.00");
        System.out.println("=====================");
        System.out.println("   Project Planner   ");
        System.out.println("---------------------");
        System.out.println("Nama : " + employeeName());
        System.out.println("NIP  : " + employeeNIP());
        System.out.println("Gaji : " + df352.format(hitungGaji()));
        System.out.println("=====================\n");
    }
}