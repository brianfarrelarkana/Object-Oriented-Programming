/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */

import java.io.*;

public class Pegawai352 {
    private int nip352;
    private String nama352;
    private String alamat352;
    private int jmlHariLembur352;
    private float gajiPokok352;
    private float totalGaji352;
    
    public Pegawai352() 
    {   
        //Konstruktor 
        System.out.println("Program Menghitung Total Gaji Pegawai"); 
    }
    
    //Fungsi mutator 
    public void setNIP352(int NIP352) 
    { 
        nip352 = NIP352; 
    } 
    public void setNama352(String Nama352) 
    { 
        nama352 = Nama352; 
    } 
    public void setAlamat352(String Alamat352) 
    { 
        alamat352 = Alamat352; 
    }
    public void setJmlHariLembur352(int JmlHariLembur352)
    {
        jmlHariLembur352 = JmlHariLembur352;
    }
    public void setGajiPokok352(float GajiPokok352)
    {
        gajiPokok352 = GajiPokok352;
    }
    
    //Fungsi accesor 
    public int getNIP352() 
    { 
        return nip352; 
    } 
    public String getNama352() 
    { 
        return nama352; 
    }
    public String getAlamat352() 
    { 
        return alamat352; 
    }
    public int getJmlHariLembur352() 
    { 
        return jmlHariLembur352; 
    }
    public float getGajiPokok352() 
    { 
        return gajiPokok352; 
    }
    
    //Method overloading 
    public void setTotalGaji352(float GajiPokok352, int JmlHariLembur352) 
    { 
        gajiPokok352 = GajiPokok352; 
        totalGaji352 = (float) (gajiPokok352 + (gajiPokok352 * JmlHariLembur352 * 0.01)); 
    }
    
    //Output akhir
    public void print352() 
    { 
    System.out.println("\n\nHasil Perhitungan Total Gaji");
    System.out.println("\nNIP Pegawai         : " + getNIP352());   
    System.out.println("Nama Pegawai        : " + getNama352());
    System.out.println("Alamat Pegawai      : " + getAlamat352()); 
    System.out.println("Jumlah Hari Lembur  : " + getJmlHariLembur352()); 
    System.out.println("Gaji Pokok          : " + gajiPokok352);
    System.out.println("Total Gaji          : " + totalGaji352);
    System.out.println("");
    }
    
    //Main.java
    public static void main(String[] args) 
    { 
        Pegawai352 pegawaiA; 
        pegawaiA=new Pegawai352();
        System.out.println(); 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        try 
        { 
            System.out.print("Masukkan NIP Pegawai        : "); 
            pegawaiA.setNIP352(Integer.parseInt(br.readLine()));
            System.out.print("Masukkan Nama Pegawai       : ");
            pegawaiA.setNama352(br.readLine());
            System.out.print("Masukkan Alamat Pegawai     : "); 
            pegawaiA.setAlamat352(br.readLine());
            System.out.print("Masukkan Jumlah Hari Lembur : "); 
            pegawaiA.setJmlHariLembur352(Integer.parseInt(br.readLine()));
            System.out.print("Masukkan Gaji Pokok Pegawai : "); 
            pegawaiA.setGajiPokok352(Float.parseFloat(br.readLine()));
            pegawaiA.setTotalGaji352(pegawaiA.getGajiPokok352(), pegawaiA.getJmlHariLembur352());
            pegawaiA.print352();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}