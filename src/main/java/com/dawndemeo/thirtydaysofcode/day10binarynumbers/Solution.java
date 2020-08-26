package com.dawndemeo.thirtydaysofcode.day10binarynumbers;

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
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(maxConsecutiveOnes(n));

        scanner.close();
    }

    private static int maxConsecutiveOnes(int n) {

        String binary = Integer.toBinaryString(n);
        int count = 0;
        int max = 0;

        for (int i = 0; i < binary.length(); i++) {
            char digit = binary.charAt(i);

            if (digit == '1') {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }

        return max;
    }
}

