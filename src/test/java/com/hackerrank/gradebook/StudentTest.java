/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.gradebook;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author abubizibu
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSetAverage() {
        // TODO review the generated test code and remove the default call to fail.
        Student student = new Student("James", 45.0);
        double expected = 45.0;
        double actual = student.getAverage();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetAverageConditionsAreChecked() {
        // TODO review the generated test code and remove the default call to fail.
        Student student = new Student("James", 130.00);
        double expected = 0.0;
        double actual = student.getAverage();
        assertEquals(expected, actual, 0.001);
    }
    
    @Test
    public void testGetLetterGrade() {
        // TODO review the generated test code and remove the default call to fail.
        Student student = new Student("James", 90.0);
        String expected = "A";
        String actual = student.getLetterGrade();
        assertEquals(expected, actual);
    }
}
