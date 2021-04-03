/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.loops;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author abubizibu
 */
public class SquareTest {

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }
    
    @Test
    void testArea() {
         Square square = new Square(2);
         double expected = 4;
         double actual = square.area();
         Assertions.assertEquals(expected, actual, 0.0001);
    }
    
    @Test
    void testSetSideLength() {
         Square square = new Square(2);
         square.setSideLength(4);
         double expected = 16;
         double actual = square.area();
         Assertions.assertEquals(expected, actual, 0.0001); 
    }
}
