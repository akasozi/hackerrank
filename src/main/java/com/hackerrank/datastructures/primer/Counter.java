/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.datastructures.primer;

/**
 *
 * @author abubizibu
 */
public class Counter {
    
    private int count;
    
    public Counter() {
    
    }
    
    public Counter(int initial) {
       this.count = initial;
    }
    
    public void increment() {
       count++;
    }
    
    public void increment(int delta) {
       count += delta;
    }
    
    public void reset() {
       count = 0;
    }
    
    public int getCount() {
       return this.count;
    }
}
