package com;
import java.util.Scanner;
public class ReverseWords {
	public static void Reverse(String st)
	{
			String arr[]=st.split("\\.");
			for(int i=arr.length-1; i>0;i--)
			{
				System.out.print(arr[i]+".");
			}
			System.out.println(arr[0]);
	}
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int t;
	String st;
	t=s.nextInt();
	for(int i=0;i<t;i++)
	{
		st=s.next();
		Reverse(st);
	}
	
	}

}
