/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided2;

/**
 *
 * @author Brian Farrel Arkana (2211102352)
 */
public class Buku2 {
    private String judul;
    private String pengarang;
    
    public Buku2()  //konstruktor default
    {
        judul = "Tidak diketahui";
        pengarang = "Tidak diketahui";
    }
    
    public Buku2(String judul, String pengarang) //konstraktor parameter
    {
        System.out.println("konstruktor buku sedang dijalankan...");
        this.judul = judul;
        this.pengarang = pengarang;
    }
    
    void cetakKeLayar() //method
    {
        if(judul==null && pengarang==null)
        return;
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
    }
    
    public static void main(String[] args) //main method
    {
        Buku2 a,b = new Buku2();
        a = new Buku2("Siaga Merah", "Alistair Maclean");
        b = new Buku2();
        a.cetakKeLayar();
        b.cetakKeLayar();
    }
}