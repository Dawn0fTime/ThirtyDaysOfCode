package com.dawndemeo.thirtydaysofcode.day09recursion3;

import org.junit.Test;

import static org.junit.Assert.*;

import static com.dawndemeo.thirtydaysofcode.day09recursion3.Solution.factorial;

/**
 * @author dawndemeo
 */
public class SolutionTest {

    @Test
    public void testFactorial() {
        assertEquals(6, factorial(3));
    }
}