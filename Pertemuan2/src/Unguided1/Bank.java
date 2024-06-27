/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352)
 */

import java.util.Scanner;

public class Bank {
    private int saldo352;
    Scanner input352 = new Scanner(System.in);

    public Bank(int saldo352)
    {
        this.saldo352 = saldo352;
    }

    void simpanUang()
    {
        System.out.print("\nSimpan uang : Rp. ");
        int simpan352 = input352.nextInt();
        saldo352 = saldo352 + simpan352;
        System.out.println("Saldo saat ini : Rp. " + saldo352);
    }

    void ambilUang()
    {
        System.out.print("\nAmbil uang : Rp. ");
        int ambil352 = input352.nextInt();
        saldo352 = saldo352 - ambil352;
        System.out.println("Saldo saat ini : Rp. " + saldo352);
    }

    void getSaldo()
    {
        System.out.println("\nSaldo saat ini : Rp. " + saldo352);
    }
}