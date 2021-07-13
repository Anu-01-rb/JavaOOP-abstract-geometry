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
class Circle extends Geometry{
    private double radius;
    private final double pi = 22.0/7;
    private double area;
    
    @Override
    public void getValue(){
        System.out.println("Radius: "+radius);
    }
    
    @Override
    public void setValue(double radius){
        if (radius <= 0){
            System.out.println("Radius must greater than 0");
            return;
        }
        this.radius = radius;
        area = (this.pi * Math.pow((this.radius),2));
    }
    
    @Override
    public String toString(){
        return String.format("This circle area is: %.2f", area);
    }
}
