/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public class DosenTetap extends Dosen {
    private double tunjangan;
    
    public DosenTetap(String nidn, String nama, String prodi, double gaji, double tunjangan)
    {
        super(nidn, nama, prodi, gaji);
        this.tunjangan = tunjangan;
    }
    
    void tampilData()
    {
        System.out.println("=== Data Dosen Tetap ===");
        super.tampilData();
        System.out.println("Tunjangan      : " + tunjangan);
        System.out.println("Total Gaji     : " + hitungTotalGaji() + "\n");
    }

    double hitungPajak()
    {
        return gaji*5/100;
    }

    double hitungTotalGaji()
    {
        return (gaji-hitungPajak())+tunjangan;
    }
}