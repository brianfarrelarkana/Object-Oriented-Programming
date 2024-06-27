/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public class DosenTidakTetap extends Dosen {
    private int jmlTatapMuka;
    
    public DosenTidakTetap(String nidn, String nama, String prodi, double gaji, int jmlTatapMuka)
    {
        super(nidn, nama, prodi, gaji);
        this.jmlTatapMuka = jmlTatapMuka;
    }
    
    void tampilData()
    {
        System.out.println("=== Data Dosen Tidak Tetap ===");
        super.tampilData();
        System.out.println("Jml Tatap Muka : " + jmlTatapMuka);
        System.out.println("Total Gaji     : " + hitungTotalGaji() + "\n");
    }

    double hitungPajak()
    {
        return gaji*5/100;
    }

    double hitungTotalGaji()
    {
        return (gaji-hitungPajak())+(jmlTatapMuka*25000);
    }
}