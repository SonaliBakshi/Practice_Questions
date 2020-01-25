package com.in;
import java.util.*;
public class ReverseSingleyLinkedList {
    Node head;
    public static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
        }
    }
    public static ReverseSingleyLinkedList insert(ReverseSingleyLinkedList li,int data)
    {
        Node newNode=new Node(data);
        newNode.next=null;
        if(li.head == null)
        {
            li.head=newNode;
        }
        else
        {
            Node last=li.head;
            while(last.next  !=null)
            {
                last=last.next;
            }
            last.next=newNode;
        }
        return li;
    }
   

    public static void  reverse(Node temp)
    {
        if(temp.next !=null){
            reverse(temp.next);
            System.out.print(temp.data+"->");
        }
        else
        System.out.print(temp.data+"->");
    }
    
   
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
        ReverseSingleyLinkedList li=new ReverseSingleyLinkedList();
       System.out.println("Enter the number of elements");
       int n=s.nextInt();
       System.out.println("enter the elements");
       if(n==0)
       {
    	   System.out.println("null");
       }
       else
       {
    	   for(int i=0;i<n;i++)
    	   {
    		   insert(li,s.nextInt());
    	   }
    	   li.reverse(li.head);
    	   System.out.println("null");
       }
    }
   
}

	
	

  
