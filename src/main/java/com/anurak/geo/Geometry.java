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
abstract class Geometry{
    
    void setValue(double radius){}
    void setValue(double width, double height){}
    void getValue(){}
    
    @Override
    public String toString(){
        return "The data is empty";
    }
}





