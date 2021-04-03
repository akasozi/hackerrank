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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scan.nextInt();
        List<Student> database = new ArrayList<>();
        // Read the leftover new line
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter name for student number %d: ", i+1);
            String name = scan.nextLine();
            System.out.printf("Enter marks for student number %d: ", i+1);
            double marks = scan.nextDouble();
            // Read the leftover new line
            scan.nextLine();
            Student student = new Student(name, marks);
            database.add(student);
        }
        
        for (Student student : database) {
            System.out.printf("%-15s%s%n", student.getName(), student.getLetterGrade());
        }
    }
}
