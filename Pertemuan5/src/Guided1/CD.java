/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */

/**Kelas CD*/

public class CD {
    String ukuran;
    long hargaCD;
    public CD(String ukuran,long hargaCD)
    {
        this.ukuran=ukuran;
        this.hargaCD=hargaCD;
    }
    public long getHargaCD()
    {
        return hargaCD;
    }
    public void cetakCD()
    {
        System.out.println("Ukuran CD : "+ukuran);
        System.out.println("Harga CD  : Rp "+hargaCD);
        System.out.println();
    }
}