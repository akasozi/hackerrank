/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.loops.arrays;

/**
 *
 * @author abubizibu
 */
public class Solution {

    public static void main(String[] args) {
      
        // Two Dimensional array :: An array of one-dimensional arrays
        // A Two dimensional array may be ragged - its arrays may all be different size
        // M x N Two dimensional arrays M - rows, each an array of Length N (N - Columns)
        // a[i][j] = references element in row i, column j
        int M = 10;
        int N = 10;
        int[][] a = new int[M][N];
        
        for (int i = 1; i < M; i++) {
           for (int j = 1; j < N; j++) {
              a[i][j] = i * j;
              System.out.printf("%2d ", a[i][j]);
           }
            System.out.printf("%n");
        }
        
        // Calculate the sum
        int sum = 0;
        for (int i = 0; i < M; i++) {
           for (int j = 0; j < N; j++) {
               int current = a[i][j];
               sum += current;
           }
        }
        
        System.out.printf("Total: %d%n", sum);
        
        // calculate the largest
        int largest = a[1][1];
        
        for (int i = 1; i < M; i++) {
           for (int j = 1; j < N; j++) {
               if (a[i][j] > largest)
                   largest = a[i][j];
           }
        }
        System.out.printf("Largest: %d%n", largest);
        
        // calculate the smallest
        int smallest = a[1][1];
        for (int i = 1; i < M; i++) {
           for (int j = 1; j < N; j++) {
               if (a[i][j] < smallest)
                   smallest = a[i][j];
           }
        }
        System.out.printf("Smallest: %d%n", smallest);
        
        // Calculate the average
        int average = 0;
        for (int i = 1; i < M; i++) {
            
           for (int j = 1; j < N; j++) {
           
           } 
        }
        
        // Arguments are passed by value, You can use argument variables
        // 
        
    }    
}
