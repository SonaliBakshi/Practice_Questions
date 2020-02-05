package com;
import java.util.Scanner;
public class PhoneBook {
	Node head;
	static class Node{
		int data;
		String name;
		Node next;
		Node(String naame,int temp)
		{
			name=naame;
			data=temp;
			
		}
	}
	public static PhoneBook Insert(PhoneBook li,String name,int data)
	{
		Node newnode=new Node(name,data);
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
	public static void findNumber(PhoneBook li,String naam)
	{
		int flag=0;
		Node temp=li.head;
		while(temp!=null)
		{
				if(temp.name.equals(naam))
				{
				System.out.println(temp.name+" = "+ temp.data);
				flag=0;
				break;
				}
				else {
					flag=1;
				}
			temp=temp.next;	
		}
		if(flag==1)
		{
			System.out.println("Not found");
		}
	
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		PhoneBook li=new PhoneBook();
		System.out.println("Enter the number of enteries:- ");
		int n=s.nextInt();
		System.out.println("Enter the Name and the Phone number");
		
		for(int i=0;i<n;i++)
		{
			String naam=s.next();
			int number=s.nextInt();
			li.Insert(li,naam,number);
		}
		System.out.println("Enter the number of person you want to find");
		int a=s.nextInt();
		System.out.println("Enter the name whose number you want to find");
		for(int i=0;i<a;i++)
		findNumber(li,s.next());
	}
}
