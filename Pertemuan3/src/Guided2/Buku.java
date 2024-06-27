/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided2;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
import java.io.*;
public class Buku {
    //atributes 
    private String pengarang; 
    private String judul; 
    private int jmlh_Halaman; 
    private float diskon; 
    private double harga; 
    //methods 
    public Buku() 
    {   
        //constructor 
        System.out.println("Konstruktor buku dijalankan..."); 
    } 
    //fungsi-fungsi mutator 
    public void setPengarang(String Pengarang) 
    { 
        pengarang=Pengarang; 
    } 
    public void setJudul(String Judul) 
    { 
        judul=Judul; 
    } 
    public void setJmlhHalaman(int JmlhHalaman) 
    { 
        jmlh_Halaman = JmlhHalaman; 
    } 
    //fungsi-fungsi accessor 
    public String getPengarang() 
    { 
        return pengarang; 
    } 
    public String getJudul() 
    { 
        return judul; 
    }
    public int getJmlhHalaman() 
    { 
        return jmlh_Halaman; 
    } 
    //method overloading 
    public void setInfo(float dskn, double HargaBuku) 
    { 
        diskon=dskn; 
        harga=HargaBuku-(HargaBuku*diskon); 
    } 
    public void setInfo(double HargaBuku) 
    { 
        diskon=0.1F; 
        harga=HargaBuku-(HargaBuku*diskon); 
    } 
    public void cetak() 
    { 
    System.out.println("Judul Buku          : " + getJudul());   
    System.out.println("Pengarang Buku      : " + getPengarang());
    System.out.println("Jumlah halaman Buku : " + getJmlhHalaman() + " halaman"); 
    System.out.println("Diskon Buku         : " + diskon); 
    System.out.println("Harga Buku          : " + harga);
    System.out.println("");
    }
    //Main.java
    public static void main(String[] args) 
    { 
        Buku novel,fiksi; 
        novel=new Buku(); 
        fiksi=new Buku(); 
        System.out.println(); 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        try 
        { 
            System.out.print("Masukkan Judul Buku: "); 
            novel.setJudul(br.readLine().toString()); 
            System.out.print("Masukkan Pengarang: "); 
            novel.setPengarang(br.readLine().toString()); 
            novel.setInfo(0.2f,45000); 
            System.out.print("Masukkan Jumlah Halaman: "); 
            novel.setJmlhHalaman(Integer.parseInt(br.readLine().toString())); 
            novel.cetak(); 
            System.out.println(); 
            System.out.print("Masukkan Judul Buku: "); 
            fiksi.setJudul(br.readLine().toString()); 
            System.out.print("Masukkan Pengarang: "); 
            fiksi.setPengarang(br.readLine().toString()); 
            fiksi.setInfo(79000); 
            System.out.print("Masukkan Jumlah Halaman: "); 
            fiksi.setJmlhHalaman(Integer.parseInt(br.readLine().toString())); 
            fiksi.cetak(); 
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}