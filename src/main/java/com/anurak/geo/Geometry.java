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
public class Geometry{
    private String type;
    private double area;
    
    void setType(String type){
        this.type = type;
    }
    
    void setArea(double area){
        this.area = area;
    }
    
    @Override
    public String toString(){
        return String.format("This area geometry is: %.2f", area);
    }
}

class Circle extends Geometry{
    private double radius;
    private final double pi = 22.0/7;
    
    Circle(){
        setType("Circle");
    }
    
    void getRadius(){
        System.out.println("Radius: "+radius);
    }
    
    public void setRadius(double radius){
        if (radius <= 0){
            System.out.println("Radius must greater than 0");
            return;
        }
        this.radius = radius;
        setArea(Math.pow(this.radius, pi));
    }
}

class Square extends Geometry{
    private double length;
    
    Square(){
        setType("Square");
    }
    
    void getLength(){
        System.out.println("Length: "+length);
    }
    
    public void setLength(double len){
        if (len <= 0){
            System.out.println("Length must greater than 0");
            return;
        }
        this.length = len;
        setArea(this.length * this.length);
    }   
}

class Triangle extends Geometry{
    private double width;
    private double height;
    private final double fml = 0.5;
    
    Triangle(){
        setType("Triangle");
    }
    
    void setWidth(double width){
        if (width <= 0){
            System.out.println("Width must greater than 0");
            return;
        }
        this.width = width;
    }   
    
    void setHeight(double height){
        if (height <= 0){
            System.out.println("Height must greater than 0");
            return;
        }
        this.height = height;
    }
    
    void getWidth(){
        System.out.println("Width: "+width);
    }
    void getHeight(){
        System.out.println("Height: "+height);
    }
}