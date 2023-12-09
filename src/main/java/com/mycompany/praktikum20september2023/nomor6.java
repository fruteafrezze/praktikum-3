/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum20september2023;

/**
 *
 * @author FILIPUS FERRY
 */
public class nomor6 {
    public static void main(String[] args) {
        double jariJari, tinggi, phi, luas, volume;
        jariJari = 14;
        tinggi = 30;
        phi = (22.0/7.0);
        volume = (1.0/3.0)*phi*jariJari*jariJari*tinggi;
        luas = phi*jariJari*jariJari+phi*jariJari*jariJari*tinggi;
        
        System.out.println("""
                           Diketahui bahwa kerucut memiliki jari-jari sebesar 14
                           dan tinggi sebesar 30, dengan phi 22/7. 
                           Maka volume dan luas sellimut kerucut tersebut sebagai berikur:
                           """+"("+volume+")\s("+luas+")");
        
    }
}
