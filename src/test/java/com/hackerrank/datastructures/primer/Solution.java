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
import java.util.Arrays;

public class Solution {
    
    public static void main(String[] arg) {

            String S = "heelloaayyy";
            int[] occurrences = new int[26];

            for (char ch : S.toCharArray()) {
                System.out.println( " RESEARCH a --> "+ch);
                occurrences[ch - 'a']++;
            }
            System.out.println( " RESEARCH a --> "+ Arrays.toString(occurrences));
            char best_char = 'a';
            int best_res = 0;

            for (int i = 0; i < 26; i++) {
                if (occurrences[i] > best_res) {

                best_char = (char)((int)'a' + i);
                best_res = occurrences[i];
                }
            }

            System.out.println(" character " + Character.toString(best_char));
    }
    
}
