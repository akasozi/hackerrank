/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.datastructures.primer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author abubizibu
 */
public class CounterTest {
    
    @Test
    public void testIncrement() {
        // TODO review the generated test code and remove the default call to fail.
        Counter counter = new Counter();
        int expected = 1;
        counter.increment();
        int actual = counter.getCount();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetCount() {
        // TODO review the generated test code and remove the default call to fail.
        Counter counter = new Counter(5);
        int expected = 5;
        int actual = counter.getCount();
        assertEquals(expected, actual);
    }
    
     @Test
    public void testReset() {
        // TODO review the generated test code and remove the default call to fail.
        Counter counter = new Counter(5);
        counter.reset();
        int expected = 0;
        int actual = counter.getCount();
        assertEquals(expected, actual);
    }
}
