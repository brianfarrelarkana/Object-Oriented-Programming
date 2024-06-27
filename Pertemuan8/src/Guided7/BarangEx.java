/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided7;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */
import java.io.*; 
public class BarangEx implements Externalizable{ 
    private String nama; 
    private int jumlah; 
    
    public BarangEx(){          //konstruktor 1 
    } 
    
    public BarangEx(String nm, int jml){    //konstruktor 2
        nama=nm; 
        jumlah=jml;
    } 
    public void writeExternal(ObjectOutput out) throws IOException{ 
        out.writeObject(nama); //string adalah tipe data referensi 
        out.writeInt(jumlah); 
    } 

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException{ 
        this.nama = (String) in.readObject(); 
        this.jumlah= in.readInt(); 
    } 
    public String toString(){ 
        return "data barang: "+nama+"\n"+"jumlah barang: "+jumlah; 
    } 
    public static void simpanObjek(BarangEx brg) throws IOException{ 
        FileOutputStream fos = new FileOutputStream("dtEx.txt"); 
        ObjectOutputStream oos=new ObjectOutputStream(fos); 
        oos.writeObject(brg); 
        oos.flush(); 
    } 
    public static BarangEx bacaObjek() throws ClassNotFoundException,IOException{ 
        FileInputStream fis= new FileInputStream("dtEx.txt"); 
        ObjectInputStream ois = new ObjectInputStream(fis); 
        return(BarangEx)ois.readObject(); 
    } 
    public static void main(String[] args) throws ClassNotFoundException,IOException{ 
        BarangEx awal = new BarangEx("sepatu",2); 
        simpanObjek(awal); 
        System.out.println(bacaObjek()); 
    } 
}