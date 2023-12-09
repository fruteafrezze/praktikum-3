/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum20september2023;

/**
 *
 * @author FILIPUS FERRY
 */
public class nomor7 {
    public static void main(String[] args) {
        double a, b, c, diskriminan, xp, yp;
        a = 3;
        b = 6;
        c = 9;
        diskriminan = b*b-4*a*c;
        xp = (-b)/2*a;
        yp = diskriminan/(-4*a);
        
        System.out.println("""
                           Diketahui kurva persamaan kuadrat dan tentuksn titik puncak parabola
                           (Xp,Yp) dengan ketentuan a, b, dan c yang telah ditentukan.""");
        System.out.println("a = "+a);     
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("Maka nilai dari (xp,yp) adalah ("+xp+", "+yp+")");
    }
}
