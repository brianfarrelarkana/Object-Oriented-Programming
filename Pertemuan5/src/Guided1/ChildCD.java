/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */

/**kelas ChildCD merupakan turunan dari CD dan mengimplementasikan interface InterfaceCD*/

public class ChildCD extends CD implements InterfaceCD {
    public ChildCD(String ukuran,long hargaCD)
    {
        super(ukuran,hargaCD);
    }
}