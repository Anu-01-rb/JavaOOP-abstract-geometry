/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.geo;

import java.lang.Math;

/**
 *
 * @author anurak
 */
public class Geo extends Circle{
    
}

class Circle extends Square{
    private double radius;
    private final double pi = 22.0/7;
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    @Override
    public String toString(){
        double area = Math.pow((pi * radius),2);
        return String.format("This area circle : %.2f", area);
    }
}

class Square {
    private double length;
    
    public void setLength(double len){
        this.length = len;
    }
    
    @Override
    public String toString(){
        return String.format("This area square : %.2f", (length * length));
    }
}
