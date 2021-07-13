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
class Triangle extends Geometry{
    private double width;
    private double height;
    private double area;
    private final double fml = 0.5;
    
    @Override
    public void setValue(double width, double height){
        if (width <= 0){
            System.out.println("Width must greater than 0");
            return;
        }
        if (height <= 0){
            System.out.println("Height must greater than 0");
            return;
        }
        this.width = width;
        this.height = height;
        area = fml * height * width;
    }
    
    @Override
    public void getValue(){
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
    }

    @Override
    public String toString(){
        return String.format("This triangle area is: %.2f", area);
    }
}