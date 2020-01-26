package com;
import java.util.*;
public class PalindromeLinkedList {

	Node head;
	public static class Node
	{
		int data;
		Node next;
		Node(int temp)
		{
			data=temp;
		}
	}
	public static PalindromeLinkedList insert(PalindromeLinkedList li,int data)
	{
		Node newnode= new Node(data);
		newnode.next=null;
		if(li.head==null)
		{
			li.head=newnode;
		}
		else
		{
			Node temp=li.head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newnode;
		}	
		return li;
	}
	public void checkPallindrome(PalindromeLinkedList li)
	{
		int n=0;
		Node temp=li.head;
		while(temp!=null)
		{
			n++;
			temp=temp.next;
		}
		
		int arr[]=new int[n];
		temp=li.head;
		while(temp!=null)
		{
			
			for(int i=0;i<n;i++)
			{
				arr[i]=temp.data;
				temp=temp.next;
			}
		}
		int flag=0;
		for(int i=0;i<=n/2;i++)
		{
			if(arr[i]!=arr[n-i-1])
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Not Palindrome");
		}
	
		else
		{
			System.out.println("Palindrome");
		}
		
		
	}
public static void main(String args[])
{
	PalindromeLinkedList li=new PalindromeLinkedList();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n=s.nextInt();
	System.out.println("Enter the elements");
	for(int i=0;i<n;i++)
	{
		insert(li,s.nextInt());
	}
	li.checkPallindrome(li);
}
	
}
