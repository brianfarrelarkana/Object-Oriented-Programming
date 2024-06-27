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
public class SalariedEmployee extends Employees {
    private double upahMingguan352;
    
    public SalariedEmployee(String nama352, int nip352, double upahMingguan352)
    {
        super(nama352, nip352);
        this.upahMingguan352 = upahMingguan352;
    }
    
    public double hitungGaji()
    {
        return(upahMingguan352);
    }
    
    public void cetakInfo()
    {
        DecimalFormat df352 = new DecimalFormat("0.00");
        System.out.println("=====================");
        System.out.println("  Salaried Employee  ");
        System.out.println("---------------------");
        System.out.println("Nama : " + employeeName());
        System.out.println("NIP  : " + employeeNIP());
        System.out.println("Gaji : " + df352.format(hitungGaji()));
        System.out.println("=====================\n");
    }
}