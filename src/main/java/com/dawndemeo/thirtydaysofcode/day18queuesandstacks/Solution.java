package com.dawndemeo.thirtydaysofcode.day18queuesandstacks;

import java.util.*;

/**
 * @author dawndemeo
 */
public class Solution {
    // Write your code here.

    Queue<Character> queue = new LinkedList<>();
    Stack<Character> stack = new Stack<>();

    // enqueue each char in s to queue
    private void enqueueCharacter(char c) {
        queue.add(c);
    }

    // push each char in s to stack
    private void pushCharacter(char c) {
        stack.add(c);
    }

    // dequeue each first char in queue
    private char dequeueCharacter() {
        return queue.remove();
    }

    // pop char off stack
    private char popCharacter() {
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

}
