package com.dawndemeo.thirtydaysofcode.day26nestedlogic;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int returnDay = scanner.nextInt();
		int returnMonth = scanner.nextInt();
		int returnYear = scanner.nextInt();
		
		int dueDay = scanner.nextInt();
		int dueMonth = scanner.nextInt();
		int dueYear = scanner.nextInt();
		
		System.out.println(lateFee(returnDay, returnMonth, returnYear, dueDay, dueMonth, dueYear));
		

		scanner.close();
	}

	public static int lateFee(int returnDay, int returnMonth, int returnYear, int dueDay, int dueMonth,
			int dueYear) {
		
		if (returnYear < dueYear) {
			return 0;
		}
		
		if (returnYear <= dueYear) {
			
			if (returnMonth <= dueMonth) {
				
				if (returnDay <= dueDay) {
					// if due on time, no late fee
					return 0;
				} else {
					// if late but same month and year, days late * 15
					return (returnDay - dueDay) * 15;
				}
			
			} else {
				// if late and different month but same year, months late * 500
				return (returnMonth - dueMonth) * 500;
			}
			
		} else {
			// if late and different year, 10_000
			return 10_000;
		}
		

	}

}
