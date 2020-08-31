package com.dawndemeo.thirtydaysofcode.day26nestedlogic;

import static org.junit.Assert.*;
import static com.dawndemeo.thirtydaysofcode.day26nestedlogic.Solution.lateFee;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testLateFee1() {
		int returnDay = 9;
		int returnMonth = 6;
		int returnYear = 2015;
		int dueDay = 6;
		int dueMonth = 6;
		int dueYear = 2015;
		
		assertEquals(45, lateFee(returnDay, returnMonth, returnYear, dueDay, dueMonth, dueYear));
	}
	
	@Test
	public void testLateFee2() {
		int returnDay = 31;
		int returnMonth = 12;
		int returnYear = 2009;
		int dueDay = 1;
		int dueMonth = 1;
		int dueYear = 2010;
		
		assertEquals(0, lateFee(returnDay, returnMonth, returnYear, dueDay, dueMonth, dueYear));
	}

}
