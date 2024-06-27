/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public abstract class Employees {
    private String nama352;
    private int nip352;
    
    public Employees(String nama352, int nip352)
    {
        this.nama352 = nama352;
        this.nip352 = nip352;
    }
    
    public String employeeName()
    {
        return nama352;
    }
    
    public int employeeNIP()
    {
        return nip352;
    }
    
    protected abstract double hitungGaji();
    protected abstract void cetakInfo();
}