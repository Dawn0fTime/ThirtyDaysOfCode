package com.dawndemeo.thirtydaysofcode.day06letsreview;

import java.io.*;
import java.util.*;

/**
 * @author dawndemeo
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < testCases; i++) {
            String string = scanner.next();
            StringBuilder evenChars = new StringBuilder();
            StringBuilder oddChars = new StringBuilder();

            for (int j = 0; j < string.length(); j++) {
                if (j % 2 == 0) {
                    evenChars.append(string.charAt(j));
                } else {
                    oddChars.append(string.charAt(j));
                }
            }

            output.append(evenChars).append(" ").append(oddChars).append("\n");
        }

        System.out.println(output);
        scanner.close();
    }
}

