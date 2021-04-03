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
import java.util.Arrays;
import java.util.Scanner;

public class FairIndex {
 
    public static void main(String[] args) {
    
       int[] A = {4, -1, 0, 3};
       int[] B = {-2, 6, 0, 4 };
       
       int solution = totalFairIndexes(A, B);
       
        System.out.println("Solution: " + solution);
       
               
               
    }
    
    public static int totalFairIndexes(int[] A, int[] B) {
    
        int fairIndexCount = 0;
        int[] indices = new int[10];
        int k = 0;
        if ((A.length != B.length) || A.length == 0 || B.length == 0)
            return fairIndexCount;
        
        for (int i = 1; i < A.length; i++) {
             int sumA = 0;
             int sumB = 0;
             for (int j = 0; j <= i -1; j++) {
                 sumA += A[j];
                 sumB += B[j];
             }
             int sumA1 = 0;
             int sumB1 = 0;
             for (int j = i; j <= A.length - 1; j++) {
                 sumA1 += A[j];
                 sumB1 += A[j];
             }
        
             if ((sumA == sumB)) {
                 if (sumB == sumA1) {
                    if (sumA1 == sumB1) {
                       indices[k++] = i; 
                       fairIndexCount++;
                    }
                 }
             }
        }
        System.out.printf("indices found: %s", Arrays.toString(indices));
        return fairIndexCount;
    }    
}
