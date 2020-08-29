package com.dawndemeo.thirtydaysofcode.day24morelinkedlists;

import java.io.*;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }

}

/**
 * @author dawndemeo
 */
class Solution
{

    public static Node removeDuplicates(Node head) {
        //Write your code here

        // empty list doesn't require processing
        if (head == null) {
            return null;
        }

        // create hashset
        // if data doesn't exist in hashset, add it
        // else delete from move pointer to next pointer in list
        Set<Integer> set = new HashSet<>();
        Node currentNode = head;
        Node node = currentNode.next;

        if (node == null) {
            return head;
        }
        set.add(currentNode.data);

        while (node != null) {
            if (set.contains(node.data)) {
               currentNode.next = node.next;
               node = node.next;
            } else {
                set.add(node.data);
                currentNode = node;
                node = node.next;
            }
        }
        return head;
    }

    public static  Node insert(Node head,int data)
    {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}
