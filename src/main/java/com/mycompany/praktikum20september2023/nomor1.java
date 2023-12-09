/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum20september2023;

import java.util.Scanner;

/**
 *
 * @author FILIPUS FERRY
 */
public class nomor1 {
    public static void main(String[] args) {
        int makan, lauk, minum;
        double hargaMakan, hargaLauk, hargaMinum, hargaTotal;
        Scanner jumlahTagihan = new Scanner(System.in);
        
        makan = 2;
        lauk = 3;
        minum = 2;
        hargaMakan= 8000;
        hargaLauk= 3000;
        hargaMinum= 2000;
        
        hargaTotal= makan*hargaMakan+lauk*hargaLauk+minum*hargaMinum;
        
        System.out.print(""" 
                         WARUNG MAKAN RAPAYUPAYU
                         
                         DAFTAR HARGA
                         MAKAN+SAYUR = 8000
                         SEMUA LAUK = 3000
                         SEMUA MINUM = 2000
                         
                           """);
        System.out.println("total tagihan yang harus dibayar jika jumlah total makan sebagai berikut");
        System.out.println("makan =\s"+makan);
        System.out.println("lauk =\s"+lauk);
        System.out.println("minum =\s"+minum);
        System.out.println("harga total yang harus dibayar "+hargaTotal);
        
        
                
    }
}
