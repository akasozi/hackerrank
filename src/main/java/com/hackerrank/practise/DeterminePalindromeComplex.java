/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.practise;

/**
 *
 * @author abubizibu
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeterminePalindromeComplex {
    
    public static void main(String[] args) {
        // write a function when given a string,it returns true if it is a palindrome, or 
        // false otherwise.
        System.out.print("Enter a sentence: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        System.out.println();
        if (isPalindrome(input))
            System.out.printf("The word %s is a palindrome%n", input);
        else 
            System.out.printf("The word %s is NOT a palindrome%n", input);
    }
    
     public static boolean isPalindrome(String word) {
            
        char[] punctuations = {'?', ' ', '\'', '!', '\"', '-', '.', ',', ' '};
        StringBuilder sb = new StringBuilder();
        String sentence = "";
        // perform basic validation
        if (word.isEmpty() || word == null || word.length() == 0 ||
                word.length() == 1)
            return false;
        
        
        for (int i = 0; i < word.length(); i++) {
            char cur = word.charAt(i);
            boolean skip = false;
            for (char white : punctuations) {
                 if (cur == white)
                     skip = true;
            }
            if (!skip) {
                if (Character.isLetter(cur))
                   sb.append(cur);
            }
        }
         System.out.println("xxx sentence :  " + sb.toString());
        // convert the whole word to lowercase
        word = sb.toString().toLowerCase();
        
        
        int left = 0;
        int right = word.length() - 1;
        
        while(left < right) {
            
             if (word.charAt(left) != word.charAt(right))
                 return false;
             left++;
             right--;
        }
        return true;
        
    } 
}
