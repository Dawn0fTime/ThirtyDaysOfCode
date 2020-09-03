package com.dawndemeo.thirtydaysofcode.day29bitwiseand;

import static org.junit.Assert.*;
import static com.dawndemeo.thirtydaysofcode.day29bitwiseand.Solution.maxValueAB;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void sample1() {
        int n = 5;
        int k = 2;
        
        assertEquals(1, maxValueAB(n, k));
    }

    @Test
    public void sample2() {
        int n = 8;
        int k = 5;
        
        assertEquals(4, maxValueAB(n, k));
    }
    
    @Test
    public void sample3() {
        int n = 2;
        int k = 2;
        
        assertEquals(0, maxValueAB(n, k));
    }
}
