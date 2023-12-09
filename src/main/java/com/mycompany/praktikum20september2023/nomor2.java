/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum20september2023;

/**
 *
 * @author FILIPUS FERRY
 */
public class nomor2 {
    public static void main(String[] args) {
        double hargaBarang, diskon, hargaDiskon, totalHarga, potonganHarga, hargaSatuan;
        int jumlahBarang;
        
        hargaBarang = 5000;
        diskon = 0.2;
        jumlahBarang = 4;
        totalHarga = hargaBarang*jumlahBarang;
        potonganHarga = diskon*totalHarga;
        hargaDiskon = totalHarga-potonganHarga;
        hargaSatuan = hargaDiskon/jumlahBarang;
        
        System.out.println("diketahui bahwa harga barang "+hargaBarang);
        System.out.println("dengan jumlah barang yang dibeli "+jumlahBarang);
        System.out.println("namun, mendapatkan diskon sebesar 20%");
        System.out.println("harga diskon dari barang tersebut adalah "+hargaDiskon);
        System.out.println("Harga asli satuan barang yang dijual setelah dipotong diskon adalah "+hargaSatuan);
        
        
    }
}
