/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.gradebook;

/**
 *
 * @author abubizibu
 */
public class Student {
 
    private String name;
    private double average;

    public Student(String name, double average) {
        this.name = name;
        this.setAverage(average);
        // this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverage() {
        return average;
    }

    public String getLetterGrade() {
    
        String lettergrade = "";
        if (average >= 90) {
           lettergrade = "A";
        } else if (average >=80 && average <= 89) {
           lettergrade = "B";
        } else if (average >= 70 && average <= 79) {
            lettergrade = "C";
        } else if (average >= 60 && average <= 69) {
           lettergrade = "D";
        } else {
           lettergrade = "F";
        }
        return lettergrade;
    }
    
    
    public void setAverage(double average) {
        if (average >= 0 && average <= 100)
           this.average = average;
    }
    
    
}
