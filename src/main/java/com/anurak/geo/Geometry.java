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
abstract class Geometry{
    
    void setValue(double radius){}
    void setValue(double width, double height){}
    void getValue(){}
    
    @Override
    public String toString(){
        return "The data is empty";
    }
}

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
    
//    public void setRadius(double radius){
//        if (radius <= 0){
//            System.out.println("Radius must greater than 0");
//            return;
//        }
//        this.radius = radius;
//        setArea(Math.pow(this.radius, pi));
//    }
    @Override
    public String toString(){
        return String.format("This circle area is: %.2f", area);
    }
}

class Square extends Geometry{
    private double length;
    private double area;
    
    @Override
    public void getValue(){
        System.out.println("Length: "+length);
    }
    
//    void getLength(){
//        System.out.println("Length: "+length);
//    }
    @Override
    public void setValue(double len){
        if (len <= 0){
            System.out.println("Length must greater than 0");
            return;
        }
        this.length = len;
        area = (this.length * this.length);
    }

    @Override
    public String toString(){
        return String.format("This square area is: %.2f", area);
    }
    
//    public void setLength(double len){
//        if (len <= 0){
//            System.out.println("Length must greater than 0");
//            return;
//        }
//        this.length = len;
//        setArea(this.length * this.length);
//    }   
}

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
    
//    void setWidth(double width){
//        if (width <= 0){
//            System.out.println("Width must greater than 0");
//            return;
//        }
//        this.width = width;
//    }   
//    
//    void setHeight(double height){
//        if (height <= 0){
//            System.out.println("Height must greater than 0");
//            return;
//        }
//        this.height = height;
//    }
    
    @Override
    public void getValue(){
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
    }

    @Override
    public String toString(){
        return String.format("This triangle area is: %.2f", area);
    }
    
//    void getWidth(){
//        System.out.println("Width: "+width);
//    }
//    void getHeight(){
//        System.out.println("Height: "+height);
//    }
}