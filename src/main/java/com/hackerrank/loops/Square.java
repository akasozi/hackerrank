/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.loops;

/**
 *
 * @author abubizibu
 */
public class Square {
    
    private double len; 
    
    public Square(double len) { 
       this.len = len;
    }
    public double area() {
       return (this.len * this.len);
    }
    
    public void setSideLength(double len) {
        this.len = len;
    }
}
