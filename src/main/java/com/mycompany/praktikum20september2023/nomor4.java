/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum20september2023;

/**
 *
 * @author FILIPUS FERRY
 */
public class nomor4 {
    public static void main(String[] args) {
        double us1, us2, uas, rerataUs1, rerataUs2, rerataUas, nilaiFinal;
        us1= 7.5;
        us2= 8.0;
        uas= 7.7;
        
        rerataUs1= 0.3*us1;
        rerataUs2= 0.3*us2;
        rerataUas= 0.49*uas;
        
        nilaiFinal=rerataUs1+rerataUs2+rerataUas;
        
        System.out.println("""
                           Salah satu mahasiswa di suatu Universita memiliki nilai sebagai berikut
                           Us 1 = 7.5 
                           Us 2 = 8.0
                           UAS = 7.7
                           """);
        System.out.println("Maka nilai Akhirnya adalah "+nilaiFinal);
        
    }
}
