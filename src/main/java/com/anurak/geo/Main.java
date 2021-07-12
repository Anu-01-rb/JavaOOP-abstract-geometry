/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.geo;

/**
 *
 * @author anurak
 */
public class Main {
    public static void main(String[] args) {
        
        Geo cir1 = new Geo();
        Geo cir2 = new Geo();
        
        
        cir1.setRadius(4);
        System.out.println(cir1);
        
        cir2.setLength(4);
        System.out.println(cir2);
    }
}
