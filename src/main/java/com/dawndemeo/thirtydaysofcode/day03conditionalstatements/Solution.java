package com.dawndemeo.thirtydaysofcode.day03conditionalstatements;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * @author dawndemeo
 */
public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if (N % 2 == 0) {
            if ((N >=2 && N <= 5) || (N > 20)) {
                System.out.print("Not ");
            }
        }

        System.out.println("Weird");
    }
}

