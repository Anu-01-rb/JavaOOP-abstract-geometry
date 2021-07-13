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
    private String type;
    private double area;
    
    void setType(String type){
        this.type = type;
    }
    
    void setArea(double area){
        this.area = area;
    }
    
    void setValue(){
        System.out.println("Please enter type of geometry");
    }
    
    public void getValue(){
        System.out.println((type == "")? "Please enter type of geometry" : "Please set value first");
    }
    
    @Override
    public String toString(){
        return (type == "Square")? String.format("This square area is: %.2f", area) : 
                (type == "Circle")? String.format("This circle area is: %.2f", area):
                (type == "Triangle")? String.format("This triangle area is: %.2f", area):
                "Data doesn't exist";
    }
}

class Circle extends Geometry{
    private double radius;
    private final double pi = 22.0/7;
    
    Circle(){
        setType("Circle");
    }
    
    public void getValue(){
        System.out.println("Radius: "+radius);
    }
    
    public void setValue(double radius){
        if (radius <= 0){
            System.out.println("Radius must greater than 0");
            return;
        }
        this.radius = radius;
        setArea(Math.pow(this.radius, pi));
    }
    
//    public void setRadius(double radius){
//        if (radius <= 0){
//            System.out.println("Radius must greater than 0");
//            return;
//        }
//        this.radius = radius;
//        setArea(Math.pow(this.radius, pi));
//    }
}

class Square extends Geometry{
    private double length;
    
    Square(){
        setType("Square");
    }
    
    public void getValue(){
        System.out.println("Length: "+length);
    }
    
//    void getLength(){
//        System.out.println("Length: "+length);
//    }
    
    public void setValue(double len){
        if (len <= 0){
            System.out.println("Length must greater than 0");
            return;
        }
        this.length = len;
        setArea(this.length * this.length);
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
    private final double fml = 0.5;
    
    Triangle(){
        setType("Triangle");
    }
    
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
    public void getValue(){
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
    }
    
//    void getWidth(){
//        System.out.println("Width: "+width);
//    }
//    void getHeight(){
//        System.out.println("Height: "+height);
//    }
}