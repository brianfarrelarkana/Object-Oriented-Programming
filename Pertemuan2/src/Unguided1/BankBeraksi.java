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

public class BankBeraksi {
        public static void main(String[] args)
        {
            Bank x = new Bank(100000);
            int menu352 = 0;
            Scanner pilih352 = new Scanner(System.in);
            while (menu352 != 4)
            {
                System.out.println("\nSelamat Datang di Bank ABC");
                System.out.println("1. Simpan Uang");
                System.out.println("2. Ambil Uang");
                System.out.println("3. Tampil Saldo");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu yang akan anda lakukan : ");
                menu352 = pilih352.nextInt();

                switch (menu352) {
                    case 1:
                        x.simpanUang();
                        break;

                    case 2:
                        x.ambilUang();
                        break;

                    case 3:
                        x.getSaldo();
                        break;
                }
            }
            System.out.println("\nSampai bertemu di transaksi berikutnya");
        }
}