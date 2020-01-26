package com;
import java.util.*;
public class RemoveDulpicateLinkList {
	Node head;
	public static class Node{
		Node next;
		int data;
		Node(int temp)
		{
			data=temp;
		}
	}
	public static RemoveDulpicateLinkList insert( RemoveDulpicateLinkList li,int data)
	{
		Node newnode= new Node(data);
		newnode.next=null;
		if(li.head == null)
		{
			li.head=newnode;
		}
		else
		{
			Node last=li.head;
			while(last.next!=null)
			{
				last=last.next; 
			}	
			last.next=newnode;
		}
		return li;
	}
	public void deleteDuplicate(RemoveDulpicateLinkList li)
	{
		Node temp=li.head;
		while(temp.next!=null)
		{
			if(temp.data==temp.next.data)
			{
				temp.next=temp.next.next;
			}
			else
			{
				temp=temp.next;
			}
		}
		
	}
	public void display(RemoveDulpicateLinkList li)
	{
		Node temp=li.head;
		while (temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String args[])
	{
		RemoveDulpicateLinkList li=new RemoveDulpicateLinkList();
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the number of elements");
			int n=s.nextInt();
			System.out.println("Enter the elements in ascending order");
			for(int i=0;i<n;i++)
			{
				insert(li,s.nextInt());
			}
			li.deleteDuplicate(li);
			li.display(li);
	}

}
