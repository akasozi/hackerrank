/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.gradebook.datatypes;

/**
 *
 * @author abubizibu
 */
import java.util.Scanner;

public class IntegerTypesTest {
    

    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>= Byte.MIN_VALUE && x<= Byte.MAX_VALUE)
                   System.out.println("* byte");
                if (x >=- 32768 && x <= 32767)
                   System.out.println("* short");
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) 
                   System.out.println("* integer");
                if (x  >= Long.MIN_VALUE && x <= Long.MAX_VALUE) 
                   System.out.println("* long");                       
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}


