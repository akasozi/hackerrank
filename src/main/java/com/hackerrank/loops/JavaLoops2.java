/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.loops;

/**
 *
 * @author abubizibu
 * 
 * we use integers a, b and n to create the following series
 * (a + 20.b), (a + 20.b + 2(1).b), (a + 2(0).b + 2(1).b + 2(2).b)...
 * you are given queries in the form of a, b, n for each query, print the 
 * series corresponding to the given integer a, b and n values as a single line
 * of n space-separated integers;
 * for each query print the corresponding series on a new line
 */

import java.util.Scanner;

public class JavaLoops2 {
 
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt(); // number of queries
        
        for (int i = 0; i < q; i++) {
           int a = scan.nextInt();
           int b = scan.nextInt();
           int n = scan.nextInt();
        
           for (int j = 0; j < n; j++) { // Solution for each query
                int tempAnswer = 0;
                for (int k = 0; k <= j; k++) {
                    tempAnswer = tempAnswer + (int)(Math.pow(2.0, k)*b);
                }
                tempAnswer+=a;
                System.out.print(tempAnswer + " ");
           }
           System.out.println("\n"); 
        }
        
    }
}
