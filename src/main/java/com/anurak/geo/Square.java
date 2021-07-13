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
class Square extends Geometry{
    private double length;
    private double area;
    
    @Override
    public void getValue(){
        System.out.println("Length: "+length);
    }
    
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
}
