/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352)
 */
public class Buku {
    private String judul;
    private String pengarang;
    private int jumlah;
    
    public void setNilai(String judul, String pengarang, int jumlah)
    {
        this.judul = judul;
        this.pengarang = pengarang;
        this.jumlah = jumlah;
    }
    void cetakKeLayar(){
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah : " + jumlah);
    }
    public static void main(String[] args)
    {
        Buku a = new Buku();
        a.setNilai("Jurassic Park", "Michael Crichton", 21);
        a.cetakKeLayar();
    }
    
}
