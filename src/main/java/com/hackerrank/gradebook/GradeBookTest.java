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

import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeBookTest {
 
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int total = 0;
        
        while(counter <= 10) {
            boolean isWrong = true;
            while(isWrong) { // Assume wrong input
               System.out.printf("Enter score for student %d between 0 and 100: ", counter);
               int score = 0;
               try {
                   score = scanner.nextInt();
                   if (score >= 0 && score <= 100) {
                      // set the score
                      total = total + score;
                      isWrong = false;
                    } else {
                       System.out.printf("Incorrect input enter a score for student %d between 0 and 100: ", counter);  
                       score = scanner.nextInt();
                       if (score >= 0 && score <= 100) {
                           total = total + score;
                           isWrong = false;
                       }    
                    }
               } catch(InputMismatchException ex) {
                    System.err.println("ERROR: Your entered a value that is Not a valid Integer: Type 'OK' to Continue");
                    String FLAG = scanner.nextLine();
                    while(!FLAG.equalsIgnoreCase("OK")) {
                        System.err.print("Enter 'OK' to continue: ");
                        FLAG = scanner.nextLine();
                    } 
               }
            }  
            counter++;
        }
        int average = (total / 10);
        System.out.printf("The total score for %d students is: %d%n", 10, total);
        System.out.printf("The average score for these students is: %d%n", average);
    }
    
}
