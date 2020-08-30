package com.dawndemeo.thirtydaysofcode.day25runningtimeandcomplexity;

import java.io.*;
import java.util.*;

/**
 * @author dawndemeo
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int testCases = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < testCases; i++) {

            int numberToTest = Integer.parseInt(scanner.nextLine());
            if (isPrime(numberToTest)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }

        }

    }

    private static boolean isPrime(int numberToTest) {

        if (numberToTest == 1) {
            return false;
        }

        if (numberToTest <= 3) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(numberToTest); i++) {
            if (numberToTest % i == 0) {
                return false;
            }
        }
        return true;
    }

}
