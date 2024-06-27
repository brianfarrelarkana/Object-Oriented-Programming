/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public class Main {
    public static void main(String args[])
    {
        Employees emp;
        SalariedEmployee se = new SalariedEmployee("Brian", 352, 5000000.00);
        emp = se;
        CommissionEmployee ce = new CommissionEmployee("Farrel", 235, 10000000.00, 100000.00, 100);
        emp = ce;
        ProjectPlanner pp = new ProjectPlanner("Arkana", 532, 15000000.00, 250000.00, 25);
        emp = pp;
        
        System.out.println("---------------------");
        System.out.println("| DATA GAJI PEGAWAI |");
        System.out.println("---------------------\n");
        
        se.cetakInfo();
        ce.cetakInfo();
        pp.cetakInfo();
        
        System.exit(0);
    }
}