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
        Geometry geo1 = new Circle();
        geo1.setValue(2);
        System.out.println(geo1);
        
        Geometry geo2 = new Square();
        geo2.getValue();
    }
}
