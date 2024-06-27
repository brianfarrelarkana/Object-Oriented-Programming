/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
public class Main {
    public static void main(String[] args) {
        DosenTetap dosentetap = new DosenTetap("22111", "Brian", "S1 IF", 4000000, 1000000);
        dosentetap.tampilData();
        
        DosenTidakTetap dosentidaktetap = new DosenTidakTetap("02352", "Farrel", "S1 IF", 2000000, 8);
        dosentidaktetap.tampilData();
    }
}